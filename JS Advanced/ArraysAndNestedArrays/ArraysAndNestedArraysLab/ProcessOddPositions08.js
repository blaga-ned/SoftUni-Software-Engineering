function oddPosition(numbers){
const odd = numbers.filter((x, i) => i % 2);
const doubled = odd.map(x => x * 2);
doubled.reverse();

return doubled.join(' ');
}
console.log(oddPosition([10, 15, 20, 25]));
console.log(oddPosition([3, 0, 10, 4, 7, 3]));