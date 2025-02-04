const getdata=document.querySelector(".btn");


const options = {
    method: 'GET',
    url: 'https://investing-cryptocurrency-markets.p.rapidapi.com/get-meta-data',
    params: {locale_info: 'en_US', lang_ID: '1', time_utc_offset: '28800'},
    headers: {
      'X-RapidAPI-Key': 'a5ffd6d69cmsh8f337ef11f5f6c6p121f62jsn05a80c720857',
      'X-RapidAPI-Host': 'investing-cryptocurrency-markets.p.rapidapi.com'
    }
  };

getdata.addEventListener("click",function(){
    axios.request(options).then(function(response){
        const parent=document.getElementsByClassName("tbody")[0];

        // console.log(responce.data.exchange_rates);

        const data=response.data.countries;

        data.map(function(details){
            const tablerow=document.createElement("tr");
            parent.appendChild(tablerow);

            const tabledata1=document.createElement("td");
            const tabledata2=document.createElement("td");

            tablerow.appendChild(tabledata1);
            tablerow.appendChild(tabledata2);

            tabledata1.innerText = details.cname;
            tabledata2.innerText = details.country_international_phone_code;


        })
    })
    .catch(function(error){
        console.log(error);
    })
})