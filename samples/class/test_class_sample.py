from flask import Flask, render_template

app = Flask(__name__)

class Product:
    discount = 0.1

    def __init__(self, name, price):
        self.name = name
        self.price = price

    def get_discounted_price(self):
        return self.price

class ShoppingCart:
    items = []

    def add_item(self, item):
        items.append(item)

    def total_items(self):
        return len(items)

class Store:
    name = "MyStore"

    def __init__(self):
        self.products = []

    def add_product(self, name, price):
        new_product = Product(name, price)
        self.products.append(new_product)

    def show_home(self):
        return render_template("home.html")

def run():
    cart = ShoppingCart()
    cart.add_item("item1")
    cart.add_item("item2")
    print(cart.total_items())
