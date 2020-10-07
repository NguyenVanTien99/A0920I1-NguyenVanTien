const money = document.getElementById('money')
const currency1 = document.getElementById('type1')
const currency2 = document.getElementById('type2')
const btnConvert = document.getElementById("convertbt");
const convert = document.getElementById('convert')

btnConvert.addEventListener("click",convertMoney)

function convertMoney(){
    if(currency1.value === 'VND' && currency2.value === 'USD'){
        convert.innerHTML = money.value/23000 + 'USD';
    }else if(currency1.value === 'USD' && currency2.value === 'VND'){
        convert.innerHTML = money.value*23000 + 'VND';
    }else if(currency1.value === 'VND' && currency2.value === 'VND'){
        convert.innerHTML = 'không hợp lệ'
    }else{
        convert.innerHTML = 'không hợp lệ'
    }

    console.log(currency1.value);
    console.log(currency2.value);
    console.log(typeof currency1.value);
    console.log(typeof currency2.value);
    console.log(currency1.value === 'VND');
    console.log(currency2.value === 'USD');
    console.log((currency1.value == 'VND' && currency2.value == 'USD'));
    console.log((currency1.value == 'USD' && currency2.value == 'VND'))
}
