let arr =  [-13,2,-3,11,5,-6,15,-8,9,-10];

let V = 5

if(arr.indexOf(V) != -1){
    let vIndex =  arr.indexOf(V)
    arr.splice(vIndex,1);
    console.log(arr);
}else{
    console.log(V + ' is not in the array');
}