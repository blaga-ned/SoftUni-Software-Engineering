function oddPositions(nums) {

    const odds = nums
        .filter((x, i) => i % 2)
        .map(x => x * 2)
        .reverse()
        .join(' ');

    return odds;

}

console.log(oddPositions([10, 15, 20, 25]));
console.log(oddPositions([3, 0, 10, 4, 7, 3]));
