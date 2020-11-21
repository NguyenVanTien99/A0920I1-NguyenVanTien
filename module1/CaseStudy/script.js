let fullname = document.getElementById('fullname')
let ID = document.getElementById('ID')
let dayofbirth = document.getElementById('dayofbirth')
let email = document.getElementById('email')
let address = document.getElementById('Address')
let ranks = document.getElementById('ranks')
let discount = document.getElementById('discount')
let numberofpeople = document.getElementById('numberofpeople')
let rentdays = document.getElementById('rentdays')
let services = document.getElementById('services')
let typerooms = document.getElementById('typerooms')

let information = document.getElementById('information')

let informationEdit = document.getElementById('information-edit')

let alertSuccessAdd = document.querySelector('.alert-success-add')

let alertSuccessEdit = document.querySelector('.alert-success-edit')

let tableShow = document.querySelector('.table-show')

let tableEdit = document.querySelector('.table-edit')


let formAdd = document.querySelector('.form-add')
let formEdit = document.querySelector('.form-edit')

let tableShowPrice = document.querySelector('.table-show-price')

let informationPrice = document.getElementById('information-price')

let lableShowPrice = document.getElementById('lable-price')

let arrListCustomers = []

function Customer(fullname, ID, dayofbirth, address, email, ranks, discount, numberofpeople, rentdays, services, typerooms) {
    this.fullname = fullname;
    this.ID = ID;
    this.dayofbirth = dayofbirth;
    this.address = address;
    this.email = email;
    this.ranks = ranks
    this.discount = discount
    this.numberofpeople = numberofpeople
    this.rentdays = rentdays
    this.services = services
    this.typerooms = typerooms

    this.getFullname = function () {
        return this.fullname
    }
    this.getID = function () {
        return this.ID
    }
    this.getDayofbirth = function () {
        return this.dayofbirth
    }
    this.getAddress = function () {
        return this.address
    }
    this.getEmail = function () {
        return this.email
    }
    this.getRanks = function () {
        return this.ranks
    }
    this.getDiscount = function () {
        return this.discount
    }
    this.getNumberofpeople = function () {
        return this.numberofpeople
    }
    this.getRentdays = function () {
        return this.rentdays
    }
    this.getServices = function () {
        return this.services
    }
    this.getTyperooms = function () {
        return this.typerooms
    }


    this.setFullname = function (fullname) {
        return this.fullname = fullname
    }
    this.setID = function (ID) {
        return this.ID = ID
    }
    this.setDayofbirth = function (dayofbirth) {
        return this.dayofbirth = dayofbirth
    }
    this.setAddress = function (address) {
        return this.address = address
    }
    this.setEmail = function (email) {
        return this.email = email
    }
    this.setRanks = function (ranks) {
        return this.ranks = ranks
    }
    this.setDiscount = function (discount) {
        return this.discount = discount
    }
    this.setNumberofpeople = function (numberofpeople) {
        return this.numberofpeople = numberofpeople
    }
    this.setRentdays = function (rentdays) {
        return this.rentdays = rentdays
    }
    this.setServices = function (services) {
        return this.services = services
    }
    this.setTyperooms = function (typerooms) {
        return this.typerooms = typerooms
    }

    this.getPrice = function () {
        let countPrice = null
        if (this.services === 'Villa') {
            countPrice = 500 * parseInt(this.rentdays) * (1 - parseInt(this.discount) / 100)
        } else if (this.services === 'House') {
            countPrice = 300 * parseInt(this.rentdays) * (1 - parseInt(this.discount) / 100)
        } else if (this.services === 'Room') {
            countPrice = 100 * parseInt(this.rentdays) * (1 - parseInt(this.discount) / 100)
        }
        return countPrice
    }

}

let convertName = (text) => {

    text1 = text.replace(/\s+/g, ' ').toLowerCase().trim().split(' ')
    let arrStr = []
    for (i = 0; i < text1.length; i++) {
        arrStr.push(text1[i].charAt(0).toUpperCase() + text1[i].slice(1))
    }
    console.log(arrStr);
    console.log(arrStr.join(' '));
    return arrStr.join(' ');
}

