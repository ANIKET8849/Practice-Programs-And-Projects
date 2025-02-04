import React,{useState} from 'react';

export default function Form() {

  const [name,setName]= useState("Jack");
  const [age,setAge]=useState();
  const [data,setData]=useState([]);

  function getName(a){
    setName(a.target.value)
  }
  function getAge(b){
    setAge(b.target.value)
  }
  function getData(){
    setData([name,age])
  }
  
  return (

    <section>

      {/* <div>
        <input type='text' placeholder='Enter Name' onChange={getName}/>
        <hr/>
        <h1>My Name Is  {name}</h1>
      </div>
      <div>
        <input type='text' placeholder='Enter Age' onChange={getAge}/>
        <hr/>
        <h1>My Age Is  {age}</h1>
      </div> */}

      <div>
      <div>
        <input type='text' placeholder='Enter Age' onChange={getName}/><br> </br> <br></br>
        <input type='text' placeholder='Enter Age' onChange={getAge}/>
      </div>
      <div>
        <button type='button' onClick={getData}>Click</button>
      </div>
        <hr/>
        <h1>My name Is{data[0]} And My Age Is  {data[1]}</h1>
      </div>
    </section>
  );
}