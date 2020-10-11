// let myColor = ["Red", "Green", "White", "Black"];
// console.log(myColor.toString());
// console.log(myColor.join());
// console.log(myColor.join('+'));

// let num = '025468'

// let result = [num[0]]

// for(let i = 1; i < num.length; i++ ){
//     if(num[i-1] % 2 === 0 && num[i] % 2 ===0 ){
//         result.push('-',num[i]);
//     }else{
//         result.push(num[i])
//     }
// }
// console.log(result.join(''));
var str = 'The Quick Brown Fox';
var UPPER = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
var LOWER = 'abcdefghijklmnopqrstuvwxyz';
var result = [];
  
  for(var x=0; x<str.length; x++)
  {
    if(UPPER.indexOf(str[x]) !== -1)
    {
    console.log(UPPER.indexOf(str[x]) !== -1);
      result.push(str[x].toLowerCase());
    }
    else if(LOWER.indexOf(str[x]) !== -1)
    {
      result.push(str[x].toUpperCase());
    }
    else 
    {
      result.push(str[x]);
    }
  }
console.log(result.join(''));