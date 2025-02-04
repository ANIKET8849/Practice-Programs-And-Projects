import React from 'react'
import { Link } from 'react-router-dom';


const Footer = () => {
  return (
    <>
      <div className='footer conatiner-fluid'>
        <div className='footer-wrapper container pt-5'>
          <div className="row  text-start pt-3 pb-3">
            <div className=" col-12 col-md-6 col-lg-3 mb-4 text-start">
              <div>
                <img src='img/ilustration/laptop1.png' alt='logo' className='img-fiuid' />
              </div>
              <p className="text-white pt-2 lh-lg">Consectetur adipisicinhg cvelicsed do eiusmod tempor inciducvccnt ut labosvrer adipisic.</p>
              <div className="social-icons d-flex justify-content-evenly text-center text-muted">
                <Link to="#" className="text-white" href=""><i className="bi bi-facebook "></i></Link>
                <Link to="#" className="text-white" href=""><i className="bi bi-instagram "></i></Link>
                <Link to="#" className="text-white" href=""><i className="bi bi-skype "></i></Link>
                <Link to="#" className="text-white" href=""><i className="bi bi-linkedin "></i></Link>
              </div>
            </div>

            <div className="col-12 col-md-6 col-lg-3 mb-4 text-start">
              <div className="menu text-start">
                <h6 className="fw-semibold text-white fs-3 pb-2 px-4">Quick Links</h6>
                <ul className="footer-list">
                  <li className="lh-lg"><Link className="text-white lh-lg" href="#">Get Coupon</Link></li>
                  <li className="lh-lg"><Link className="text-white lh-lg" href="#">Offer & Discount</Link></li>
                  <li className="lh-lg"><Link className="text-white lh-lg" href="#">About</Link></li>
                  <li className="lh-lg"><Link className="text-white lh-lg" href="#">Contact  US</Link></li>
                </ul>
              </div>
            </div>

            <div className="col-12 col-md-6 col-lg-3 mb-4 text-start ">
              <div className="menu">
                <h6 className="fw-semibold fs-3 pb-2 px-4 text-white">Help</h6>
                <ul className="footer-list text-start">
                  <li className="lh-lg "><Link className="text-white" href="#">Woman Cloths</Link></li>
                  <li className="lh-lg"><Link className="text-white " href="#">Fashion Accessories</Link></li>
                  <li className="lh-lg"><Link className="text-white" href="#"> Man Accessories</Link></li>
                  <li className="lh-lg"><Link className="text-white " href="#">Ruber Made Toy</Link></li>
                </ul>
              </div>
            </div>
            <div className="col-12 col-md-6 col-lg-3 mb-4 text-start ">
              <div className="menu">
                <h6 className="fw-semibold fs-3 pb-2 px-4 text-white">Support</h6>
                <ul className="footer-list text-start">
                  <li className="lh-lg"><Link to="#" className="text-white" href="#">Frequently asked questions</Link></li>
                  <li className="lh-lg"><Link className="text-white " href="#">Terms & Condition</Link></li>
                  <li className="lh-lg"><Link className="text-white" href="#"> Privacy Policy</Link></li>
                  <li className="lh-lg"><Link className="text-white " href="#">Payement issue</Link></li>
                </ul>
              </div>

            </div>


            <hr />
            <div className="line text-center pt-2 pb-2">
              <p className="text-white">Copyright ©2023 All rights reserved | This template is made with <span className='text-danger'><i className="bi bi-heart-fill"></i></span> by <span className="text-danger fw-semibold">Uddesh Shelke.</span></p>
            </div>


          </div>
        </div>
      </div>
    </>

  )
}

export default Footer;