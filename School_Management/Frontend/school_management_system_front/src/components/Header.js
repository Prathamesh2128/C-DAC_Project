import './Home.css';
import { RiFacebookBoxFill, RiInstagramLine, RiLinkedinBoxFill, RiYoutubeFill } from 'react-icons/ri';
import Logo from "./images/slogo.png";
import { Component } from 'react';

class Header extends Component {
    constructor(props){
        super(props)
    }
    getLoginForm = () => {
        this.props.history.push('/user')
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
                        <a className="active" href="/">Home</a>
                    </div>
                    <button class="btn " onClick={this.getLoginForm}>Login/Register</button>
                </div>
            </div>
        );
    }
}

export default Header;