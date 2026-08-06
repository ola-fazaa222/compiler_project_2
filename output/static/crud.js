var CrudManager = {
    STORAGE_KEY: 'products',
    defaultProducts: [],

    setDefaults: function(products) {
        this.defaultProducts = products || [];
    },

    isValidProduct: function(p) {
        if (!p || !p.id) return false;
        var n = (p.name || '').trim();
        var d = (p.details || p.description || '').trim();
        var i = (p.image_filename || '').trim();
        return (n.length > 0 || d.length > 0 || i.length > 0);
    },

    getProducts: function() {
        var data = localStorage.getItem(this.STORAGE_KEY);
        if (!data) return [];
        try { return JSON.parse(data); } catch(e) { return []; }
    },

    saveProducts: function(products) {
        localStorage.setItem(this.STORAGE_KEY, JSON.stringify(products));
    },

    readDOMProducts: function() {
        var domProducts = [];
        var cards = document.querySelectorAll('[data-product-id]');
        cards.forEach(function(card) {
            var imgVal = card.getAttribute('data-product-image') || '';
            if (imgVal.indexOf('/') !== -1) imgVal = imgVal.split('/').pop();
            domProducts.push({
                id: card.getAttribute('data-product-id'),
                name: card.getAttribute('data-product-name') || '',
                price: parseFloat(card.getAttribute('data-product-price')) || 0,
                details: card.getAttribute('data-product-details') || '',
                image_filename: imgVal
            });
        });
        if (domProducts.length === 0) {
            var fallback = document.querySelectorAll('.products-container .card, .product-grid .product-card');
            fallback.forEach(function(card) {
                if (card.querySelector('[data-product-id]')) return;
                var imgEl = card.querySelector('img');
                var imgSrc = imgEl ? imgEl.getAttribute('src') || '' : '';
                var imgFile = imgSrc.indexOf('/') !== -1 ? imgSrc.split('/').pop() : imgSrc;
                var h3 = card.querySelector('h3, h5, h5.card-title');
                var priceEl = card.querySelector('.price, .price-tag');
                var priceText = priceEl ? priceEl.textContent.replace(/[^0-9.]/g, '') : '0';
                var link = card.querySelector('a[href*="product_detail"], a[href*="details"]');
                var href = link ? link.getAttribute('href') || '' : '';
                var idMatch = href.match(/id=(\d+)/);
                var cardId = idMatch ? idMatch[1] : '';
                if (!cardId) return;
                domProducts.push({
                    id: cardId,
                    name: h3 ? h3.textContent.trim() : '',
                    price: parseFloat(priceText) || 0,
                    details: '',
                    image_filename: imgFile
                });
            });
        }
        return domProducts;
    },

    initFromDOM: function() {
        var domProducts = this.readDOMProducts();
        if (domProducts.length === 0) return;
        var existing = this.getProducts();
        var existingMap = {};
        existing.forEach(function(p) { existingMap[p.id] = p; });
        var domIds = {};
        domProducts.forEach(function(p) {
            existingMap[p.id] = p;
            domIds[p.id] = true;
        });
        var merged = [];
        domProducts.forEach(function(p) { merged.push(p); });
        existing.forEach(function(p) {
            if (!domIds[p.id]) merged.push(p);
        });
        this.saveProducts(merged);
    },

    syncAndRender: function(containerId) {
        var self = this;
        var domProducts = this.readDOMProducts();
        if (domProducts.length > 0) {
            var existing = this.getProducts();
            var existingMap = {};
            existing.forEach(function(p) { if (self.isValidProduct(p)) existingMap[p.id] = p; });
            var domIds = {};
            domProducts.forEach(function(p) {
                existingMap[p.id] = p;
                domIds[p.id] = true;
            });
            var merged = [];
            domProducts.forEach(function(p) { merged.push(p); });
            existing.forEach(function(p) {
                if (!domIds[p.id] && self.isValidProduct(p)) merged.push(p);
            });
            this.saveProducts(merged);
        }
        var dirty = sessionStorage.getItem('crud_dirty');
        if (dirty) {
            sessionStorage.removeItem('crud_dirty');
            this.renderProductCards(containerId);
        } else if (domProducts.length === 0) {
            var stored = this.getProducts();
            var validStored = stored.filter(function(p) { return self.isValidProduct(p); });
            if (validStored.length !== stored.length) this.saveProducts(validStored);
            if (validStored.length > 0) {
                this.renderProductCards(containerId);
            } else if (this.defaultProducts.length > 0) {
                var validDefaults = this.defaultProducts.filter(function(p) { return self.isValidProduct(p); });
                if (validDefaults.length > 0) {
                    this.saveProducts(validDefaults.slice());
                    this.renderProductCards(containerId);
                }
            }
        }
    },

    nextId: function() {
        var products = this.getProducts();
        var maxId = 0;
        products.forEach(function(p) {
            var num = parseInt(p.id);
            if (!isNaN(num) && num > maxId) maxId = num;
        });
        return String(maxId + 1);
    },

    addProduct: function(data) {
        var products = this.getProducts();
        var newProduct = {
            id: this.nextId(),
            name: data.name || '',
            price: parseFloat(data.price) || 0,
            details: data.details || data.description || '',
            image_filename: data.image || data.img || '',
            description: data.description || '',
            specification: data.specification || ''
        };
        products.push(newProduct);
        this.saveProducts(products);
        return newProduct;
    },

    getProduct: function(id) {
        var products = this.getProducts();
        for (var i = 0; i < products.length; i++) {
            if (products[i].id === id) return products[i];
        }
        return null;
    },

    updateProduct: function(id, data) {
        var products = this.getProducts();
        for (var i = 0; i < products.length; i++) {
            if (products[i].id === id) {
                products[i].name = data.name || products[i].name;
                products[i].price = parseFloat(data.price) || products[i].price;
                products[i].details = data.details || data.description || products[i].details;
                products[i].description = data.description || products[i].description;
                products[i].specification = data.specification || products[i].specification;
                if (data.image || data.img) products[i].image_filename = data.image || data.img;
                this.saveProducts(products);
                return products[i];
            }
        }
        return null;
    },

    deleteProduct: function(id) {
        var products = this.getProducts();
        var filtered = [];
        for (var i = 0; i < products.length; i++) {
            if (products[i].id !== id) filtered.push(products[i]);
        }
        this.saveProducts(filtered);
        return filtered.length < products.length;
    },

    collectFormData: function(form) {
        var data = {};
        for (var i = 0; i < form.elements.length; i++) {
            var el = form.elements[i];
            var key = el.name || '';
            if (!key && el.id) {
                key = el.id.replace(/^(add-|edit-)/, '');
            }
            if (key) data[key] = el.value;
        }
        return data;
    },

    renderProductCards: function(containerId) {
        var container = document.getElementById(containerId);
        if (!container) return;
        var products = this.getProducts();
        var self = this;
        products = products.filter(function(p) {
            return self.isValidProduct(p);
        });
        container.innerHTML = '';
        if (products.length === 0) {
            return;
        }
        var isGrid = container.classList.contains('product-grid');
        var html = '';
        for (var i = products.length - 1; i >= 0; i--) {
            var p = products[i];
            var dpAttrs = ' data-product-id="' + p.id + '" data-product-name="' + (p.name || '').replace(/"/g, '&quot;') + '" data-product-price="' + p.price + '" data-product-details="' + (p.details || '').replace(/"/g, '&quot;') + '" data-product-image="' + (p.image_filename || '') + '"';
            if (isGrid) {
                var imgSrc = p.image_filename ? ('static/uploads/' + p.image_filename) : '';
                html += '<div class="product-card"' + dpAttrs + '>' +
                    (imgSrc ? '<img src="' + imgSrc + '" alt="product image" onerror="this.onerror=null;this.src=\'static/images/' + p.image_filename + '\';" />' : '') +
                    '<h3>' + p.name + '</h3>' +
                    '<p class="price">$' + (typeof p.price === 'number' ? p.price.toFixed(2) : p.price) + '</p>' +
                    '<a class="btn" href="product_detail.html?id=' + p.id + '">View</a> ' +
                    '<a class="btn delete" href="#" onclick="CrudManager.handleDelete(\'' + p.id + '\'); return false;">Delete</a>' +
                    '</div>';
            } else {
                var imgHtml = p.image_filename
                    ? '<img src="static/uploads/' + p.image_filename + '" alt="' + p.name + '" class="product-img mb-3" onerror="this.onerror=null;this.src=\'static/images/' + p.image_filename + '\';" />'
                    : '<div class="product-img bg-light d-flex align-items-center justify-content-center mb-3"><i class="fas fa-image fa-4x text-secondary"></i></div>';
                var shortDetails = p.details && p.details.length > 100 ? p.details.substring(0, 100) + '...' : (p.details || '');
                html += '<div class="col-md-4 col-lg-3 mb-4">' +
                    '<div class="card h-100"' + dpAttrs + '>' +
                    '<div class="card-body text-center">' + imgHtml +
                    '<h5 class="card-title">' + p.name + '</h5>' +
                    '<p class="price-tag">$' + (typeof p.price === 'number' ? p.price.toFixed(2) : p.price) + '</p>' +
                    '<p class="card-text text-muted">' + shortDetails + '</p>' +
                    '<div class="btn-group w-100" role="group">' +
                    '<a href="product_detail.html?id=' + p.id + '" class="btn btn-sm btn-outline-primary"><i class="fas fa-eye"></i> Details</a> ' +
                    '<a href="#" class="btn btn-sm btn-outline-danger" onclick="CrudManager.handleDelete(\'' + p.id + '\'); return false;"><i class="fas fa-trash"></i> Delete</a>' +
                    '</div></div></div></div>';
            }
        }
        container.innerHTML = html;
    },

    renderProductDetail: function(containerId) {
        var container = document.getElementById(containerId);
        if (!container) return;
        var params = new URLSearchParams(window.location.search);
        var id = params.get('id');
        if (!id) { container.innerHTML = '<p>Product not found</p>'; return; }
        var p = this.getProduct(id);
        if (!p || !this.isValidProduct(p)) { container.innerHTML = '<p>Product not found</p>'; return; }
        var isFlexDetail = container.classList.contains('detail-container') || container.classList.contains('details-card');
        if (isFlexDetail) {
            var imgSrc = p.image_filename ? 'static/uploads/' + p.image_filename : '';
            container.innerHTML = (imgSrc ? '<img class="big-img" src="' + imgSrc + '" alt="product image" onerror="this.onerror=null;this.src=\'static/images/' + p.image_filename + '\';">' : '') +
                '<div class="info">' +
                '<h2>' + p.name + '</h2>' +
                '<p class="price">$' + (typeof p.price === 'number' ? p.price.toFixed(2) : p.price) + '</p>' +
                '<h3>Description</h3><p>' + (p.description || p.details || '') + '</p>' +
                '<h3>Specifications</h3><p>' + (p.specification || '') + '</p>' +
                '<a class="btn" href="edit_product.html?id=' + p.id + '">Edit</a> ' +
                '<a class="btn delete" href="#" onclick="CrudManager.handleDelete(\'' + p.id + '\'); return false;">Delete Product</a>' +
                '</div>';
        } else {
            var imgHtml = p.image_filename
                ? '<img src="static/uploads/' + p.image_filename + '" class="product-img mb-3" alt="' + p.name + '" onerror="this.onerror=null;this.src=\'static/images/' + p.image_filename + '\';" />'
                : '<div class="product-img bg-light d-flex align-items-center justify-content-center mb-3"><i class="fas fa-image fa-4x text-secondary"></i></div>';
            container.innerHTML = '<div class="row"><div class="col-md-6 text-center">' + imgHtml +
                '</div><div class="col-md-6"><h2>' + p.name + '</h2>' +
                '<p class="price-tag">$' + (typeof p.price === 'number' ? p.price.toFixed(2) : p.price) + '</p>' +
                '<p>' + (p.details || '') + '</p>' +
                '<div class="btn-group w-100">' +
                '<a href="edit_product.html?id=' + p.id + '" class="btn btn-warning"><i class="fas fa-edit"></i> Edit</a> ' +
                '<a href="#" class="btn btn-danger" onclick="CrudManager.handleDelete(\'' + p.id + '\'); return false;"><i class="fas fa-trash"></i> Delete</a> ' +
                '<a href="index.html" class="btn btn-secondary"><i class="fas fa-arrow-right"></i> Back</a></div></div></div>';
        }
    },

    populateEditForm: function() {
        var params = new URLSearchParams(window.location.search);
        var id = params.get('id');
        if (!id) return;
        var p = this.getProduct(id);
        if (!p) return;
        var fields = { 'edit-name': p.name, 'edit-price': p.price, 'edit-details': p.details || p.description, 'edit-id': p.id, 'edit-specification': p.specification || '', 'edit-image': p.image_filename || '' };
        for (var key in fields) {
            var el = document.getElementById(key);
            if (el) el.value = fields[key];
        }
    },

    handleAdd: function(e) {
        e.preventDefault();
        var form = e.target;
        var data = this.collectFormData(form);
        this.addProduct(data);
        sessionStorage.setItem('crud_dirty', '1');
        window.location.href = 'index.html';
    },

    handleEdit: function(e) {
        e.preventDefault();
        var form = e.target;
        var data = this.collectFormData(form);
        var id = data.id || (document.getElementById('edit-id') ? document.getElementById('edit-id').value : '');
        if (!id) return;
        this.updateProduct(id, data);
        sessionStorage.setItem('crud_dirty', '1');
        window.location.href = 'product_detail.html?id=' + id;
    },

    handleDelete: function(id) {
        if (!confirm('Are you sure you want to delete this product?')) return;
        this.deleteProduct(id);
        sessionStorage.setItem('crud_dirty', '1');
        window.location.href = 'index.html';
    },

    handleDeleteFromCard: function(el) {
        var card = el.closest('.card') || el.closest('.product-card');
        var id = null;
        if (card) id = card.getAttribute('data-product-id');
        if (!id) { var href = el.getAttribute('href'); if (href) { var m = href.match(/id=([\w-]+)/); if (m) id = m[1]; } }
        if (!id) return;
        this.handleDelete(id);
    }
};
