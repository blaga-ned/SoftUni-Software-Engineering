//First solution with CSS selector
//function colorize() {
//    let rowElements = document.querySelectorAll('tr:nth-of-type(2n) td'); //dai mi vseki 2 table row(tr) i negovite table dati(td);
//    
//        rowElements.forEach(x => {
//        x.style.backgroundColor = 'teal';
//    });
//}

//Second solution
function colorize() {
    let rowElements = document.getElementsByTagName('tr')
    //Convert to array
    let rows = Array.from(rowElements);
    rows.forEach((x, i) => {
        if (i % 2 != 0) {
            x.style.backgroundColor = 'teal'
        }
    });

}