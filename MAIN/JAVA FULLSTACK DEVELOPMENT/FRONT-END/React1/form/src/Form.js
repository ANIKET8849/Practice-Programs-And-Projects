import React,{useState} from 'react';

export default function Form() {

  const [name,setName]= useState("Jack");
  const [age,setAge]=useState();
  const [City,setCity]=useState();
  const [address,setAddress]=useState();
  const [state,setState]=useState();
  const [zipcode,setZipcode]=useState();
  const [mobile,setMobile]=useState();
  const [data,setData]=useState([]);

  function getName(a){
    setName(a.target.value)
  }
  function getAge(b){
    setAge(b.target.value)
  }
  function getCity(a){
    setCity(a.target.value)
  }
  function getAddress(a){
    setAddress(a.target.value)
  }
  function getState(a){
    setState(a.target.value)
  }
  function getZipcode(a){
    setZipcode(a.target.value)
  }
  function getMobile(a){
    setMobile(a.target.value)
  }
  function getData(){
    setData([name,age,City,address,state,zipcode,mobile])
  }
  
  return (

    <section>

  

      <div>
      <div>
        <input type='text' placeholder='Enter Name' onChange={getName}/>
        <input type='text' placeholder='Enter Age' onChange={getAge}/>
        <input type='text' placeholder='Enter City' onChange={getCity}/>
        <input type='text' placeholder='Enter Address' onChange={getAddress}/>
        <input type='text' placeholder='Enter State' onChange={getState}/>
        <input type='text' placeholder='Enter Zipcode' onChange={getZipcode}/>
        <input type='text' placeholder='Enter Mobile No.' onChange={getMobile}/>
      </div>
      <div>
        <button type='button' onClick={getData}>Click</button>
      </div>
        <hr/>
    
        <h5>Name : {data[0]}</h5>
        <h5>Age : {data[1]}</h5>
        <h5>City : {data[2]}</h5>
        <h5>Address : {data[3]}</h5>
        <h5>State : {data[4]}</h5>
        <h5>Zipcode : {data[5]}</h5>
        <h5>Mobile No. : {data[6]}</h5>
      </div>
    </section>
  );
}