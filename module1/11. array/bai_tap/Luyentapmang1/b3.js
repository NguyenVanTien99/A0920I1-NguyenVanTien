let arr =  [13,2,3,11,5,6,15,8,9,10]; // 15

let max = arr[0];
let sum = 0
for( i = 0; i < arr.length; i++ ){
    if(arr[i] > max){
        max = arr[i]
    }
    sum += arr[i]
}
console.log(sum);
console.log('max: ' + max + ' average: ' + (sum/arr.length));