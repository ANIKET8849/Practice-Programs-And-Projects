$(document).ready(function(){
    $('.h1').focus(function(){
        $('.span').css({
            'transition': '2s',
            'font-size': '40px',
            'color': 'red'
        })
    })
})