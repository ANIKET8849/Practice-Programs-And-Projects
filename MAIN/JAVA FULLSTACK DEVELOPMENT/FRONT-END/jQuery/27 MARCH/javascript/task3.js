$(document).ready(function(){
    $("#btn").click(function(){
        $(".header").css({
            "color":"green","background-color":"grey",
            'font-family':'Poppins, sans-serif',
            'font-family':'Fasthand, cursive',
            "letter-spacing":"5px"
        });
        $(".div1").css({
            "margin":"50px","border":"5px solid red","border-radius":"100px","height":"400px","width":"900px","padding":"50px"
        });
    })
});