let arr = ['code', '-', 'gym', '-', 2020]
for (let i = 0; i < arr.length; i++) {
    if(arr[i] === '-'){
        arr[i] = '_'     
    }
}  

console.log(arr);