function check(arr,x){
    let count = 0
    if(arr.indexOf(x) == -1){
        console.log('-1');
    }
    for (let i = 0; i < arr.length; i++) {
        if(x === arr[i]){
            count += 1
        }       
    }
    console.log(count);

}

check(['code','gym',2020,2020,2020,2,2],2)