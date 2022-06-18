function sameNumbers(number) {
    let input = String(number);
    let isTheSame = true;
    let sum = 0;

    let firstDigit = input[0];
    for (let i = 0; i < input.length; i++) {
        let currentDigit = Number(input[i]);
        sum += currentDigit;
        if (firstDigit != currentDigit) {
            isTheSame = false;
        }
    }
    console.log(isTheSame);
    console.log(sum);
}

sameNumbers(2222222);
sameNumbers(1234);
