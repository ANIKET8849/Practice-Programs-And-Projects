import React, { useContext } from 'react'
import './Fooddisplay.css'
import { StoreContext } from '../Context/StoreContext'
import FoodItem from '../FoodItem/FoodItem'

function Fooddisplay({catagory}) {
    const {food_list}= useContext(StoreContext)


  return (
    <div className='food-display' id='food-display'>
      <h2>Top Dishes Near You</h2>
      <div className="food-display-list">
        {food_list.map((item,index)=>{

          if(catagory === "All" || catagory === item.catagory){
            return <FoodItem key={index} id={item._id} name={item.name} description={item.description} price={item.price} image={item.image} />
          }
          
        })}
      </div>
    </div>
  )
}

export default Fooddisplay
