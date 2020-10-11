let arr = ['code','gym',2020,0,0,true]

let count = 0;

for (let i = 0; i < arr.length; i++) {
    if(typeof(arr[i]) == 'number'){
            count +=1;
    }
    }  

console.log(count);
