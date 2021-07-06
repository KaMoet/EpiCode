// es2.js: crea una funzione parametrica che ritorna una stringa, logga il risultato sulla console

// definisco la funzione e i suoi parametri
function rettangolo (lato1, lato2){
    // cosa deve ritornare come risultato
    return "l'area del rettangolo è " + lato1 * lato2;
}
// imposto le variabili
let a = 4;
let b = 6;

// passo come argomenti
let area = rettangolo (a, b);

console.log (area);