function storeCatalogue(array) {

    let result = array.sort((a, b) => a.localeCompare(b));
    let currentElement = [];
    let firstChar = ' ';
    for (let i = 0; i < result.length; i++) {
        currentElement = result[i].split(' : ');
        if (result[i][0] !== firstChar) {
            console.log(result[i][0]);
        }
        console.log(`${currentElement[0]}: ${currentElement[1]}`);
        firstChar = result[i][0];
    }
};
storeCatalogue([
    'Appricot : 20.4',
    'Fridge : 1500',
    'TV : 1499',
    'Deodorant : 10',
    'Boiler : 300',
    'Apple : 1.25',
    'Anti-Bug Spray : 15',
    'T-Shirt : 10']
);
storeCatalogue([
    'Banana : 2',
    'Rubic`s Cube : 5',
    'Raspberry P : 4999',
    'Rolex : 100000',
    'Rollon : 10',
    'Rali Car : 2000000',
    'Pesho : 0.000001',
    'Barrel : 10']
)