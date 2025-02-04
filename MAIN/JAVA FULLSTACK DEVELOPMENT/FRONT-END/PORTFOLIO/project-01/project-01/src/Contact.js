import React from "react";
import { Link } from 'react-router-dom';
const Contact = () => {
    return (
        <>
            <div className="row section4">
            <div className="section4-img col-lg-6">
                <img src="IMAGES/10034.jpg" alt="IMAGES" height="100%" width="100%"></img>
            </div>
            <div className="section4-div col-lg-6">
                <h2>24/7 SUPPORT</h2>
                <h4>Award-Winning, Expert Customer Care</h4>
                <p>Get personalized support from our Customer Care Team via email or live chat. Customer Care Advisors
                    are highly trained and work with Designers and Engineers in our New York City and Dublin offices.
                    They have deep Squarespace knowledge and are ready to help whenever you need it. Reach out any time
                    — we’re here 24/7.</p> <br></br>
                <Link href="#">Visit Our Help Center</Link> <br></br>
                <Link href="#">Contact Customer Care</Link> <br></br>
                <Link href="#">Join a Webinar</Link> <br></br>
            </div>
        </div>

        </>
    )
}
export default Contact;
