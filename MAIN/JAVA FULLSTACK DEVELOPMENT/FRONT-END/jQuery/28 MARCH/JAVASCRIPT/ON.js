$(document).ready(function(){
    $("#div1").on("click",function(){
        $(this).css({
            "background-color":"grey",
            'transition': '3s',
            'height': '400px',
            "width":"320px",
            'rotate': '360deg',
            "margin":"200px"
        })
    })
})