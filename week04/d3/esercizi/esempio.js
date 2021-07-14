var audio = document.getElementById("audio");
document.getElementById("play").addEventListener("click", play);
document.getElementById("back").addEventListener("click", back);
document.getElementById("forward").addEventListener("click", forward);

function play(){
  audio.play();
  document.getElementById("play").textContent = "Pause";
  document.getElementById("play").id="pause";
  document.getElementById("pause").addEventListener("click", pause);
}
function pause(){
  audio.pause();
  document.getElementById("pause").textContent = "Play";
  document.getElementById("pause").id="play";
  document.getElementById("play").addEventListener("click", play);
}

function back() {
    audio.currentTime -= 10;
}

function forward() {
    audio.currentTime += 10;
}