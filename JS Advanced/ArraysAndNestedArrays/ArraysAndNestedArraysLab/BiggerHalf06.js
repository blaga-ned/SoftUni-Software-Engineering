function biggerHalf(numbersArr){
numbersArr.sort((a, b) => a-b);

const result = [];
for (let i = Math.floor(numbersArr.length / 2); i < numbersArr.length; i++) {
        result.push(numbersArr[i]);
}
return result;
}

console.log(biggerHalf([4, 7, 2, 5]));
console.log(biggerHalf([3, 19, 14, 7, 2, 19, 6]));