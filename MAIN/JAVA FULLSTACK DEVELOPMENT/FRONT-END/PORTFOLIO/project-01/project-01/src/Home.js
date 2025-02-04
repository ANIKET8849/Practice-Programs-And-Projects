import React from "react";
import { Link } from "react-router-dom";
const Home = () => {
    return (
        <>
            <div className="home container-fluid">
                <div className="home-wrapper container">
                <div className="row">
                    <header className="header">
                        <div className="header-div">
                            <h2>Create your </h2> <h2> wedding website</h2>
                            <p>Create a beautiful wedding website for your big day. Start your free trial today. No
                                credit
                                card required.</p>
                            <Link className="btn btn-header" href="#">GET STARTED</Link>
                        </div>
                    </header>
                </div>
            </div>
        </div>
        </>
        )
    }
    export default Home;
            