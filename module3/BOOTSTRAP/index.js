function sumAll(arr) {
    let arrNew = arr.sort();
    let sum = 0;
    console.log(arrNew[0]);
    console.log(arrNew[1]);
    for(let i = arrNew[0]; i <= arrNew[1]; i++){
        
        sum += i;
    }
    return sum;
  }

  console.log(sumAll([5, 10]));