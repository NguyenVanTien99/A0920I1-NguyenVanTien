let arr =  [13,2,3,11,5,6,15,8,9,10];
// console.log(arr);
// console.log(arr.reverse());

let first = 0
last = arr.length-1

while(first < last){
    temp = arr[first]
    arr[first] = arr[last]
    arr[last] = temp;
    first++;
    last--
}
console.log(arr);