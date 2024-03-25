const catFactsElement = document.getElementById("cat-facts")

fetch("https://catfact.ninja/fact")
.then ((response)=>response.json())
.then((obj)=>{
    const {fact, length} = obj // деструктуризация
    catFactsElement.textContent = `${fact} ${length}`
})