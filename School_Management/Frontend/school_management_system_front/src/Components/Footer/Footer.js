import React from 'react';
import { RiFacebookBoxFill, RiInstagramLine, RiLinkedinBoxFill, RiYoutubeFill } from 'react-icons/ri';
import { BiMap, BiLink } from "react-icons/bi";
import "bootstrap/dist/css/bootstrap.min.css";
import '../../Home.css';
import '../About/about.css';

const Footer = () => {
    return (
        <div className='home'>
            <div className="footer">
                <div className="box-container">
                    <div className="box">
                        <i className="footer-i1"><BiMap /></i>
                        <h3 className="footer-h1">Address</h3>
                        <p className="footer-p1">Mystic Falls High School, Study Town, Mystic Falls - 431603 Arizona, United States.</p>
                        <strong>+91 9821907236</strong>
                        <br />
                        <a href="/"><strong>www.mfhs.ac.in</strong></a>
                    </div>
                    <div className="box">
                        <i className="footer-i2"><BiLink /></i>
                        <h3 className="footer-h2">Quick Links</h3>
                        <a className="footer-a1" href="/about">About Us</a>
                        <br />
                        <a className="footer-a2" href="/academics">Academics</a>
                        <br />
                        <a className="footer-a3" href="/infraStructure">InfraStructure</a>
                        <br />
                        <a className="footer-a4" href="/contact">Contact Us</a>
                    </div>
                </div>
            </div>
            <div className="footer-bar">
                <a href="https://www.facebook.com/"><i><RiFacebookBoxFill /></i></a>
                <a href="https://www.instagram.com/"><i><RiInstagramLine /></i></a>
                <a href="https://www.linkedin.com/"><i><RiLinkedinBoxFill /></i></a>
                <a href="https://www.youtube.com/"><i><RiYoutubeFill /></i></a>
            </div>
        </div>
    );
}

export default Footer;