var coder = {
    name: 'tom',
    job:{
        title: 'developer',
        languages: ['JavaScript','HTML','CSS']
    }
};
console.log(coder);

//trasformo il mio oggetto JS "coder" in una stringa JSON
var coderJSON = JSON.stringify(coder);
console.log(coderJSON);

//trasformare la stringa in un oggetto JS
var myCoder = JSON.parse(coderJSON);
console.log(myCoder);

console.log(myCoder.job.languages[2]);