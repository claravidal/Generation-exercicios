
function js_style() {
    document.getElementById("text").style.color = "blue";
    document.getElementById("text").style.fontSize = "30px";
    document.getElementById("text").style.backgroundColor = "black" ;
    document.getElementById("text").innerHTML = "NÃO É MAGIA, É CIÊNCIA!" ;
    //document.getElementById("imagembruxaria").innerHTML = "src = https://media.giphy.com/media/7dCAgQjU64djO/giphy.gif"
    document.getElementsByTagName("div") [0].innerHTML += '<img id = "imagembruxaria" src="https://media.giphy.com/media/7dCAgQjU64djO/giphy.gif" alt="é ciência!">';
    document.getElementsByTagName("body")[0].style.backgroundImage = "url('quimica.jpg')";
}
