let myDate = function(day, month, year){
    this.day = day;
    this.month = month;
    this.year = year;

    this.getDay = function() {
        return this.day;
    }
    this.getMonth = function() {
        return this.month;
    }
    this.getYear = function() {
        return this.year;
    }

    this.setDay = function(day) {
        this.day = day
    }
    this.setMonth = function(month){
        this.month = month
    }

    this.setYear = function(year){
        this.year = year
    }


}

let date = new myDate(2,2,2007)


date.setDay(10);
date.setMonth(10);
date.setYear(2019);


let day = date.getDay(); // 2
console.log(day);
let month = date.getMonth(); // 2
console.log(month);
let year = date.getYear(); // 2007


console.log(year);
console.log(day + "/" + month + "/" + year);