let add = () => {
    let fullname1 = convertName(fullname.value);
    console.log(fullname1);
    arrListCustomers.push(new Customer(fullname1, ID.value, dayofbirth.value, email.value, address.value, ranks.value, discount.value, numberofpeople.value, rentdays.value, services.value, typerooms.value))
    console.log(arrListCustomers[0].getID());
    formAdd.classList.add('show')
    tableEdit.classList.add('show')
    alertSuccessAdd.classList.remove('show')

    fullname.value = ''
    ID.value = ''
    dayofbirth.value = ''
    email.value = ''
    address.value = ''
    ranks.value = ''
    discount.value = ''
    numberofpeople.value = ''
    rentdays.value = ''
    services.value = ''
    typerooms.value = ''
}

let addNewCustomer = () => {
    tableShowPrice.classList.add('show')
    tableShow.classList.add('show')
    tableEdit.classList.add('show')
    formAdd.classList.remove('show')
    formEdit.classList.add('show')
    document.querySelector('.alert-success-remove').classList.add('show')

}

let showCustomer = () => {
    tableShowPrice.classList.add('show')
    formAdd.classList.add('show');
    alertSuccessAdd.classList.add('show');
    alertSuccessEdit.classList.add('show');
    tableRemove.classList.add('show');
    formEdit.classList.add('show');
    tableShow.classList.remove('show');
    document.querySelector('.alert-success-remove').classList.add('show');
    tableEdit.classList.add('show');
    let data = ''

    if (arrListCustomers.length > 0) {
        for (i = 0; i < arrListCustomers.length; i++) {
            data += '<tr>'
            data += '<td>' + arrListCustomers[i].getFullname() + '</td>'
            data += '<td>' + arrListCustomers[i].getID() + '</td>'
            data += '<td>' + arrListCustomers[i].getDayofbirth() + '</td>'
            data += '<td>' + arrListCustomers[i].getAddress() + '</td>'
            data += '<td>' + arrListCustomers[i].getEmail() + '</td>'
            data += '<td>' + arrListCustomers[i].getRanks() + '</td>'
            data += '<td>' + arrListCustomers[i].getDiscount() + '</td>'
            data += '<td>' + arrListCustomers[i].getNumberofpeople() + '</td>'
            data += '<td>' + arrListCustomers[i].getRentdays() + '</td>'
            data += '<td>' + arrListCustomers[i].getServices() + '</td>'
            data += '<td>' + arrListCustomers[i].getTyperooms() + '</td>'
            data += '<td>' + arrListCustomers[i].getPrice() + '</td>'
            data += '<tr>'
        }
    }
    return information.innerHTML = data
}


let showPriceCustomer = () => {
    alertSuccessAdd.classList.add('show')
    alertSuccessEdit.classList.add('show')
    tableRemove.classList.add('show')
    formEdit.classList.add('show')
    tableShow.classList.add('show')
    document.querySelector('.alert-success-remove').classList.add('show')
    tableEdit.classList.add('show')
    tableShowPrice.classList.remove('show')
    let data = ''

    if (arrListCustomers.length > 0) {
        for (i = 0; i < arrListCustomers.length; i++) {
            data += '<tr>'
            data += '<td><button onclick="ShowPrice(' + i + ')"  class="btn btn-warning">Show Price</button></td>';
            data += '<td>' + arrListCustomers[i].getFullname() + '</td>'
            data += '<td>' + arrListCustomers[i].getID() + '</td>'
            data += '<tr>'
        }
    }
    return informationPrice.innerHTML = data
}

let ShowPrice = (item) => {
    console.log(arrListCustomers[item].getPrice());
    lableShowPrice.innerHTML = 'Price: ' + arrListCustomers[item].getPrice() + '$'
}


