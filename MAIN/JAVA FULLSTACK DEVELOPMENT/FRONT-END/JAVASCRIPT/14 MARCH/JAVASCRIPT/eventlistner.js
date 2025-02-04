// CLICK 

// function color(){
//     document.getElementById("div1").style.backgroundColor="blue";
//     document.getElementById("para").style.color="grey";
// }
// document.getElementById("btn").addEventListener("click",color);

// On Change Listener

function Violet(){
    document.getElementById("Div1").style.background="Violet";
}

function Purple(){
    document.getElementById("Div1").style.background="Purple";
    document.getElementById("Div1").style.color="White";
}

document.getElementById("Violet").addEventListener("change",Violet);
document.getElementById("Purple").addEventListener("change",Purple);


// On Click Listener


function Black(){
    document.getElementById("Div2").style.background="Black";
    document.getElementById("Div2").style.color="White";
}

document.getElementById("btn").addEventListener("click",Black);


// Mouse Event

function Blue(){
    document.getElementById("Div3").style.background="BlueViolet";
    document.getElementById("Div3").style.color="White";
}

document.getElementById("Div3").addEventListener("mouseover",Blue);


// Key Event

function BurlyWood(){
    document.getElementById("Input1").style.background="BurlyWood";
    document.getElementById("Input1").style.color="White";
}

document.getElementById("Input1").addEventListener("keyup",BurlyWood);
