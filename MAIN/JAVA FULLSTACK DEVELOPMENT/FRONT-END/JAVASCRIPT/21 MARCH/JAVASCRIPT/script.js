const getdata=document.querySelector(".btn");


const options = {
  method: 'GET',
  url: 'https://apidojo-booking-v1.p.rapidapi.com/currency/get-exchange-rates',
  params: {base_currency: 'USD', languagecode: 'en-us'},
  headers: {
    'X-RapidAPI-Key': 'a5ffd6d69cmsh8f337ef11f5f6c6p121f62jsn05a80c720857',
    'X-RapidAPI-Host': 'apidojo-booking-v1.p.rapidapi.com'
  }
};

getdata.addEventListener("click",function(){
    axios.request(options).then(function(response){
        const parent=document.getElementsByClassName("tbody")[0];

        // console.log(responce.data.exchange_rates);

        const data=response.data.exchange_rates;

        data.map(function(details){
            const tablerow=document.createElement("tr");
            parent.appendChild(tablerow);

            const tabledata1=document.createElement("td");
            const tabledata2=document.createElement("td");

            tablerow.appendChild(tabledata1);
            tablerow.appendChild(tabledata2);

            tabledata1.innerText = details.currency;
            tabledata2.innerText = details.exchange_rate_buy;


        })
    })
    .catch(function(error){
        console.log(error);
    })
})