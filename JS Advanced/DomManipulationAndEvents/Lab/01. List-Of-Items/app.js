function addItem() {
    let createLiElement = document.createElement('li');
    let inputElement = document.getElementById('newItemText');
    let itemsElement = document.getElementById('items');

    createLiElement.textContent = inputElement.value;
    itemsElement.appendChild(createLiElement);
}

function addItem(){
    let inputValue = document.getElementById('newItemText').value;

    let ul = document.getElementById('items');
    let newLi = document.createElement('li');
    newLi.textContent = inputValue;
    ul.appendChild(newLi);
    
}