$(document).ready(function(){
    $("#btn").click(function(){
        $.ajax({
            "url": "https://iata-and-icao-codes.p.rapidapi.com/airlines",
            "method": "GET",
            "headers": {
                "X-RapidAPI-Key": "a5ffd6d69cmsh8f337ef11f5f6c6p121f62jsn05a80c720857",
                "X-RapidAPI-Host": "iata-and-icao-codes.p.rapidapi.com"
            },


    success:function(data){
        console.log(data);

        for(let i=0; i<=data.length; i++){
            $('#div1').append(`<p>${data[i].name}</p><p>${data[i].icao_code}</p>`)
        }
    }

        })
    })
})