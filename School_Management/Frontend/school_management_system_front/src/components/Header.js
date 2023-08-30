import './Home.css';
import { RiFacebookBoxFill, RiInstagramLine, RiLinkedinBoxFill, RiYoutubeFill } from 'react-icons/ri';
import Logo from "./images/slogo.png";
import { Link } from "react-router-dom";
import { useEffect } from "react";
import { useState } from "react";
const Header = () => {
    const [userName, setUserName] = useState("");
    useEffect(() => {
        const userinfo = sessionStorage.getItem("userinfo");
        if(userinfo != null ){
            setUserName((JSON.parse(sessionStorage.getItem("userinfo"))).userName)
        }
        else {
            setUserName("");
          }
    }, []);
        return (
            <div className='home'>
                <div className="topbar">
                    <a href=""><i><RiFacebookBoxFill /></i></a>
                    <a href=""><i><RiInstagramLine /></i></a>
                    <a href=""><i><RiLinkedinBoxFill /></i></a>
                    <a href=""><i><RiYoutubeFill /></i></a>
                </div>
                <div className="home-heading">
                    <h1 >Mystic Falls High School</h1>
                    <div className="home-logo">
                        <a className="navbar-brand" href="/"><img src={Logo} alt="Error loading" width="120px" height="120px" /></a>
                    </div>
                </div>
                <div className="topnav">
                    <div className="topnav-left">
                        <Link to={"/contact"} >
                            Contact Us
                        </Link>
                        <Link to="/about" >
                            About Us
                        </Link>
                        <Link to="/infrastructure" >
                            Infrastructure
                        </Link>
                        <Link to="/academics">
                            Academics
                        </Link>
                        <Link to="/" className="active">
                            Home
                        </Link>
                    </div>
                    <div>
                        <Link to="/user">
                            Login/Register
                        </Link>
                    </div>
                </div>
            </div>
        );
}

export default Header;