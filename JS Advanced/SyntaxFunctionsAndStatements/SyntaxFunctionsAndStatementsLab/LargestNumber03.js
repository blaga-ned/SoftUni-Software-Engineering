function largerNumber(num1, num2, num3) {
    let result = 0;
    if (num1 > num2 && num1 > num3) {
        result = num1;
    } else if (num2 > num1 && num2 > num3) {
        result = num2;
    } else if (num3 > num1 && num3 > num2) {
        result = num3;
    }

    console.log(`The largest number is ${result}.`);

}

largerNumber(5, -3, 16);
largerNumber(-3, -5, -22.5);
