let words = ['aa', 'vvv', 'bbb', 'c'];
let sortWords = words.sort(function (a, b) {
    return a.localeCompare(b);
});
console.log(sortWords.join('-'));
