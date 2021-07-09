let toDoList = [];
const KEY = "myUL";

window.addEventListener("load", function () {
  let x = localStorage.getItem("toDoList");
  if (x != null) {
    toDoList = JSON.parse(x);
  }
});

function save() {
    let x = JSON.stringify(toDoList);
    localStorage.setItem(KEY, x);
}

document.getElementById('add_button').addEventListener('click',function(){
  let x = document.getElementById('myInput').value;
  save();
});