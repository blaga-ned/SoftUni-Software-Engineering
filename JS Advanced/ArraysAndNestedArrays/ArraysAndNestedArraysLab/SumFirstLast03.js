function sumFirstLast(numbersArr){
let firstNum = numbersArr.shift();
let lastNum = numbersArr.pop();
let sum = Number(firstNum) + Number(lastNum);

console.log(sum);
}

sumFirstLast(['20', '30', '40']);
sumFirstLast(['5', '10']);