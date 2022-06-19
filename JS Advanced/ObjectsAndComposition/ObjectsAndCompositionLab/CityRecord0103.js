function cityRecord(name, population, treasury) {
    //Third way - shorthand and syntax
    let record = {
        name,
        population,
        treasury,
    }
    return record;
};
console.log(cityRecord('Tortuga', 7000, 15000));
console.log(cityRecord('Santo Domingo', 12000, 23500));