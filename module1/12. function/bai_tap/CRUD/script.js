let bookList = document.getElementById('books');
let newBook = document.getElementById('add-book')
let editBook = document.getElementById('edit-book')
let editBox = document.getElementById('edit-box')
let formSubmitEdit = document.getElementById('save-edit')
let books = [];

const fetchAll = function(){
    let bookData = ''
    if(books.length > 0){
        for( i = 0; i < books.length; i++){
            bookData += '<tr>'
            bookData += '<td>'+ books[i] + '</td>'
            bookData += '<td><button onclick="Edit('+ i +')">Edit</button></td>';
            bookData += '<td><button onclick="Delete('+ i +')">Delete</button></td>';
            bookData += '</tr>';
        }
    }
    return bookList.innerHTML = bookData
}

const add = function(){
    let book = newBook.value;
    console.log(book);
    if(book){
    books.push(book);
    newBook.value = ''
    }
    fetchAll();
    
}

const Delete = function(item){
    books.splice(item,1)
    fetchAll();
}

const Edit = function(item){
    editBook.value = books[item];
    editBox.style.display = 'block';

    formSubmitEdit.onsubmit = function(){
        let bookEdit = editBook.value
        if(bookEdit){
            books.splice(item,1, bookEdit);
            CloseInput();
            fetchAll();
        }
    }
}

const CloseInput = function(){
    document.getElementById('edit-box').style.display = 'none';
}