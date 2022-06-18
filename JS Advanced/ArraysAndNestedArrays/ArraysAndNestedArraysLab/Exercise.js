let names = ['Blaga', 'Kiril', 'Ivan', 'Maria'];
console.log(names);
let [firstName, secondName, thirdName] = names;
console.log(firstName);

const myArr = [10, 20, 30, 40, 50];

const [a, b, ...params] = myArr;

console.log(typeof params.join(' '));

//Splice
let cars = ['Ford', 'Mercedes', 'Audi'];
console.log(cars);
cars.splice(1, 0, 'BMW');
console.log(cars);
cars.splice(1, 0, 'audi')
console.log(cars);

//Reverse
cars.reverse();
console.log(cars);
cars.reverse();
console.log(cars);

//Sort
cars.sort();
console.log(cars);
let numbers = [1, 3, 4, 6, 10];
console.log(numbers.sort());
numbers.sort((a, b) => a - b);
console.log(numbers);
numbers.sort(function (a, b) {
    if (a > b) {
        return -1;
    } else if (a < b) {
        return 1;
    } else {
        return 0;
    }
    //moje i samo return a-b;
});
console.log(numbers);
cars.sort((a, b) => a.localeCompare(b));
console.log(cars.join(' - '));
let words = ['aa', 'bbb', 'c', 'vvv', 'ccc'];
let sortWords = words.sort(function (a, b) {
    return a.length - b.length;
});
console.log(sortWords.join(' '));
words.sort((a, b) => a.localeCompare(b));
console.log(words.join(' - '));
words.sort((a, b) => a.length - b.length || a.localeCompare(b)); // sravnivane po poveche ot edin factora;
console.log(words.join(' : '));

//Concat
let cars2 = ['car1', 'car2', 'car3'];
let concatCars = cars.concat(cars2);
console.log(concatCars.join(' '));
console.log(cars2.join(' '));
console.log(cars.join(' '));
//Slice
let sliceCars = concatCars.slice(0, 4); //moje da napravim cialostno kopie na edin masiv ot koi do koi masiv;
console.log(sliceCars.join(' '));
console.log(concatCars.join(' '));
let cloneArray = concatCars.slice(); // easy way to clone an array;
console.log(cloneArray.join(' '));

//Includes
let isInclude = cloneArray.includes('Lada');
console.log(isInclude);
let inItInclude = cloneArray.includes('Mercedes', 1);// to check is it iclude after index 1;
console.log(inItInclude);
//IndexOf
let mercedesIndex = concatCars.indexOf('Mercedes'); // ako go niama ni vrashta -1;
console.log(mercedesIndex);
//Array itteration methods
//For of
for (const car of concatCars) {
    console.log(car);
}
//forEach method
cars.forEach(element => {
    console.log(element);
});
//Some
let isCarWithM = cars.some((car) => {  //proverka dali ima kola zapochvashta s M 
    return car[0] == 'M';
})
console.log(isCarWithM);

//Find
let longNameCar = cars2.find((car) => {
    return car.length > 3;
});
console.log(longNameCar);

//Filter - pure funcia, vrashta nov masiv ne obrabotva staria, a vrasha nov masiv;
let filterCar = concatCars.filter(car => {
    return car.length == 4;
});
console.log(filterCar);

//Map
let number = [1, 2, 3, 4, 5, 6];
let doubledNumbers = number.map(num => num * 2);
console.log(number);
console.log(doubledNumbers);
let arrayOne = ['maria', 'blaga', 'tania'];
let upperCaseLetters = arrayOne.map(n => n.toUpperCase());
console.log(upperCaseLetters);
let newArrayOne = arrayOne.map(function(el){
    return el + 'B';
});
console.log(newArrayOne.join(' ! '));


//Reduce
let sum = number.reduce((acc, x) => {
    return acc + x;
}, 0);
console.log(sum);

//Array of Array
let arr = [
    [1, 2, 3],
    [3, 4, 5],
    [6, 7, 8]
];
console.log(arr[1][1]);
console.log(arr[0][2]);

arr.forEach(el => {
    rowSum.push(el.reduce((a, b) => a + b));//sum of elements from an array row and pushed into a new array;
}); 

//Nachin za reversvane na string
let input = 'blaga';
input = input.split('').reverse().join(''); //prevrashtame go v masiv sas split i sled tova go vrashtame v string sas join('');
console.log(input);




