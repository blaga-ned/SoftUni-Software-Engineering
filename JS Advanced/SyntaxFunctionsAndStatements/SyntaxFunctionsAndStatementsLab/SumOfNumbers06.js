function sumNumbers(inputOne, inputTwo) {
    let num1 = Number(inputOne);
    let num2 = Number(inputTwo);
    let result = 0;

    for (let i = num1; i <= num2; i++) {
        result += i;

    }
    console.log(result);
}

sumNumbers('1', '5');
sumNumbers('-8', '20');