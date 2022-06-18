function rotateArr(arr, numRotations) {
    for (let i = 0; i < numRotations; i++) {
        let lastElement = arr.pop();
        arr.unshift(lastElement);        
    }
    console.log(arr.join(' '));
}
rotateArr(['1', '2', '3', '4'], 2);
rotateArr(['Banana', 'Orange', 'Coconut', 'Apple'], 15);