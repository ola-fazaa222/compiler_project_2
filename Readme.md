# Flask Translator Compiler

![Java](https://img.shields.io/badge/Java-17+-orange)
![Python](https://img.shields.io/badge/Python-3.10+-blue)
![Flask](https://img.shields.io/badge/Framework-Flask-green)
![ANTLR](https://img.shields.io/badge/ANTLR-4.13.2-blue)

## Overview

Flask Translator Compiler is a compiler-like project that analyzes Flask applications (Python + Jinja templates), performs semantic validation, and generates **fully static HTML websites** that run without any backend server.

The generated output is a pure static site where CRUD operations (add, edit, show, delete) work entirely through JavaScript + `localStorage` — no Flask, no Python, no server required. Just open `index.html` in a browser.

---

## How It Works

The project follows a classical compiler pipeline:

```
Flask Source (Python + Jinja)
        |
   Python Parser
        |
   Python AST
        |
   Semantic Analysis
        |
   Context Generation
        |
   Jinja Parser
        |
   Jinja AST
        |
   Template Rendering (variable resolution, loops, conditions)
        |
   HTML Generation + JS CRUD Injection
        |
   Static HTML Output
```

### Stage 1 — Python Processing

- **Python Parser** parses `app.py` into an AST
- **Semantic Analyzer** validates scopes, symbols, variables, functions, and Flask routes
- **Context Generator** extracts runtime data (product lists, dictionaries, variables) from the Python source

### Stage 2 — Jinja Processing

- **Jinja Parser** parses templates (`index.html`, `add_product.html`, etc.) into a Jinja AST
- **Template Renderer** resolves variables, evaluates loops (`{% for %}`), and processes conditions (`{% if %}`)
- **HTML Generator** produces fully rendered static HTML pages with zero remaining `{{ }}` or `{% %}` syntax

### Stage 3 — CRUD JavaScript Injection

- The generator injects a **CRUD JavaScript module** (`crud.js`) into each HTML page
- This module enables add, edit, show, and delete operations using `localStorage` for persistence
- Default products from the Python source are embedded as JS fallback data

---

## Running the Compiler

### Prerequisites

- Java 17 or higher
- ANTLR 4.13.2 (included in `dependencies/`)

### Compile

```bash
cd psychic-broccoli-main
javac -cp "dependencies/antlr-4.13.2-complete.jar;out" -d out -sourcepath src src/app/App.java
```

### Run

```bash
java -cp "out;dependencies/antlr-4.13.2-complete.jar" app.App samples/<sample_name>/app.py
```

Replace `<sample_name>` with one of the available samples (see below).

### Output

Generated files are written to the `output/` directory. Open `output/index.html` in a browser to view the static site.

Compiler reports are written to `compiler_output/`.

---

## Sample Projects

The repository includes three sample Flask applications:

### 1. `product_management` (Arabic)

- Arabic RTL interface with Bootstrap styling
- Pre-loaded with 3 default products (laptop, phone, headphones)
- Images stored in `static/uploads/`
- Templates: `index.html`, `add_product.html`, `edit_product.html`, `product_detail.html`

### 2. `product_manager` (English)

- Simple English interface
- Starts with no products (user adds via form)
- Images stored in `static/images/`
- Templates: `index.html`, `add_product.html`, `edit_product.html`, `product_detail.html`

### 3. `flask_project` (English)

- English interface with product descriptions and specifications
- Starts with no products (user adds via form)
- Uses `ProductService` class for product management
- Templates: `index.html`, `add_product.html`, `edit_product.html`, `product_detail.html`

---

## Generated Output Structure

```
output/
  index.html            # Product listing page
  add_product.html      # Add product form
  edit_product.html     # Edit product form
  product_detail.html   # Product detail view
  base.html             # Base layout (if used)
  static/
    crud.js             # CRUD JavaScript module
    styles.css          # Stylesheets (copied from source)
    images/             # Static images (copied)
    uploads/            # Uploaded images (copied)
```

---

## CRUD JavaScript Module

The generated `crud.js` provides a `CrudManager` object that handles all CRUD operations in the browser:

| Method | Description |
|---|---|
| `syncAndRender(containerId)` | Syncs DOM products with localStorage and renders |
| `handleAdd(e)` | Handles product creation from the add form |
| `handleEdit(e)` | Handles product update from the edit form |
| `handleDelete(id)` | Deletes a product after confirmation |
| `renderProductCards(containerId)` | Renders all products as cards in the listing page |
| `renderProductDetail(containerId)` | Renders a single product on the detail page |
| `setDefaults(products)` | Sets default products for first-time visitors |

Products are persisted in `localStorage` under the key `products`. On page load, DOM products (from Jinja HTML) are synced with localStorage. When a user adds, edits, or deletes a product, the changes are saved to localStorage and the page re-renders from localStorage.

---

## Project Structure

```
psychic-broccoli-main/
  src/
    app/
      App.java                        # Main entry point
    contextgen/
      ContextGenerator.java           # Extracts runtime data from Python AST
    htmlgen/
      HtmlGenerator.java              # Orchestrates HTML generation + JS injection
    templaterenderer/
      TemplateRenderer.java           # Resolves Jinja variables, loops, conditions
    outputwriter/
      OutputWriter.java               # Writes generated files to disk
    generationlogger/
      GenerationLogger.java           # Pipeline logging
    visitor/
      css/
        CssSelectorVisitor.java       # CSS selector visitor
  samples/
    product_management/               # Arabic sample app
    product_manager/                  # English sample app
    flask_project/                    # English sample app
  dependencies/
    antlr-4.13.2-complete.jar         # ANTLR runtime
  out/                                # Compiled .class files
  output/                             # Generated static HTML (per run)
  compiler_output/                    # Compiler reports
```

---

## Compiler Reports

After each run, the following files are generated in `compiler_output/`:

| File | Description |
|---|---|
| `ast_python.json` | Python AST representation |
| `ast_jinja.json` | Jinja AST representation |
| `generation_log.txt` | Detailed step-by-step compilation log |

---

## Technologies

- **Java 17+** — Compiler implementation
- **ANTLR 4.13.2** — Parser generation for Python and Jinja grammars
- **Python 3.10+** — Source language (Flask applications)
- **Flask** — Web framework (source input)
- **Jinja2** — Template engine (source input)
- **HTML/CSS/JavaScript** — Generated output
- **localStorage** — Client-side data persistence in generated sites

---

## Features

- Python source parsing with ANTLR-generated parsers
- Jinja template parsing and AST generation
- Semantic analysis with symbol table management
- Context extraction from Python source (variables, lists, dicts, class instances)
- Template variable resolution, loop evaluation, and conditional processing
- Static HTML page generation with zero template syntax remaining
- Automatic CRUD JavaScript injection for client-side interactivity
- Default product data injection from Python source
- Static asset copying (CSS, images, uploads)
- Compiler report generation (ASTs, logs)

---

## Team

- Ola Mohsen Faza
- Raghad Majed Al-Abdullah
- Abdul Rahman Bassam Al-Muzain
- Zainab Khalil Khalaf
- Mohammad Salim Suleiman Al-Taqi

---

## License

This project is intended for educational and research purposes.
