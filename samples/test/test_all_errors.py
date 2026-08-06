from flask import Flask, render_template, request

# Error 8: Duplicate function declaration (handled by visitors)
def duplicate_func():
    return 1

def duplicate_func():
    return 2

# Error 1: Variable used before defined
undefined_function(undefined_var)

# Error 14: Infinite recursion
def infinite_rec():
    return infinite_rec()

# Error 9: Wrong argument count
def add(a, b):
    return 1

result = add(5)

# Error 12: Unreachable code
def unreachable():
    return 1
    print("test")

# Error 13: Variable used before initialization
def before_init():
    print(z)
    z = 10

# Error 7: Type mismatch (string + number)
def type_mismatch():
    age = "20"
    age + 5

# Error 10: Template not found
def template_error():
    return render_template("nonexistent.html")
