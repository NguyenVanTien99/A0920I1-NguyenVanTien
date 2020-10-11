let arr =  [-13,2,-3,11,5,-6,15,-8,9,-10]; // 5 âm

let count = 0;

for (let i = 0; i < arr.length; i++) {
    if(arr[i] < 0){
        count += 1
    }  
}

console.log('có ' + count + ' số âm trong mảng');