function wordsUpperCase(str) {
    return str.match(/\w+/g).join(", ").toLocaleUpperCase();
    console.log(str);
}
wordsUpperCase('Hi, how are you?');