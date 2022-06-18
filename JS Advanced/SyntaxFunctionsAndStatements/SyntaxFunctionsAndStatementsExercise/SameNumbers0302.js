function sameNumbers(input) {

    let inputNumber = input.toString();
    let isSame = true;
    let sumOfDigits = 0;
    let digitToCompare = inputNumber[0];
    let numberL = inputNumber.length;

    for (let i = 0; i < numberL; i++) {
        sumOfDigits += Number(inputNumber[i]);

        if (inputNumber[i] !== digitToCompare) {
            isSame = false;
        }
    }
    console.log(isSame);
    console.log(sumOfDigits);

}

sameNumbers(2222222);
sameNumbers(1234);