function random(){
    document.write(parseInt(Math.random()*10000));
}

document.getElementById("btn").addEventListener("click",random);