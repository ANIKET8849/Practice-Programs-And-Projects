$(document).ready(function(){
    $("#btn").click(function(){
        $(".div1").animate(
            $(".div1").css({
                "margin-left":"150px",
                "background-color":"red",
                'transition':'2s',
                "rotate":"45deg",
                "margin":"100px"
            })
        );
    })
});