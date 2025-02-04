/*==============================Typing Animation===========================================*/
var typed =new Typed(".typing",{
    strings:["","Fullstack Developer","Web Developer","UI_UX Designer","Web Designer"],
    typeSpeed:100,
    BackSpeed:60,
    loop:true
})

/*==============================Aside===========================================*/
const nav = docume.querySelector(".nav"),
    navList= nav.querySelectorAll("li"),
    totalNavList = navList.length;
    for(let i= 0 ; i<totalNavList; i++){
        console.log(navList[i])
    }