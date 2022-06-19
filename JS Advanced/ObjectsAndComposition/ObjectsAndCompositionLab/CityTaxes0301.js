function cityRecord(city,population, treasury) {
    
    let record = {
        name: city,
        population: population,
        treasury: treasury,
        taxRate: 10,
        collectTaxes(){
            this.treasury += Math.floor(this.population * this.taxRate); 

        },
        applyGrowth(percentage) {
            this.population += Math.floor(this.population * percentage/100);
        },
        applyRecession(percentage) {
            this.treasury -= Math.floor(this.treasury * percentage/100)
        }
    }; 
    return record;
}

const city =
    cityRecord('Tortuga',
        7000,
        15000);
console.log(city);

const cities =
    cityRecord('Tortuga',
        7000,
        15000);
city.collectTaxes();
console.log(city.treasury);
city.applyGrowth(5);
console.log(city.population);


