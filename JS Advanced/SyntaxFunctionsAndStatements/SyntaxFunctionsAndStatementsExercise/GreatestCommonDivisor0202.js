function solve(a, b) {
    while (a != b) {a > b ? a -= b : b -= a} {
        console.log(a);
    }
}

solve(15, 5);
solve(2154, 458);