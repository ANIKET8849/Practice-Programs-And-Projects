import React from 'react'
import './Footer.css'
import { assets } from '../../assets/assets'

const Footer = () => {
  return (
    <div className='footer' id='footer'>
      <div className="footer-content">
        <div className="footer-content-left">
          <img src={assets.logo} alt="" />
          <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Sint fuga laboriosam, quidem modi odit natus itaque facilis, asperiores architecto similique neque cupiditate et mollitia alias!</p>
          <div className="footer-social-icon">
            <img src={assets.facebook_icon} alt="Images" />
            <img src={assets.twitter_icon} alt="Images" />
            <img src={assets.linkedin_icon} alt="Images" />
          </div>
        </div>
        <div className="footer-content-center">
          <h2>COMPANY</h2>
          <ul>
           <li><a href="#">Home</a></li>
            <li><a href="#">About Us</a></li>
            <li><a href="#">Delivery</a></li>
            <li><a href="#">Privacy Policy</a></li>
          </ul>
        </div>
        <div className="footer-content-right">
          <h2>GET IN TOUCH</h2>
          <ul>
            <li><a href="#"> +91 9123456789</a></li>
            <li><a href="#"> contact@tomato.com</a></li>
          </ul>
        </div>
      </div>
      <hr />
      <p className="footer-copyright">Copyright © 2021 TOMATO. All rights reserved.</p>
    </div>
  )
}

export default Footer
