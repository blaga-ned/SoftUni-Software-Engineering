const myArr = [10, 20, 30, 40];

const result = myArr.reduce(myReducer, 0);
const result2 = reduce(myArr, myReducer, 0);

console.log(result);
console.log(result2);

function reduce(arr, reducer, accumulator) {
    for (let i = 0; i < arr.length; i++) {
        const element = arr[i];
        accumulator = reducer(accumulator, element, i, arr);

    }
}

function myReducer(a, v) {
    console.log(`${a}: ${v} -> ${a+v}`)
    return a + v;
}


