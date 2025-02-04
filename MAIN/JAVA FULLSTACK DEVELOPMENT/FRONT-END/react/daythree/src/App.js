import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import { useState } from 'react';

function App() {
  const[data,setdata]=useState(0)
  const updatedata = ()=>{
    setdata(data+1)
  }
  return (
    <div className="App">
    <h1>
      {data}
    </h1>
    <button type='button' className='btn btn-secondary' onClick={updatedata}>click</button>
    </div>
  );
}

export default App;
