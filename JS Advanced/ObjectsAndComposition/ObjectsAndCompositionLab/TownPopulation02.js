function townPopulatino(input) {
    let towns = {};

    for (const info of input) {
        let infoArray = info.split(' <-> ');
        let town = infoArray[0];
        let population = Number(infoArray[1]);

        if (!towns[town]) {
            towns[town] = 0;
        }
        towns[town] += population;
    }
    for (const town in towns) {
        console.log(`${town} : ${towns[town]}`);
    }
}
townPopulatino([
    'Sofia <-> 1200000',
    'Montana <-> 20000',
    'New York <-> 10000000',
    'Washington <-> 2345000',
    'Las Vegas <-> 1000000'
]);
townPopulatino([
    'Istanbul <-> 100000',
    'Honk Kong <-> 2100004',
    'Jerusalem <-> 2352344',
    'Mexico City <-> 23401925',
    'Istanbul <-> 1000'
]);