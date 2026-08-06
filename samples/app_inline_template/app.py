from flask import Flask, render_template, redirect, url_for, request
from jinja2 import DictLoader

# =========================================
# GLOBAL SCOPE
# =========================================
app = Flask(__name__)
products = []
counter = 0


# =========================================
# ALL FUNCTIONS DEFINED FIRST
# (to avoid forward-reference issues in semantic analysis)
# =========================================

# ---- NESTED FUNCTION SCOPE ----
def find_product(product_id):
    product = next((p for p in products if p["id"] == product_id), None)
    return product


class ProductService:
    tax_rate = 0.08

    def create(self, name, price,description,specification,img):
        return {"id": 1, "name": name, "price": price,"description":description,"specification":specification,"img":img}

    def total_with_tax(self, price):
        return 100

    def apply_discount(self):
        def capped():
            return 50
        return 99


# ---- INLINE TEMPLATES (template scope) ----
BASE_HTML = """
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Manager</title>
    <link rel="stylesheet" href="{{ url_for('static', filename='styles.css') }}">
</head>

<body>
    <header>
        <h1>Product Manager</h1>
        <nav>
            <a href="{{ url_for('index') }}">Home</a>
            <a href="{{ url_for('add_product') }}">Add Product</a>
        </nav>
    </header>

    <main>
        {% block content %}{% endblock %}
    </main>
</body>

</html>
"""
INDEX_HTML = """
{% extends 'base.html' %}
{% block content %}
<h2>All Products</h2>
<div class="product-grid">
    {% for p in products %}
    <div class="product-card">
        <img src="{{ p.img }}" alt="product image">
        <h3>{{ p.name }}</h3>
        <p class="price">${{ p.price }}</p>
        <a class="btn" href="{{ url_for('detail', product_id=p.id) }}">View</a>
        <a class="btn delete" href="{{ url_for('delete', product_id=p.id) }}">Delete</a>
    </div>
    {% endfor %}
    {% if products|length == 0 %}
    <p>No products yet. Add one!</p>
    {% endif %}
</div>
{% endblock %}
"""
ADD_HTML = """
{% extends 'base.html' %}
{% block content %}
<h2>Add Product</h2>
<form method="POST" class="form">
    <label>Name</label>
    <input type="text" name="name" required>


    <label>Price</label>
    <input type="number" name="price" required>


    <label>Description</label>
    <textarea name="description" required></textarea>


    <label>Specification</label>
    <textarea name="specification" required></textarea>

    <label>Image URL (local path)</label>
    <input type="text" name="img" placeholder="/static/images/example.png">

    <button type="submit" class="btn">Add</button>
</form>
{% endblock %}
"""
DETAIL_HTML = """
{% extends 'base.html' %}
{% block content %}
<div class="detail-container">
    <img class="big-img" src="{{ url_for('static', filename=product.img.split('static/')[-1]) }}" alt="product image">


    <div class="info">
        <h2>{{ product.name }}</h2>
        <p class="price">${{ product.price }}</p>

        <h3>Description</h3>
        <p>{{ product.description }}</p>


        <h3>Specifications</h3>
        <p>{{ product.specification }}</p>


        <a class="btn delete" href="{{ url_for('delete', product_id=product.id) }}">Delete Product</a>
    </div>
</div>
{% endblock %}
"""

app.jinja_loader = DictLoader({
    "base.html": BASE_HTML,
    "index.html": INDEX_HTML,
    "add.html": ADD_HTML,
    "detail.html": DETAIL_HTML,
})


# =========================================
# GLOBAL FUNCTION SCOPE (routes)
# =========================================

@app.route("/")
def index():
    return render_template("index.html", products=products)


@app.route("/product/<int:product_id>")
def detail(product_id):
    p = find_product(product_id)
    return render_template("detail.html", product=p)


@app.route("/add", methods=["GET", "POST"])
def add_product():
    if request.method == "POST":
        name = request.form.get("name")
        price = request.form.get("price")
        description = request.form.get("description")
        specification= request.form.get("specification")
        img = request.form.get("img")
        obj = ProductService()
        product = obj.create(name, price,description,specification,img)
        global counter
        counter = counter + 1
        products.append(product)
        return redirect(url_for("index"))
    return render_template("add.html")


# =========================================
# GLOBAL KEYWORD SCOPE
# =========================================

@app.route("/delete/<int:product_id>")
def delete(product_id):
    global products
    products = []
    return redirect(url_for("index"))


if __name__ == "__main__":
    app.run(debug=True)
