from flask import Flask, render_template, request, redirect, url_for
from products_generated import ProductManager
app = Flask(__name__)
manager = ProductManager()
@app.route("/")
def index():
    products = manager.get_all_products()
    return render_template('index.html', products=products)

@app.route('/add', methods=['GET', 'POST'])
def add_product():
    if request.method == 'POST':
        image = request.form['image']
        name = request.form['name']
        price = request.form['price']
        details = request.form['details']
        manager.add_product(image, name, price, details)
        return redirect(url_for("index"))

    return render_template("add_product.html")

@app.route("/details/<int:product_id>")
def details(product_id):
    product = manager.get_product(product_id)
    print(product.image)
    return render_template('details.html', product=product)

@app.route("/delete/<int:product_id>")
def delete_product(product_id):
    manager.delete_product(product_id)
    return redirect(url_for("index"))

if __name__ == '__main__':
    app.run(debug=True)


