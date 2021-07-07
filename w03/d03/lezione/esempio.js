var input = 9;

// if è più versatile
if (input > 0) {
    console.log("positivo");
}
else if (input < 0) {
    console.log("negativo");
}
else {
    console.log("uguale a 0");
}
console.log("finito");


var x = 1;

// lo switch si usa solo per uguaglianze
switch (x) {
    case 1:
        console.log("uno");
        break;
    case 2:
        console.log("due");
        break;
    default:
        console.log("qualcos'altro");
}

var y;
var x = 24;

// dico che il resto della divisione deve essere 0 quindi x pari
if (x % 2 == 0) {
    y = "pari";
}
else {
    y = "dispari";
}
console.log(y);

//  loops
var names = ["Tom", "Bob", "Pitt"];

for (let i = 0; i < names.length; i++) {
    console.log("Hello" + names[i])
}

let j = 0;
while (j < names.length) {
    console.log("Hello" + names[j]);
    j++;
}

let k = 0;
do {
    console.log("Hello" + names[k]);
    k++;
} while (k < names.length);


let utenti = ["fabio", "valeria", "francesca", "claudio"];

for (let i = 0; i < utenti.leght - 1; i++) {
    console.log(utenti[i]);
}

// for in

let utente = {
    "name": "Fabio",
    "surname": "Bernardi",
    "job": "developer"
};

for (let property in utente) {
    console.log(property);
    console.log(utente[property]);
}