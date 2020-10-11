let arr =  [13,2,3,11,5,6,15,8,9,10]; // 15

let max = arr[0];
let index = 0

for( i = 0; i < arr.length; i++ ){
    if(arr[i] > max){
        max = arr[i]
        index = i;
    }
}

console.log(max+'-index: '+ index);