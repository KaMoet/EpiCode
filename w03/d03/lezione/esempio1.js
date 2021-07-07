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


var x=1;

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
var x=24;

// dico che il resto della divisione deve essere 0 quindi x pari
if (x % 2 == 0) {
    y = "pari";
}
else {
    y = "dispari";
}
console.log(y);