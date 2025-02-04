// $(document).ready(function(){
//     $("#btn").click(function(){
//         $.ajax({
//             "url": "https://contextualwebsearch-websearch-v1.p.rapidapi.com/api/Search/ImageSearchAPI?q=taylor%20swift&pageNumber=1&pageSize=10&autoCorrect=true",
// 	"method": "GET",
// 	"headers": {
// 		"X-RapidAPI-Key": "a5ffd6d69cmsh8f337ef11f5f6c6p121f62jsn05a80c720857",
// 		"X-RapidAPI-Host": "contextualwebsearch-websearch-v1.p.rapidapi.com"
// 	},


//     success:function(data){
//         console.log(data);

//         for(let i=0; i<=data.length; i++){
//             $("#div1").append(`<p>${data[i].title}</p>`)
//         }
//     }
//         })
//     })
// })




$(document).ready(function(){
    $("#btn").click(function(){
        $.ajax({
            "url": "https://exercises-by-api-ninjas.p.rapidapi.com/v1/exercises?muscle=biceps",
            "method": "GET",
            "headers": {
                "X-RapidAPI-Key": "4bb3d7ddb9msh405282bf0df5278p1e5d3djsn7ddc4921d2c5",
                "X-RapidAPI-Host": "exercises-by-api-ninjas.p.rapidapi.com"
            },


    success:function(data){
        console.log(data);

        for(let i=0; i<=data.length; i++){
            $('#div1').append(`<p>${data[i].instructions}</p><p>${data[i].difficulty}</p>`)
        }
    }

        })
    })
})