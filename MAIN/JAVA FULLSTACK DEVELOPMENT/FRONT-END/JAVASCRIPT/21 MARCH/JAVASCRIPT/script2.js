const getdata=document.querySelector(".btn1");

const options = {
    method: 'GET',
    url: 'https://stock-and-options-trading-data-provider.p.rapidapi.com/options/aapl',
    headers: {
      'X-RapidAPI-Proxy-Secret': 'a755b180-f5a9-11e9-9f69-7bf51e845926',
      'X-RapidAPI-Key': 'a5ffd6d69cmsh8f337ef11f5f6c6p121f62jsn05a80c720857',
      'X-RapidAPI-Host': 'stock-and-options-trading-data-provider.p.rapidapi.com'
    }
  };

  getdata.addEventListener("click",function(){
    axios.request(options).then(function(response){
        const parent=document.getElementsByClassName("tdata")[0];

        const data=response.data.calls;

        data.map(function(details){
            const tablerow=document.createElement("tr");
            parent.appendChild(tablerow);

            const tabledata1=document.createElement("td");
            const tabledata2=document.createElement("td");
            const tabledata3=document.createElement("td");
            const tabledata4=document.createElement("td");


            tablerow.appendChild(tabledata1);
            tablerow.appendChild(tabledata2);
            tablerow.appendChild(tabledata3);
            tablerow.appendChild(tabledata4);

            tabledata1.innerText=details.symbol;
            tabledata2.innerText=details.strike;
            tabledata3.innerText=details.open_interest;
            tabledata4.innerText=details.volume;
        })
    })
    .catch (function(error){
        console.log(error);
    })
  })