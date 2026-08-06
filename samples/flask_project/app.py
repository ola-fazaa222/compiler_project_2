from flask import Flask, render_template, redirect, url_for, request

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
