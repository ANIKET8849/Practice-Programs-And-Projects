import React, { useRef, useState } from "react";

export default function NewComp(){

    const [userName,setUserName]=useState();
    const ele =useRef();
    const inputValue=useRef();

    function changeStyle(){
        ele.current.style.background="#ffff00";
    }
    function getName(){
        setUserName(inputValue.current.value);
        inputValue.current.style.borderBottom="2px solid green";
        console.log(inputValue.current.value);

    }
    return(
        <>
            <h1>Hello</h1>
            <p>lorem lipsom</p>
            <p ref={ele}>lorem lipsom</p>
            <hr/>

            <div style={{"margin":"20px 0"}}>
                <input type="text" placeholder="Enter Data" ref={inputValue}/>
            </div>

            <button type="button" onClick={changeStyle}>Change Style</button>
            <button type="button" onClick={getName}>Get Name</button>

            <h1>{userName}</h1>
        </>
    );
}