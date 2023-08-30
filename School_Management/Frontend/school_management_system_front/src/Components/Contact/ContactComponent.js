import React from 'react';
import '../../Home.css';
import '../Contact/contact.css';

const ContactComponent = () => {
    return(
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
                                <p></p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default ContactComponent;