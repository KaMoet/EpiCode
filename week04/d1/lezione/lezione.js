// creo un oggetto vuoto
var strumenti = {};
// inserisco proprietà all'oggetto
strumenti.chitarra = "a corda";
strumenti.pianoforte = "a corda";
strumenti.tromba = "a fiato";
// creo un alert
strumenti.alert = function () {
  alert("questi sono alcuni");
};
// stampo strumenti
console.log(strumenti);


// funzione costruttore
function Person(name) {
  this.name = name;
  this.greetings = function () {
    console.log("Hi, " + this.name);
  };
// funzione lamda (abbreviata)
  this.greetings2 = () => {
      consol.log('Hi, ' + this.name);
  };
}
// ho aggiunto due utenti
var utente = new Person("Fabio");
var utente2 = new Person("Tom");
// stampo tutto
console.log(utente);
console.log(utente2);
utente.greetings();
utente2.greetings();
utente2.greetings2();
