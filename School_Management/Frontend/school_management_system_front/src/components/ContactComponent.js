import './Home.css';
import '../contact.css';
import { BiLink } from "react-icons/bi";

const ContactComponent = () => {
    return (
        <div>
            <div className="home">
                <div className="heading">
                    <div className="jumbotron"><h1>Contact Us</h1></div>
                </div>
                <div className="callback">
                    <h2>Leave Us A Message</h2>
                    <p>and we will get back to you</p>
                    <div className="container">
                        <div className="row">
                            <div className="col-sm-8">
                                <div className="form-group">
                                    <input type="text" placeholder="Enter FullName" id="fullname" name="fullname" className="form-control" />
                                </div>
                                <div className="form-group">
                                    <input type="email" placeholder="Enter Email ID" id="email" name="email" className="form-control" />
                                </div>
                                <div className="form-group">
                                    <input type="text" placeholder="Enter Mobile Number" id="mobile" name="mobile" className="form-control" />
                                </div>
                                <div className="form-group">
                                    <input type="text" placeholder="Message" id="message" name="message" className="form-control" />
                                </div>
                                <button className="btn btn-success" >Submit Now</button>
                            </div>
                        </div>
                    </div>
                </div>

                <div className="footer">
                    <h3 className="footer-h1">Address</h3>
                    <p className="footer-p1">Mystic Falls High School, Study Town, Mystic Falls - 431603 Arizona, United States.</p>
                    <div className="footer-1">
                        <strong>+91 9011027212</strong>
                        <br />
                        <a href="#"><strong>www.mfhs.ac.in</strong></a>
                    </div>
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
    );
}

export default ContactComponent;