import React from "react";
import { Link } from 'react-router-dom';
const Contact = () => {
    return (
        <>
            <div className="Contact-area">
                <div className='about-heading'>
                    <div className='pt-5 pb-5'>
                        <h2 className='text-white text-center pt-5 pb-5  fw-bolder fs-1'>Contacts</h2>
                    </div>
                </div>
                <div className="container contact">
                    <div className="py-5">
                        <div className="row justify-content-center p-md-4">
                            <div className="col-xxl-9 col-xl-11 col-lg-12  row shadow-lg rounded-4 p-3">
                                <div className="col-md-8 pt-4 pb-3">
                                    <h4 className="text-center  fw-bolder fs-1">GET IN TOUCH</h4>
                                    <p className="text-center pt-3 text-dark fs-5">
                                        Still Confused how PrepBytes can help you  achieve your dream?
                                        Talk to our experts Designer Sorem spsum dolor sit amsectetur adipisclit, seddo eiusmod tempor incididunt ut laborea..
                                    </p>
                                    <div className="p-4 ">
                                        <img src="img/ilustration/home-42.png" className="img-fluid" />
                                    </div>
                                </div>

                                <div className="col-md-4  d-flex align-items-md-center justify-content-center pt-3">
                                    <form action="">
                                        <div className="py-3 px-md-1">
                                            <input type="text" placeholder="Name" className="form-control" />
                                        </div>
                                        <div className="py-3 px-md-1">
                                            <input type="email" placeholder="Email" className="form-control" />
                                        </div>
                                        <div className="py-3 px-md-1">
                                            <input type="text" placeholder="Phone" className="form-control" />
                                        </div>

                                        <div className="py-3 px-md-1">
                                            <textarea className="ps-2 pt-1 rounded-2" id="" cols="30" rows="6" placeholder="Query"></textarea>
                                        </div>
                                        <button type="button" className="btn btn-lg text-dark  text-center mx-auto rounded-0"> ___Send___</button>
                                        <div className="pt-4">
                                            <h6 className="text-muted"> <span><i className="bi bi-telephone-fill text-warning"></i></span> +1 253 565 2365  </h6>
                                            <h6 className="text-muted"> <span><i className="bi bi-geo-alt-fill text-warning"></i></span> Buttonwood, California  </h6>
                                            <h6 className="text-muted"> <span><i className="bi bi-envelope-fill text-warning"></i></span> info@domain.com  </h6>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </>
    )
}
export default Contact;
