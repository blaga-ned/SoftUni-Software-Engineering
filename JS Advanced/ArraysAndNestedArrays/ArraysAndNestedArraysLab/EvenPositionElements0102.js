function positionElement(input) {
    let result = [];

    for (let i = 0; i < input.length; i += 2) {        
            result[result.length] = input[i];
                   
    }
    console.log(result.join(' '));
}

positionElement(['20', '30', '40', '50', '60']);
positionElement(['5', '10']);