function negativePositiveNum(numbers){
    let myArr = [];
    for (let i = 0; i < numbers.length; i++) {
        const element = numbers[i];
        if(element < 0){
            myArr.unshift(element);
        
        }else{
            myArr.push(element);
        }
        
    }
    console.log(myArr.join("\n"))

}

negativePositiveNum([7, -2, 8, 9]);
negativePositiveNum([3, -2, 0, -1]);
