function cityRecord(city,population, treasury) {
    //First way
    let record = {
        name: city,
        population: population,
        treasury: treasury,
    }; 
    return record;
}
console.log(cityRecord('Tortuga', 7000, 15000));
console.log(cityRecord('Santo Domingo', 12000, 23500));