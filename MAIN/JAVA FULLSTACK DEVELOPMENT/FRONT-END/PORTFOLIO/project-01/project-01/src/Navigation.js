import React from 'react'
import { Link } from 'react-router-dom';

const Navigation = () => {
    return (
        <>
            <nav className="nav bg-transparent w-100">
                    <div className="justify-content-between d-flex w-100">
                        <div className="d-flex">
                            <p>
                                <img className="nav-img" src="IMAGES/10001.svg" alt="IMAGES" height="40px" width="40px"></img>
                            </p>
                            <p>
                                <Link className="nav-a" href="./About">SQUARESPACE</Link>
                            </p>
                        </div>
                        <div class="w-100">
                            <ul>
                                <li><Link className="nav-a" href="./Services">PRODUCTS</Link></li>
                                <li><Link className="nav-a" href="./Blog">TEMPLATES</Link></li>
                                <li><Link className="nav-a" href="./project">RESOURCES</Link></li>
                            </ul>
                        </div>
                        <div className="right-nav w-100">
                            <Link className="nav-a" href="#">LOG IN</Link>
                            <Link className="btn btn-nav" href="#">GET STARTED</Link>
                        </div>
                    </div>
            </nav>

        </>
    )
}

export default Navigation;