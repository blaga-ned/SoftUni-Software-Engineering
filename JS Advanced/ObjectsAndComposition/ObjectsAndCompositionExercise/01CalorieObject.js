function calorieObject(input) {
    let calorieOb = {};

    for (let i = 0; i < input.length; i += 2) {
        let productName = input[i];
        let calories = Number(input[i + 1]);

        calorieOb[productName] = calories;
    }
    console.log(calorieOb)
}

calorieObject(['Yoghurt', '48', 'Rise', '138', 'Apple', '52']);
calorieObject(['Potato', '93', 'Skyr', '63', 'Cucumber', '18', 'Milk', '42']);