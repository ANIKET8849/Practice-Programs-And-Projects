import React, { useState } from 'react'
import './Home.css'
import Header from '../../components/Header/Header'
import ExploreMenu from '../../components/ExploreMenu/ExploreMenu'
import Fooddisplay from '../../components/Fooddisplay/Fooddisplay';
import AppDownload from '../../components/AppDownload/AppDownload';


function Home() {
  const [catagory,setcatagory] =useState("All");
  return (
    <div>
      <Header/>
      <ExploreMenu catagory={catagory} setcatagory={setcatagory}/>
      <Fooddisplay catagory={catagory}/>
      <AppDownload/>
    </div>
  )
}

export default Home