let editCustomer = () => {
    tableShowPrice.classList.add('show')
    alertSuccessAdd.classList.add('show')
    tableEdit.classList.remove('show')
    tableRemove.classList.add('show')
    formAdd.classList.add('show')
    document.querySelector('.alert-success-remove').classList.add('show')
    tableShow.classList.add('show')

    let data = ''

    if (arrListCustomers.length > 0) {
        for (i = 0; i < arrListCustomers.length; i++) {
            data += '<tr>'
            data += '<td><button onclick="edit(' + i + ')"  class="btn btn-info">Edit</button></td>';
            data += '<td>' + arrListCustomers[i].getFullname() + '</td>'
            data += '<td>' + arrListCustomers[i].getID() + '</td>'
            data += '<td>' + arrListCustomers[i].getDayofbirth() + '</td>'
            data += '<td>' + arrListCustomers[i].getAddress() + '</td>'
            data += '<td>' + arrListCustomers[i].getEmail() + '</td>'
            data += '<td>' + arrListCustomers[i].getRanks() + '</td>'
            data += '<td>' + arrListCustomers[i].getDiscount() + '</td>'
            data += '<td>' + arrListCustomers[i].getNumberofpeople() + '</td>'
            data += '<td>' + arrListCustomers[i].getRentdays() + '</td>'
            data += '<td>' + arrListCustomers[i].getServices() + '</td>'
            data += '<td>' + arrListCustomers[i].getTyperooms() + '</td>'
            data += '<td>' + arrListCustomers[i].getPrice() + '</td>'
            data += '<tr>'
        }
    }
    return informationEdit.innerHTML = data

}

let edit = (item) => {
    formEdit.classList.remove('show')
    let fullname = document.getElementById('fullname1')
    let ID = document.getElementById('ID1')
    let dayofbirth = document.getElementById('dayofbirth1')
    let email = document.getElementById('email1')
    let address = document.getElementById('Address1')
    let ranks = document.getElementById('ranks1')
    let discount = document.getElementById('discount1')
    let numberofpeople = document.getElementById('numberofpeople1')
    let rentdays = document.getElementById('rentdays1')
    let services = document.getElementById('services1')
    let typerooms = document.getElementById('typerooms1')

    fullname.value = arrListCustomers[item].getFullname()
    ID.value = arrListCustomers[item].getID()
    dayofbirth.value = arrListCustomers[item].getDayofbirth()
    email.value = arrListCustomers[item].getAddress()
    address.value = arrListCustomers[item].getEmail()
    ranks.value = arrListCustomers[item].getRanks()
    discount.value = arrListCustomers[item].getDiscount()
    numberofpeople.value = arrListCustomers[item].getNumberofpeople()
    rentdays.value = arrListCustomers[item].getRentdays()
    services.value = arrListCustomers[item].getServices()
    typerooms.value = arrListCustomers[item].getTyperooms()


    document.getElementById('saveEdit').onsubmit = function () {
        arrListCustomers[item].setFullname(fullname.value)
        arrListCustomers[item].setID(ID.value)
        arrListCustomers[item].setDayofbirth(dayofbirth.value)
        arrListCustomers[item].setAddress(address.value)
        arrListCustomers[item].setEmail(email.value)
        arrListCustomers[item].setRanks(ranks.value)
        arrListCustomers[item].setDiscount(discount.value)
        arrListCustomers[item].setNumberofpeople(numberofpeople.value)
        arrListCustomers[item].setRentdays(rentdays.value)
        arrListCustomers[item].setServices(services.value)
        arrListCustomers[item].setTyperooms(typerooms.value)

        formEdit.classList.add('show')
        tableEdit.classList.add('show')
        alertSuccessEdit.classList.remove('show')

    }

}

let tableRemove = document.querySelector('.table-remove')

let informationRemove = document.getElementById('information-remove')

