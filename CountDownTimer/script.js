var start = document.querySelector(".btn-start");
var pause = document.querySelector(".btn-stop");
var reset = document.querySelector(".btn-reset");

var hour = document.querySelector(".hour");
var minute = document.querySelector(".minute");
var second = document.querySelector(".second");

// reference stored
var startTimer = null;

// time manipulation
function timer(){
    if(hour.value == 0 && minute.value == 0 && second.value == 0){
        hour.value = 0;
        minute.value = 0;
        second.value = 0;
    } else if(second.value != 0){
        second.value--;
    } else if(minute.value != 0 && second.value == 0){
        second.value = 59;
        minute.value--;
    } else if(hour.value != 0 && minute.value == 0){
        minute.value = 60;
        hour.value--;
    }
    return;
}

//stop the timer 
function stopInterval() {
    clearInterval(startTimer);
}

start.addEventListener('click', function(){
    //initialize the variable
    function startInterval(){
        startTimer = setInterval(function() {
            timer();
        }, 1000);
    }
    // putting a conditional check for a potential bug
    if(hour.value == 0 && minute.value == 0 && second.value == 0){
        start.classList.add("disabled");
        return;
    }else{
        start.classList.remove("disabled");
        startInterval();
    }
})

pause.addEventListener('click', function(){
    //stop the timer after pressing "reset"
    stopInterval();
})

reset.addEventListener('click', function(){
    hour.value = 0;
    minute.value = 0;
    second.value = 0;
    //stop the timer after pressing "reset"
    stopInterval();
})