function sortingNumbers(arr) {
    let resultArr = [];
    arr = arr.sort((a, b) => a - b);
    while (arr.length !== 0) {
        let firstElement = arr.shift();
        let lastElement = arr.pop();
        resultArr.push(firstElement);
        resultArr.push(lastElement);
    }
    let finalResult = resultArr.filter((el) =>{
        return typeof(el) !== 'undefined';
    })
    return finalResult;
}
console.log(sortingNumbers([1, 65, 3, 52, 48, 63, 31, -3, 18, 56]));
console.log(sortingNumbers([1, 65, 3, 52, 48, 63, 31, -3, 18]));