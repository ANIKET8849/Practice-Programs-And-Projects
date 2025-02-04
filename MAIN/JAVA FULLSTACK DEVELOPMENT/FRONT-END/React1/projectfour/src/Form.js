import React, {useState} from "react";

export default function Form(props){
    const [name, setName] =useState("");
    const [age, setAge] =useState();
    const [addr,setAddr] =useState("");
    const [city,setCity]=useState("");
    const [state, setState] =useState("");
    const [zipcode, setZipCode] =useState();
    const [mobileno, setMobileNo] =useState();
    const [emailaddr, setEmailAddr] =useState();
    const [data, setData]=useState({});
    

    function getName(a){
        setName(a.target.value)
    }
    function getAge(event){
        setAge(event.target.value)
    }
    function getAddr(addr){
        setAddr(addr.target.value)
    }
    function getCity(city){
        setCity(city.target.value)
    }
    function getState(state){
        setState(state.target.value)
    }
    function getZipCode(zipcode){
        setZipCode(zipcode.target.value)
    }
    function getMobileNo(mobileno){
        setMobileNo(mobileno.target.value)
    }
    function getEmailAddress(emailaddr){
        setEmailAddr(emailaddr.target.value)
    }
    function getData(){
        // setData({name:name, age:age})
        props.acceptData(name,age,addr,city,state,zipcode,mobileno,emailaddr)
    }

    return(
        <section>
            <div>
                Enter Your Name:
                <input type="text" placeholder="Enter Name" onChange={getName}/>
            </div>

            <br></br>

            <div>
                Enter Your Age:
                <input type="text" placeholder="Enter Age" onChange={getAge}/>
            </div>

            <br></br>

            <div>
                Enter Your Address:
                <input type="text" placeholder="Enter Address" onChange={getAddr}/>
            </div>

            <br></br>

            <div>
                Enter Your City:
                <input type="text" placeholder="Enter City" onChange={getCity}/>
            </div>

            <br></br>

            <div>
                Enter Your State:
                <input type="text" placeholder="Enter State" onChange={getState}/>
            </div>

            <br></br>

            <div>
                Enter  ZipCode:
                <input type="text" placeholder="Enter ZipCode" onChange={getZipCode}/>
            </div>

            <br></br>

            <div>
                Enter MobileNo:
                <input type="text" placeholder="Enter MobileNo" onChange={getMobileNo}/>
            </div>
            <br></br>
            
            <div>
                Enter EmailAddress:
                <input type="text" placeholder="Enter EmailAddress" onChange={getEmailAddress}/>
            </div>
            <br></br>
            <div>
                <button type="button" onClick={getData}>Submit</button>
            </div>
            <hr/>

            {/* <h1>My Name is {name} and My Age is{age}</h1> */}
            {/* <h1>My name is{data.name} and my name is{data.age}</h1> */}
            <h1>Name : {name} {data.name}<br></br><br></br>
                Age: {age} {data.age}<br></br><br></br>
                Address:  {addr} {data.addr}<br></br><br></br>
                City: {city}{data.city}<br></br><br></br>
                State: {state}{data.state}<br></br><br></br>
                ZipCode:{zipcode}{data.zipcode}<br></br><br></br>
                MobileNo:{mobileno}{data.mobileno}<br></br><br></br>
                EmailAddress:{emailaddr}{data.emailaddr}
            </h1>
        </section>
)
}