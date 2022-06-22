function generateReport() {
    let headRowArray = Array.from(document.getElementsByTagName('input'));
     
    let bodyRowArray = Array.from(document.querySelectorAll('tbody tr'));
 
    let textArea = document.getElementById('output');
 
    let selectedColumns = [];
 
    let employees = [];
 
    for (let i = 0; i < headRowArray.length; i++) {
 
        if (headRowArray[i].checked === true) { 
            selectedColumns.push(i);             
        } 
    }
 
    for (let i = 0; i < bodyRowArray.length; i++) {
 
        let elementDetails = {};
 
        let tdArray = Array.from(bodyRowArray[i].children);
 
        for (let j = 0; j < selectedColumns.length; j++) {
 
            let key = headRowArray[selectedColumns[j]].name.toLowerCase();
 
            let value = tdArray[selectedColumns[j]].textContent;
 
            elementDetails[key] = value;
 
        }
 
        employees.push(elementDetails);
 
    }
 
    let str = JSON.stringify(employees);
 
    textArea.textContent = str;
}