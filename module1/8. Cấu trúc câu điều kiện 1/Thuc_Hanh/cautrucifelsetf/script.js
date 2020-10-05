let pass = prompt('Password?', '');

if (pass == 'TheMaster') {
    alert('Welcome!');
} else if (pass == null) {
    alert('Canceled.');
} else {
    alert('Wrong password');
}