from flask import Flask, render_template

app = Flask(__name__)

# Define template inline in Python file
home_page = """
<!DOCTYPE html>
<html>
<head>
    <title>{{ title }}</title>
</head>
<body>
    <h1>{{ heading }}</h1>
    <p>{{ content }}</p>
</body>
</html>
"""

# This should NOT report Template Not Found because home_page is an inline template
def index():
    return render_template("home_page", title="Hello", heading="Welcome", content="Test")

# This should report Template Not Found (no matching inline var)
def missing():
    return render_template("truly_missing.html", name="test")

# Class with inline template and render_template
class PageRenderer:
    page_template = """
    <div class="page">
        <h2>{{ page_title }}</h2>
        <p>{{ page_body }}</p>
    </div>
    """

    def render_page(self):
        return render_template("page_template", page_title="About", page_body="Some text")

    def render_other(self):
        return render_template("other_page.html", data="stuff")

if __name__ == "__main__":
    app.run(debug=True)
