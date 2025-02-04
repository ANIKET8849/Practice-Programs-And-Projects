import React from 'react'
import './Header.css'

function Header() {
  return (
    <div className='header'>
      <div className="header-contents">
        <h2>Order Your Favourite Food Here</h2>
        <p>Order your favourite food from the comfort of your home</p>
        <button className="header-button">View Menu</button>
      </div>
    </div>
  )
}

export default Header
