import React from 'react'
import './AppDownload.css'
import { assets } from '../../assets/assets'

const AppDownload = () => {
  return (
    <div  className='app-download' id='app-download'>
      <p>For Better Experince Download <br /> Tomato App</p>
      <div className="app-download-platforms">
        <img src={assets.play_store} alt="play store" />
        <img src={assets.app_store} alt="app Store" />
      </div>
    </div>
  )
}

export default AppDownload
