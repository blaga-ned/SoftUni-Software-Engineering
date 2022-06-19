function cityRecord(city, population, treasury){
let record = {};

record.name = city;
record.population = population;
record.treasury = treasury;
return record;
};

console.log(cityRecord('Tortuga', 7000, 15000));
console.log(cityRecord('Santo Domingo', 12000, 23500));