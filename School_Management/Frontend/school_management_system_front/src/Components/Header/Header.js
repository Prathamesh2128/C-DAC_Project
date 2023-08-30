import React, { Component } from 'react';
import AuthService from '../../Service/AuthService';
import { RiFacebookBoxFill, RiInstagramLine, RiLinkedinBoxFill, RiYoutubeFill } from 'react-icons/ri';
import '../../Home.css';
import Logo from "../../Images/slogo.png";

class Header extends Component {
    constructor(props) {
        super(props);
        this.state = {
            currentUser: undefined
        };
    }
    componentDidMount() {
        const user = AuthService.getCurrentUser();
        if (user) {
            this.setState({
                currentUser: user
            })
        }
    }
    render() {
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
                        <a href="/contact">Contact Us</a>
                        <a href="/about">About Us</a>
                        <a href="/infrastructure">Infrastructure</a>
                        <a href="/academics">Academics</a>
                        <a href="/">Home</a>
                    </div>
                    <div>
                    <a href="/user" class="button">Login/Register</a>
                    <a>
                    </a>
                    </div>
                </div>
            </div>
        );
    }
}
export default Header;