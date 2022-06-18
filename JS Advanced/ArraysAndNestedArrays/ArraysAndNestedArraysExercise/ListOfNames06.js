function listOfNames(arrNames) {
    let sortedArr = arrNames.sort((a, b) => a.localeCompare(b));
    let orderNumber = 1;

    sortedArr.forEach((name) => {
        console.log(`${orderNumber}.${name}`);
        orderNumber++;
    });
}
listOfNames(["John", "Bob", "Christina", "Ema"]);