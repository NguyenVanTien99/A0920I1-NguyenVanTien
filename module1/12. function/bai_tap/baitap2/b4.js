function checkTypeNumber(number){
    if( typeof number === 'number'){
        return true
    }
    return false
}

console.log(checkTypeNumber('code')); // return false