function extractSubsequence(arr) {

    let array = [];    
    let biggestElement = arr[0];
    for (let i = 0; i < arr.length; i++) {
        let element = arr[i];        
        if (element >= biggestElement) {
            array.push(element);
            biggestElement = element;
        }

    }
    return array;
}

console.log(extractSubsequence([1, 3, 8, 4, 10, 12, 3, 2, 24]));
console.log(extractSubsequence([1, 2, 3, 4]));
console.log(extractSubsequence([20, 3, 2, 15, 6, 1]));