import React, {useState} from 'react';
import './App.css';
import axios from 'axios';

function App() {
  const [data, setData] = useState([])

  function getData(){
    const opt={
      method: 'GET',
      url: 'https://sportscore1.p.rapidapi.com/sports/1/teams',
      params: {page: '1'},
      headers: {
        'X-RapidAPI-Key': 'a5ffd6d69cmsh8f337ef11f5f6c6p121f62jsn05a80c720857',
        'X-RapidAPI-Host': 'sportscore1.p.rapidapi.com'
      }
    }
    axios(opt).then((response) =>{
      setData(response.data.data);
    }).catch((error) => {
      console.log(error);
    });
  }
  return (
   <React.Fragment>
    <section>
      <button type='button' className='btn btn-lg btn-success' onClick={getData}>Get Data</button>
    </section>
    <hr/>
    {
      console.log(data)
    }
   </React.Fragment>
  );
}

export default App;
