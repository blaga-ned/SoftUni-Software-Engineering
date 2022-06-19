function registerHeroes(input) {
    let resultObj = [];
    while (input.length) {
        let hero = input.shift();
        let [name, level, itemsArr] = hero.split(' / ');
        level = Number(level);
        const items = itemsArr ? itemsArr.split(', ') : [];

        resultObj.push({ name, level, items });
    }

    return JSON.stringify(resultObj);
}
console.log(registerHeroes([
    'Isacc / 25 / Apple, GravityGun',
    'Derek / 12 / BarrelVest, DestructionSword',
    'Hes / 1 / Desolator, Sentinel, Antara']
));
