import React, { useContext } from 'react'
import './PlaceOrder.css'
import { StoreContext } from '../../components/Context/StoreContext'

const PlaceOrder = () => {

    const {getTotalCartAmount} = useContext(StoreContext)

  return (
    <form action="" className="place-order">
      <div className="place-order-left">
        <p className="tittle">Delivery  Information</p>
        <div className="multi-fields">
          <input type="text" placeholder='Enter Your First Name' />
          <input type="text" placeholder='Enter Your Last Name' />
        </div>
        <input type="email" placeholder='Enter Your Email' />
        <input type="text" placeholder='Street' />
        <div className="multi-fields">
          <input type="text" placeholder='Enter Your City' />
          <input type="text" placeholder='Enter Your State' />
        </div>
        <div className="multi-fields">
          <input type="text" placeholder='Enter Your Zip-Code' />
          <input type="text" placeholder='Enter Your Country' />
        </div>
        <input type="text" placeholder='Enter Your Phone Number' />
      </div>
      <div className="place-order-right">
      <div className="cart-total">
          <h2>Cart Total</h2>
          <div>
            <div className="cart-total-details">
              <p>Subtotal</p>
              <p>${getTotalCartAmount()}</p>
            </div>
            <hr />
            <div className="cart-total-details">
              <p>Delivery Fee</p>
              <p>${getTotalCartAmount()===0?0:2}</p>
            </div>
            <hr />
            <div className="cart-total-details">
              <b>Total</b>
              <b>${getTotalCartAmount()===0?0:getTotalCartAmount()+2}</b>
            </div>
            <hr />
          </div>
          <button>PROCEED TO PAYMENT</button>
        </div>
      </div>
    </form>
  )
}

export default PlaceOrder
