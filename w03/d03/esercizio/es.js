let user =""

let loginBtn = document.getElementById("login_btn");
loginBtn.addEventListener("click", login);

function login() {
    let usr = document.querySelector("#username").value; 
    let pwd = document.querySelector("#password").value;
    
    console.log('Wrong username or password');

    if(usr == user && pwd == password){
        console.log("credenziali valide")
    }
    else {
        console.log("credenziali errate")
    }
}