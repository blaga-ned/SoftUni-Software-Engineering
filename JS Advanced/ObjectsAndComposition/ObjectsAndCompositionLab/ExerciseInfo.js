//Single line object literal
let otherPerson = { name: 'Blaga', age: 38, isMale: true };

//Multi line object literal
let person = {
    name: 'Blaga',
    age: 38,
    isMale: true
};

//Empty object literal
let emptyObject = {};

//Dynamic assign of propertis and Notations
let cat = {};
let propName = 'age';
cat.name = 'Blaga';           //Dot notation 
cat['breed'] = 'Persian';     //Bracket notation
cat['fur-colour'] = 'yellow';
cat[propName] = 7;

//Object property access
console.log(cat["fur-colour"]);
console.log(cat[propName]);
console.log(cat.age);
console.log(cat);

//Object Destructuring Assignment Syntax
let { age, breed, ...rest } = cat;

//Object references (Referent types - Objects, Arrays) - e ravna na i sochi kam sashtia adress v pametta;
let otherCat = cat;
console.log(otherCat.name); // Blaga;
otherCat.name = "Garry";
console.log(otherCat.name); //Garry;
console.log(cat.name);      //Garry;
cat.name = "Navcho";
console.log(cat.name);      //Navcho
console.log(otherCat.name); //Navcho

//Primitive type - mogat da se manipulirat kato tuk se kopira stoinostta, 
//a ne refeneciata kakto e pri referentnite tipove;(String, Number, Boolean)
let firstName = 'Pesho';
let otherName = firstName;
console.log(firstName); //Pesho
console.log(otherName); //Pesho
otherName = 'Gosho';
console.log(otherName);//Gosho
console.log(firstName);//Pesho

//First Way to Clone Object
let { ...clonedCat } = cat;
clonedCat.name = 'Garrty';
console.log(clonedCat); // {name: 'Garrty', breed: 'Persian', fur-colour: 'yellow', age: 7}
console.log(cat);       // {name: 'Navcho', breed: 'Persian', fur-colour: 'yellow', age: 7}

//Associative-Arrays
let phoneBook = {
    'Ivan Petrov': '1223445',
    'Atanas Nedyalkov': '123456',
    'Blaga Chongova': '3455444'
};
//Accessing associative arrays
console.log(phoneBook['Atanas Nedyalkov']);
phoneBook["Atanas Nedyalkov"] = '555555'
console.log(phoneBook['Atanas Nedyalkov']);

//Iteration - for in
for (key in phoneBook) {
    console.log(`${key} - ${phoneBook[key]}`);

}
//Iteration - methods
let names = Object.keys(phoneBook);
let phones = Object.values(phoneBook);
console.log(names);
console.log(phones);
Object.keys(phoneBook).forEach(x => {
    console.log(`${x} - ${phoneBook[x]}`);
});

//Used for sorting of Object
let entries = Object.entries(phoneBook);
for (const kvp of entries) {
    console.log(kvp);
}


let car = {
    model: 'BMW',
    year: 2010,
    facelift: true,
    honk: function honk() {           //Method with function expression
        console.log('Beep beep!');
    },
    honk2: () => {                   //Merhod with arrow function expression
        console.log('Beep beep2!');
    },
    honk3() {                       //Object method notation
        console.log('Beep beep3!');
    }
};
car.honk();
car.honk2();
car.honk3();

//Object as function library
let calc = {
    sum: function (a, b) {
        return a + b;
    },
    multiplicarion: (a, b) => a * b,
    subraction(a, b) {
        return a - b;
    },

};
console.log(calc.sum(10, 15));
console.log(calc.multiplicarion(2, 3));
console.log(calc.subraction(10, 15));

let van = {
    model: 'BMW',
    year: 2010,
    facelift: true,
    honk: function () {           //Method with function expression
        console.log(`${this.model}: Beep beep van!`);
    },
    owner: {
        name: 'Pesho',
        age: 38,
        hobbies: [
            'sports,',
            'swimming',
        ]
    }
};
van.honk();
van.model = 'Mercedes';
van.honk();
console.log(van.owner.name);



//Change execution context
let singleVan = van.honk;
singleVan();
let otherVan = {
    model: 'Lada'
}
otherVan.bibitka = van.honk;
otherVan.bibitka(); //Lada: Beep beep van!

//how to sort an object
//let obj = {}; - sazdavane na obect;
//obj[product] = price; palnene na obekta;
//let keys = Object.keys(obj).sort((a,b)=> a.localeCompare(b));
//console.log(`${keys[i]}: ${obj[product]}`);







