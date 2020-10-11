let str1 = 'codegym2020 xxx'
let str2 = 'codegym2020 xxx'
var regex = new RegExp(str1);
let result = regex.test(str2)

var regex2 = new RegExp(str2);
let result1 = regex2.test(str1)

if(result === true && result1 === true){
    console.log('hai chuỗi giống nhau');
}else{
console.log("hai chuỗi không giống nhau");
}