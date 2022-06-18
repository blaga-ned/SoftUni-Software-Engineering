function inputLenght(first, second, third){

    let firstLenght = first.length;
    let secondLenght = second.length;
    let thirdLenght = third.length;
    let sum = firstLenght + secondLenght + thirdLenght;
    console.log(sum); 
    let average = Math.floor(sum / 3);
    console.log(average);

}

inputLenght('chocolate', 'ice cream', 'cake');
inputLenght('pasta', '5', '22.3');