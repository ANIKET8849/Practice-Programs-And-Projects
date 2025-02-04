import React,{useState} from 'react';
import './App.css';
import Form from './Form';

export default function App() {

  const empData=[
    
  ];

  const [data,setData] =useState(empData);

  function getData(name,age,addr,city,state,zipcode,mobileno,emailaddr){
    console.log('Inside App.Js');
    console.log(name,age,addr,city,state,zipcode,mobileno,emailaddr);
    setData(previousState=> [...previousState,{name:name,age:age,addr:addr,city:city,state:state,zipcode:zipcode,mobileno:mobileno,emailaddr}]);
  }
  return (
    <section>
      <Form acceptData={getData}/>
      {
        console.log(data)
      }
    </section>
 );
}