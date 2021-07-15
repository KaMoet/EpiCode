let audio = [];
let video = [];
$.getJSON('./media/media.json', (data) =>{
    audio = data.audio;
    video= data.video;
});

let audiolist = document.getElementById('audioList');
let songs = document.getElementById('audio');

function playeraudio() {
    for(let i=0; i<audio.length; i++){
        audiolist.innerHTML+=`<li onclick='playsong(${i})'>${audio[i].title}</li>`

    }
};
window.addEventListener('load',()=>{
    playeraudio();
})
function playsong(i) {
    songs.src = audio[i].file;
    songs.play();
};


let videolist = document.getElementById('videoList');
let videos = document.getElementById('video');

function playervideo() {
    for(let i=0; i<video.length; i++){
        videolist.innerHTML+=`<li onclick='playvideo(${i})'>${video[i].title}</li>`

    }
};
window.addEventListener('load',()=>{
    playervideo();
})
function playvideo(i) {
    videos.src = video[i].file;
    videos.play();
};
