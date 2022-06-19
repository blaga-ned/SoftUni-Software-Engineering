function townsToJson(input) {
    let [columns, ...table] = input.map(splitLine);

    function isEmptyString(x) {
        return x !== "";
    }
    function convertifNum(x) {
        return isNaN(x) ? x : Number(Number(x).toFixed(2));
    }

    function splitLine(input) {
        return input.split('|').filter(isEmptyString).map(x => x.trim()).map(convertifNum)
    }

    return JSON.stringify(table.map(entry => {
        return columns.reduce((acc, curr, index) => {
            acc[curr] = entry[index];
            return acc;
        }, {})
    }))
};
console.log(townsToJson([
    '| Town | Latitude | Longitude |',
    '| Sofia | 42.696552 | 23.32601 |',
    '| Beijing | 39.913818 | 116.363625 |']
));