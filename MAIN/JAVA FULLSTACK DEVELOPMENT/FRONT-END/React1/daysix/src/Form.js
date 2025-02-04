import React, { useState } from 'react'

function Form(props) {

    const [name, setName] = useState(null);
    const [age, setAge] = useState(null);
    const [valid1, setValid1] = useState(true);
    const [valid2, setValid2] = useState(true);


    function getName(e) {
        setName(e.target.value);
    }
    function getAge(e) {
        setAge(e.target.value);
    }

    function senddata() {
        // console.log(name,age)       
        // if(!name || !age){
        // setValid(false);
        // console.log(!name)
        if (!name) {
            setValid1(false)
        }
        if (!age) {
            setValid2(false)
        }
        // }

        if((!name===false) && (!age===false)){
            setValid1(true)
            setValid2(true)
            props.acceptdata(name, age)
        }

    }

    return (
        <div>
            <div>
                 <label >Name:</label>
                 <input type="text" placeholder='enter your name' onChange={getName}
                 style={{ borderColor: valid1 === true ? "green" : "red" }} />
            </div>

            <div>
                <label >Age:</label>
                <input type="text" placeholder='enter your age' onChange={getAge}
                style={{ borderColor: valid2 === true ? "green" : "red" }} />
            </div>

            <div>
                <button type='button' onClick={senddata}>Click here</button>
            </div>

        </div>
    )
}

export default Form
