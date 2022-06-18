function squareOfStars(input) {
    
    for (let row = 0; row < input; row++) {
        let stringSquare = '';
        for (let col = 0; col < input; col++) {
            stringSquare += '* ';
        }

        console.log(stringSquare);
    }
}

squareOfStars(1);
console.log('--------------------');
squareOfStars(4);
console.log('--------------------');
squareOfStars(5);