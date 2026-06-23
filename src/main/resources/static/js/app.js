async function loadProducts() {

    const response = await fetch('/api/products');

    const products = await response.json();

    const div = document.getElementById('products');

    div.innerHTML = '';

    products.forEach(product => {

        div.innerHTML += `
            <div class="product">
                <h3>${product.name}</h3>
                <p>${product.description}</p>
                <p>R$ ${product.price}</p>

                <button onclick="addToCart(${product.id})">
                    Adicionar
                </button>
            </div>
        `;
    });
}

async function addToCart(id) {

    await fetch(`/api/cart/add/${id}`, {
        method: 'POST'
    });

    loadCart();
}

async function loadCart() {

    const response = await fetch('/api/cart');

    const cart = await response.json();

    const div = document.getElementById('cart');

    div.innerHTML = '';

    cart.forEach(item => {

        div.innerHTML += `
            <p>${item.name}</p>
        `;
    });
}

async function loadInfo() {

    const response = await fetch('/api/info');

    const info = await response.json();

    document.getElementById('hostname').innerText =
        `${info.hostname} - ${info.address}`;
}

loadProducts();
loadCart();
loadInfo();