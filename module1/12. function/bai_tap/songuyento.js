
function isPrime(num){
    if(num < 2){
       return console.log(num + ' không phải là số nguyên tố');
    }else{
        for (let i = 2; i < num; i++) {
            if(num % i == 0){
              return  console.log(num + ' không phải là số nguyên tố');
            }
            
        }
        console.log(num + ' là số nguyên tố');
    }
}

let a = 37
isPrime(999)