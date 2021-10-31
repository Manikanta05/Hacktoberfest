let firstPlayerName = "";
let secondPlayerName = "";
let firstPlayerScore = 0;
let secondPlayerScore = 0;
let totalScore = 0;

function onSubmit(event) {
  event.preventDefault();
  const formData = document.getElementsByTagName("input");
  firstPlayerName = formData[0].value;
  secondPlayerName = formData[1].value;
  totalScore = formData[2].value;
  document.getElementById("form-container").style.display = "none";
  document.getElementById("board-container").style.display = "block";
  document
    .getElementById("player1")
    .getElementsByClassName("heading")[0].innerHTML = firstPlayerName;
  document
    .getElementById("player2")
    .getElementsByClassName("heading")[0].innerHTML = secondPlayerName;
}

function rollDice(playerIndex) {
  const randomNumber = getRandom();
  const playerNodes = document.getElementById(`player${playerIndex}`);
  playerNodes
    .querySelector(".dice img")
    .setAttribute("src", `./images/dice${randomNumber}.png`);
  switch (playerIndex) {
    case 1:
      firstPlayerScore += randomNumber;
      playerNodes.getElementsByClassName("score")[0].innerHTML =
        firstPlayerScore;
      playerNodes
        .getElementsByTagName("input")[0]
        .setAttribute("disabled", true);
      document
        .getElementById("player2")
        .getElementsByTagName("input")[0]
        .removeAttribute("disabled");
      break;
    case 2:
      secondPlayerScore += randomNumber;
      playerNodes.getElementsByClassName("score")[0].innerHTML =
        secondPlayerScore;
      playerNodes
        .getElementsByTagName("input")[0]
        .setAttribute("disabled", true);
      document
        .getElementById("player1")
        .getElementsByTagName("input")[0]
        .removeAttribute("disabled");
      break;
    default:
      break;
  }
  checkIfWinnerExists();
}

function getRandom() {
  return Math.ceil(Math.random() * 6) ;
}

function checkIfWinnerExists() {
  if (firstPlayerScore >= totalScore) {
    document.getElementById(
      "player1"
    ).innerHTML += `<div class="winner"></div>`;
    document
      .getElementById("player2")
      .getElementsByTagName("input")[0]
      .setAttribute("disabled", true);
  }
  if (secondPlayerScore >= totalScore) {
    document.getElementById(
      "player2"
    ).innerHTML += `<div class="winner"></div>`;
    document
      .getElementById("player1")
      .getElementsByTagName("input")[0]
      .setAttribute("disabled", true);
  }
}
function resetGame(event){
   event.preventDefault(); 
   firstPlayerScore = 0; 
   secondPlayerScore = 0;
    let players=document.getElementsByClassName("board"); 
    for(let i=0;i<players.length;i++){
       players[i].querySelector(".score").innerHTML=0; 
       players[i].querySelector(".dice img").src=`./images/dice1.png`; 
       if(i==0){ 
         players[i].querySelector('#player-1-button input').enabled=true; 
        }
         else{ players[i].querySelector('#player-2-button input').enabled=false;
         } 
    } 
  }


// let btnClear = document.querySelector('button');
// let inputs = document.querySelectorAll(input);

// btnClear.addEventListener('click',()=>{
//   inputs.forEach(input => input.value ='');
// });