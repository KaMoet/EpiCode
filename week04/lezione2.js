function Person(name) {
    this.name = name;
}

var utente = new Person ('Fabio');
console.log(utente);
console.log(utente.name);

Person.prototype.greetings=function () {
    console.log('Hi, '+this.name);
};

utente.greetings();

let utente2 =new Person('Tom');
utente2.greetings();