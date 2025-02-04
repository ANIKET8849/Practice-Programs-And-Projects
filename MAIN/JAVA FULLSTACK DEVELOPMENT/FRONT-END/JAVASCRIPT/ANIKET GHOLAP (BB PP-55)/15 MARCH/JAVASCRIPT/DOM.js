// APPEND 


document.getElementById("btn1").addEventListener("click",append);
function  append(){
    let node=document.createElement("p");  //creating html element
    let content=document.createTextNode("This is my third paragraph");
    //creating text to add inside the element
    node.appendChild(content);  //appending (adding) the text to the element

    let parent=document.getElementsByClassName("parent")[0];
    //selecting the parent in which the element is to be add

    parent.appendChild(node);
}


//INSERT BEFORE

document.getElementById("btn2").addEventListener("click",before);
function before(){
    let node=document.createElement("h1");
    let content=document.createTextNode("HEADING TWO");
    node.appendChild(content);
    let parent=document.getElementsByClassName("parent")[0];
    let existing=document.getElementsByClassName("second")[0];

    parent.insertBefore(node,existing);
}



//  REPLACE  CHILD

document.getElementById("btn3").addEventListener("click",replace);
function replace(){
    let node=document.createElement("h3");
    let content=document.createTextNode("THIS IS HEADING");
    node.appendChild(content);
    let parent=document.getElementsByClassName("parent")[0];
    let existing=document.getElementsByClassName("head")[0];
    parent.replaceChild(node,existing);

}


// REMOVE 

document.getElementById("btn4").addEventListener("click",remove);
function remove(){
    let parent=document.querySelector("parent")[0];
    let existing=document.getElementsByClassName("second")[0];
    parent.removeChild(existing);
}







