import React,{useState} from 'react'
import Form from './Form'

const App = () => {
const empData=[]

const[data,setData]=useState(empData)


  function getData(x,y){
    //console.log("Inside App");
    //console.log({name: x, age: y})
    setData(PreviousState=>[...PreviousState,{name: x, age: y}])
  }



  return (
    <div>
      <Form acceptdata={getData}/>
      {/* {console.log(data)} */}
      <table width="100%" border="1" cellPadding="10">
        <thead>
        <tr>
          <th>Name</th>
          <th>Age</th>
        </tr>
        </thead>
        <tbody>
          {data.map((e)=>{
            return(
          <tr>
            <td>{e.name}</td>
            <td>{e.age}</td>
          </tr>
            )
          })}
          
        </tbody>
        
      </table>
    
    </div>
  )
}

export default App