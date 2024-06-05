const content = document.querySelector("#content");

async function getProducts() {
    const res = await fetch("https://dummyjson.com/products");
    const data = await res.json();
    data.products.forEach(element => {
        const card = document.createElement("div");
        card.classList.add("card");

        const title = document.createElement("h3");
        title.textContent = element.title;
        title.classList.add("title");
        card.append(title);

        const description = document.createElement("p");
        description.textContent = element.description;
        description.classList.add("description");
        card.append(description);

        const cat = document.createElement("p");
        cat.classList.add("category");
        cat.textContent = element.category;
        card.append(cat);

        const tags = document.createElement("p");
        tags.classList.add("tags");
        tags.textContent = element.tags.join(', ');
        card.append(tags);
        const img = document.createElement("img");
        img.classList.add("image");
        img.src = element.images[0];
        card.append(img);
        content.append(card);
    });
}

getProducts();
