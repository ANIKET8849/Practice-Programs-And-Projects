const getdata=document.querySelector(".btn");

const options = {
    method: 'GET',
    url: 'https://corona-virus-world-and-india-data.p.rapidapi.com/api',
    headers: {
      'X-RapidAPI-Key': 'a5ffd6d69cmsh8f337ef11f5f6c6p121f62jsn05a80c720857',
      'X-RapidAPI-Host': 'corona-virus-world-and-india-data.p.rapidapi.com'
    }
  };

  getdata.addEventListener("click",function(){
    axios.request(options).then(function(response){
        const parent=document.getElementsByClassName("tbody")[0];

        const data=response.data.countries_stat;

        data.map(function(details){
            const tablerow = document.createElement("tr");
            parent.appendChild(tablerow);

            const tabledata1=document.createElement("td");
            const tabledata2=document.createElement("td");
            const tabledata3=document.createElement("td");
            const tabledata4=document.createElement("td");

            tablerow.appendChild(tabledata1);
            tablerow.appendChild(tabledata2);
            tablerow.appendChild(tabledata3);
            tablerow.appendChild(tabledata4);

            tabledata1.innerText = details.country_name;
            tabledata2.innerText = details.cases;
            tabledata3.innerText = details.deaths;
            tabledata4.innerText = details.total_recovered;



        })
    })
    .catch(function(error){
        console.log(error);
    })
  })