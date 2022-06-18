function equalNeighbors(matrix) {
    let count = 0;
    //check rows
    for (let row = 0; row < matrix.length; row++) {
        for (let col = 0; col < matrix[row].length - 1; col++) {
            if (matrix[row][col] === matrix[row][col + 1]) {
                count++;
            }
        }

    }

    //check cols
    const rowSize = matrix[0].length
    for (let col = 0; col < rowSize; col++) {
        for (let row = 0; row < matrix.length - 1; row++) {
            if (matrix[row][col] === matrix[row+1][col]) {
                count++;
            }

        }

    }
    return count;
}

console.log(equalNeighbors([
    ['2', '3', '4', '7', '0'],
    ['4', '0', '5', '3', '4'],
    ['2', '3', '5', '4', '2'],
    ['9', '8', '7', '5', '4']]
));


console.log(equalNeighbors([
    ['test', 'yes', 'yo', 'ho'],
    ['well', 'done', 'yo', '6'],
    ['not', 'done', 'yet', '5']]
));

console.log(equalNeighbors([
    ['2', '2', '2'],
    ['2', '2', '2'],
    ['2', '3', '5'],
    ['9', '8', '7']]
));