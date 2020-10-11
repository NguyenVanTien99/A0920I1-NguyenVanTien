function checkMaxNumber(num1,num2,num3){
    let min = null
    if(num1 < num2 && num1 < num3){
        min = num1;
    }else{
        if(num2 < num3){
            min = num2
        }else{
            min = num3
        }
    }
    console.log(min);
}

checkMaxNumber(11,9,6) // return 6