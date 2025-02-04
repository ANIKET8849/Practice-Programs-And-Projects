
// const printname= () => { 
//     const username = document.getElementsByTagName("input")[0].value;
    
//     document.querySelectorAll(".demo")[0].innerHTML="HELLO "+username;
//     console.log(document.querySelectorAll(".demo")[0])
// }

// document.getElementsByTagName("button")[0].addEventListener("click", printname());

document.getElementsByTagName("button")[0].addEventListener('click', () => {
    const username = document.getElementsByTagName("input")[0].value;
    document.querySelectorAll(".demo")[0].innerHTML="HELLO "+username;
})