let deleteCustomer = () => {
    tableShowPrice.classList.add('show')
    console.log('test');
    alertSuccessAdd.classList.add('show')
    tableRemove.classList.remove('show')
    tableEdit.classList.add('show')
    formAdd.classList.add('show')
    tableShow.classList.add('show')

    let data = ''

    if (arrListCustomers.length > 0) {
        for (i = 0; i < arrListCustomers.length; i++) {
            data += '<tr>'
            // data += '<td><button onclick="deleteifo(' + i + ')"  class="btn btn-danger">Delete</button></td>';
            data += `<td><button onclick="deleteifo(${i})"  class="btn btn-danger">Delete</button></td>`;
            data += '<td>' + arrListCustomers[i].getFullname() + '</td>'
            data += '<td>' + arrListCustomers[i].getID() + '</td>'
            data += '<td>' + arrListCustomers[i].getDayofbirth() + '</td>'
            data += '<td>' + arrListCustomers[i].getAddress() + '</td>'
            data += '<td>' + arrListCustomers[i].getEmail() + '</td>'
            data += '<td>' + arrListCustomers[i].getRanks() + '</td>'
            data += '<td>' + arrListCustomers[i].getDiscount() + '</td>'
            data += '<td>' + arrListCustomers[i].getNumberofpeople() + '</td>'
            data += '<td>' + arrListCustomers[i].getRentdays() + '</td>'
            data += '<td>' + arrListCustomers[i].getServices() + '</td>'
            data += '<td>' + arrListCustomers[i].getTyperooms() + '</td>'
            data += '<td>' + arrListCustomers[i].getPrice() + '</td>'
            data += '<tr>'
        }
    }
    return informationRemove.innerHTML = data
}


let deleteifo = (item) => {
    if (confirm("Do you want delete ?")) {
        arrListCustomers.splice(item, 1)
        tableRemove.classList.add('show')
        document.querySelector('.alert-success-remove').classList.remove('show')
    }
}

let exit = () => {
    tableShowPrice.classList.add('show')
    formAdd.classList.add('show')
    tableEdit.classList.add('show')
    alertSuccessAdd.classList.add('show')
    alertSuccessEdit.classList.add('show')
    tableRemove.classList.add('show')
    tableShow.classList.add('show')
    formEdit.classList.add('show')
    document.querySelector('.alert-success-remove').classList.add('show')
    lableShowPrice.innerHTML = ''
}

function validateEmail() {
    // const re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    let regex = /\S+@\S+\.\S+/

    // \S match với tất cả ký tự không phải là khoảng trắng
    // \. biến ký tư đặc biệt dấu chấm thành một ký tự thường
    // + ký tự phía trước có thể xuất hiện một hoặc nhiều lần

    if (regex.test(email.value)) {
        console.log(regex.test(email.value));
        document.querySelector('.alert-email').classList.add("show");
    } else {
        document.querySelector('.alert-email').classList.remove("show");
    }
}

function validateID() {
    if (Number.isInteger(parseInt(ID.value)) && ID.value.length === 9 ) {
        document.querySelector('.alert-ID').classList.add("show");
    } else {
        document.querySelector('.alert-ID').classList.remove("show");
    }
}

function validatePp() {
    if (Number.isInteger(parseInt(numberofpeople.value)) && parseInt(numberofpeople.value) > 0) {
        document.querySelector('.alert-pp').classList.add("show");
    } else {
        document.querySelector('.alert-pp').classList.remove("show");
    }
}

function validateRentDay() {
    if (Number.isInteger(parseInt(rentdays.value)) && parseInt(rentdays.value) > 0) {
        document.querySelector('.alert-rentday').classList.add("show");
    } else {
        document.querySelector('.alert-rentday').classList.remove("show");
    }
}

function validateDiscount() {
    if (Number.isInteger(parseInt(discount.value)) && parseInt(discount.value) > 0 && parseInt(discount.value) <= 100 ) {
        document.querySelector('.alert-discount').classList.add("show");
    } else {
        document.querySelector('.alert-discount').classList.remove("show");
    }
}


function check(){
    console.log(document.querySelector('.alert-discount').className == 'show');
    document.querySelector('.alert-discount').className === 'show';
}
check();