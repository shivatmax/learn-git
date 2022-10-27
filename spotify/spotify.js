console.log("Welcom to spotify");

let songIndex = 0;
let audioElement = new Audio("1.mp3");
let masterplay = document.getElementById('masterplay');
let bar = document.getElementById('bar');
let gif = document.getElementById('gif');
let songItems = document.getElementsByClassName('songItem');


let songs = [
    {songName: "Fine",filePath:"songs/Fine.mp3",coverPath:"covers/.jpg"},
    {songName: "Ghost",filePath:"songs/Ghost.mp3",coverPath:"covers/.jpg"},
    {songName: "let me love you",filePath:"songs/let me love you.mp3",coverPath:"covers/let me love you.jpg"},
    {songName: "Animals",filePath:"songs/Animals.mp3",coverPath:"covers/.jpg"},
    {songName: "cradles",filePath:"songs/cradles.mp3",coverPath:"covers/.jpg"},    
    {songName: "stay",filePath: "song/stay.mp3",coverPath:"covers/.jpg"},
]

songItems.forEach((element) =>{
    console.log(element, i);
    element.getElementsByTagName("img")[0].src = songs[i].filePath;
})

// audioElement.play();
masterplay.addEventListener('click',()=>{
    if(audioElement.paused || audioElement.currentTime<=0){
        audioElement.play(); 
        masterplay.classList.remove("fa-circle-play");
        masterplay.classList.add('fa-circle-pause');
        gif.style.opacity =  1;
    }
    else{
        audioElement.pause(); 
        masterplay.classList.remove('fa-circle-pause');
        masterplay.classList.add('fa-circle-play');
        gif.style.opacity = 0;

    }
})

audioElement.addEventListener('timeupdate', ()=>{
    console.log('timeupdate');

    progress = parseInt((audioElement.currentTime/audioElement.duration)*100);
    console.log(progress);
    bar.value = progress;


})

bar.addEventListener('change', ()=>{
    audioElement.currentTime = bar.value*audioElement.duration/100;
})

