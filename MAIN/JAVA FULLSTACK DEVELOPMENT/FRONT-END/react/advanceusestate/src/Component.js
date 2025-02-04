
import { useState } from "react";

function Component(props) {

    const[value,setvalue]=useState();

    const getValue=(event)=>{
        setvalue(event.target.value)
    }
    const clickme=()=>{
        props.datavalue(value)
    }

  return (
    <div className="App">
    <div className="container mt-5">

     <input type="text" className="form-control w-50 mx-auto" onChange={getValue}/>
     <button type="submit" onClick={clickme} className="btn btn-primary mt-4">click</button>
    </div>
     
    </div>
  );
}

export default Component;