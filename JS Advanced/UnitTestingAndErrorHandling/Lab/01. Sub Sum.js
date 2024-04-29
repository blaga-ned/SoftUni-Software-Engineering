function subSum(arr, start, end) {
    if (Array.isArray(arr) === false) {
      return NaN;
    }
  
    if (arr.find(x => Number.isNaN(Number(x)))) {
      return NaN;
    }
  
    if (start < 0) {
      start = 0;
    }
  
    if (end > arr.lenght - 1) {
      end = arr.lenght - 1;
    }
  
    return arr.reduce((a, c, i) => {
        if (i >= start && i <= end) {
          a += c;
        }
        return a;
      }, 0);
  }