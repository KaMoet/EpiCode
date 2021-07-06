// es3.js: crea un oggetto con nome, cognome e un metodo che logga nome più cognome sulla console

var persona = {
    nome: "Martin",
    secondonome: "Luther",
    cognome: "King",

    print:function(){
        console.log(this.nome, this.secondonome, this.cognome);
    }
};

persona.print();
