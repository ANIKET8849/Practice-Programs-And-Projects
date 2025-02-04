import React from 'react'
import { Link } from 'react-router-dom';

const Navigation = () => {
    return (
        <>
            <div className='navigation container-fluid pt-3 pb-3'>
                <div className='nav-wrapper container d-flex justify-content-between' >
                    <div className='logo pt-2'>
                        <img src='img/ilustration/laptop1.png' alt='logo' className='img-fiuid' />

                    </div>
                    <div className="main-offcanvas d-md-none text-center ">
                        <button className="btn-offcanvas bg-transparent border border-0 " type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasExample" aria-controls="offcanvasExample"><i className="bi bi-list text-white border boder-white px-1 py-1 fs-1"></i></button>
                        <div className="offcanvas border-0 offcanvas-start bg-dark w-75" tabindex="-1" id="offcanvasExample" aria-labelledby="offcanvasExampleLabel">
                            <div className="offcanvas-header justify-content-end me-5 ">
                                <button type="button" className="fs-3 border-0 bg-transparent " data-bs-dismiss="offcanvas" aria-label="Close"><i className="bi bi-x-lg text-white border border-1 border-white fs-4 p-2 "></i></button>
                            </div>
                            <div className="offcanvas-body me-5 ">
                                <ul className="list">
                                    <li className='nav-item lh-lg'>
                                        <Link to="/" className='nav-link  text-white'>Home</Link>
                                    </li>
                                    <li className='nav-item lh-lg'>
                                        <Link to='./About' className='nav-link  text-white'>About</Link>
                                    </li>
                                    <li className='nav-item lh-lg'>
                                        <Link to='./Services' className='nav-link  text-white'>Services</Link>
                                    </li>
                                    <li className='nav-item lh-lg'>
                                        <Link to='./Blog' className='nav-link  text-white'>Blog</Link>
                                    </li>
                                    <li className='nav-item lh-lg'>
                                        <Link to='./Project' className='nav-link  text-white'>Project</Link>
                                    </li>
                                    <li className='nav-item lh-lg'>
                                        <Link to='./contact' className='nav-link  text-white'>Contact</Link>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div className='nav-list d-none d-md-block'>
                        <ul className='nav  '>
                            <li className='nav-item'>
                                <Link to="/" className='nav-link  text-white fw-semibold'>Home</Link>
                            </li>
                            <li className='nav-item'>
                                <Link to='./About' className='nav-link  text-white fw-semibold'>About</Link>
                            </li>
                            <li className='nav-item'>
                                <Link to='./Services' className='nav-link  text-white fw-semibold'>Services</Link>
                            </li>
                            <li className='nav-item'>
                                <Link to='./Blog' className='nav-link  text-white fw-semibold'>Blog</Link>
                            </li>
                            <li className='nav-item'>
                                <Link to='./Project' className='nav-link  text-white fw-semibold'>Project</Link>
                            </li>
                            <li className='nav-item'>
                                <Link to='./contact' className='nav-link  text-white fw-semibold'>Contact</Link>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>

        </>
    )
}

export default Navigation;