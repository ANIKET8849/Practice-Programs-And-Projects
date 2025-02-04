const getdata=document.getElementsByClassName("btn1")[0];

const options = {
    method: 'GET',
    url: 'https://corona-virus-world-and-india-data.p.rapidapi.com/api',
    headers: {
      'X-RapidAPI-Key': '808654feaamsh6052aaed5745655p1fe261jsne74a996986f7',
      'X-RapidAPI-Host': 'corona-virus-world-and-india-data.p.rapidapi.com'
    }
  };

  getdata.addEventListener("click",function(){
    axios.request(options).then(function(response){
        // console.log(response.data.countries_stat);

        let parent=document.getElementsByClassName("tbody")[0];
        let data=response.data.countries_stat;

        data.map(function(details){
            const tablerow=document.createElement('tr');
            parent.appendChild(tablerow);

            const dataone=document.createElement('td');
            const datatwo=document.createElement('td');
            const datathree=document.createElement('td');
            const datafour=document.createElement('td');

            tablerow.appendChild(dataone);
            tablerow.appendChild(datatwo);
            tablerow.appendChild(datathree);
            tablerow.appendChild(datafour);

            dataone.innerText=details.country_name;
            datatwo.innerText=details.cases;
            datathree.innerText=details.deaths;
            datafour.innerText=details.total_recovered;



        });

    }).catch(function(error){
        console.log(error);
    })
  })