function addAndRemoveElement(arr) {
    let newArr = []; 

    for (let i = 0; i < arr.length; i++) {
        let currentCommand = arr[i];
        switch (currentCommand) {
            case 'add':
                newArr.push(i + 1);
                break;
            case 'remove':
                newArr.pop();
                break;
        }
    }

    if (newArr.length === 0) {
        console.log('Empty');
    } else {
        console.log(newArr.join('\n'));
    }
}

addAndRemoveElement(['add', 'add', 'add', 'add']);
addAndRemoveElement(['add', 'add', 'remove', 'add', 'add']);
addAndRemoveElement(['remove', 'remove', 'remove']);