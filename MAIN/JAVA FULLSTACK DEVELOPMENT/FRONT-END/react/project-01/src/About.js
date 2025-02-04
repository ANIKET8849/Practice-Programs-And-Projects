import React from 'react'

const About = () => {
    return (
        <>
            <div className="about-area">
                <div className='about-heading'>
                    <div className='pt-5 pb-5'>
                        <h2 className='text-white text-center pt-5 pb-5 fw-bolder fs-1'>ABOUT US</h2>
                    </div>
                </div>
                <div className="container">
                    <div className="row align-items-center pt-5">
                        <div className=" col-12  col-md-6 mb-4 ">
                            <div className="about-info ">
                                <span className='text-dark fs-5 pb-2'>ABOUT US</span>
                                <h2 className='text-dark'>52 Years Of Experience in this area</h2>
                                <p className='text-dark pt-1 pb-3'>Brook presents your services with flexible, convenient and cdpoe layouts. You can select your favorite layouts &amp; elements for cular ts with unlimited ustomization possibilities. Pixel-perfreplication of the designers is intended.</p>
                                <button type="button" className="btn btn-lg text-white rounded-0"> - ABOUT US</button>
                            </div>
                        </div>
                        <div className="col-12 col-md-6  ">
                            <div className="about-img ">
                                <img src="img/ilustration/building1.png" alt="building" />
                            </div>
                        </div>
                    </div>
                </div>
                <div className='container'>
                    <div className='row pt-4'>
                        <div className='Vedio-photo col-12 col-md-6'>
                            <div className='play-icon text-center' >
                            
                            </div>
                        </div>
                        <div className='about-bg col-12 col-md-6'>
                            <div className='info text-center pt-5'>
                                <div className='pt-5 pb-2'>
                                    <img src="img/ilustration/review-person1.png" alt="person" />
                                </div>
                                <h4 className='name pb-1'>OliQua.F.Jams</h4>
                                <h5 className='text-muted'>Designer</h5>
                                <p className='text-white'>"You can select your favorite layouts & elements for cular ts with unlimited ustomization possibilities. Pixel-perfreplication of the designers is intended.You can select your favorite layouts & elements for cular ts with unlimited ustomization possibilities. Pixel-perfreplication of the designers is intended"
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
                <div className='container'>
                    <div className='row'>
                        <div className=' about-info col-12 col-md-6 mb-4 text-center mx-auto pt-5'>
                            <h5 className='text-dark fs-2'> OUR EXPERTS</h5>
                            <h2 className='text-dark pt-1 fw-bolder'>BEST TEAM WE HAVE EVER HAD RIGHT NOW</h2>

                        </div>

                    </div>
                    <div className='row pt-2 pb-5'>
                        <div className='col-12 col-md-4 mb-4'>
                            <div>
                                <img src="img/ilustration/customer11.png" alt="person1" className='img-fluid' />
                            </div>
                            <h3 className='name text-center pt-1'>Jonh Sunsa</h3>
                            <h5 className='text-muted text-center'>Creative Designer</h5>
                        </div>
                        <div className='col-12 col-md-4 mb-4'>
                            <div>
                                <img src="img/ilustration/customer21.png" alt="person2" className='img-fluid' />
                            </div>
                            <h3 className='name text-center pt-1'>Smith J White</h3>
                            <h5 className='text-muted text-center'>Creative Designer</h5>
                        </div>
                        <div className='col-12 col-md-4 mb-4'>
                            <div>
                                <img src="img/ilustration/customer31.png" alt="person3" className='img-fluid' />
                            </div>
                            <h3 className='name text-center pt-1'>Jonsan Brouni</h3>
                            <h5 className='text-muted text-center'>Creative Designer</h5>
                        </div>
                    </div>
                </div>
            </div>
        </>
    )
}

export default About;