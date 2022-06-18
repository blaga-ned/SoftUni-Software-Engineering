function printElementFromArray(arr, number) {
    let newArr = [];
    for (let i = 0; i < arr.length; i += number) {
        const element = arr[i];
        newArr.push(element);

    }
    return newArr;
}

console.log(printElementFromArray(['5', '20', '31', '4', '20'], 2));
console.log(printElementFromArray(['dsa', 'asd', 'test', 'tset'], 2));
console.log(printElementFromArray(['1', '2', '3', '4', '5'], 6));