import React, { Component } from 'react';
import './Home.css';
import { RiParentFill, RiAwardFill } from 'react-icons/ri';
import { BiBuildings, BiFootball } from "react-icons/bi";
import image1 from "./images/classroom.jpg";
import image2 from "./images/hallway.jpg";
import image3 from "./images/dance.jpg";
import image4 from "./images/playing.jpg";
import image5 from "./images/building.jpg";
import image6 from "./images/acre.jpg";
import image7 from "./images/sports.jpg";
import image8 from "./images/classroom_teaching.jpg";
import image9 from "./images/award.jpg";
import image10 from "./images/hostel.jpg";

class HomePageComponent extends Component {
    constructor(props) {
        super(props);
    }
    render() {
        return (
            <div className='page'>
                <div className='home'>
                    <div className="slide">
                        <div id="carousel" className="carousel slide" data-bs-ride="carousel">
                            <ul class="carousel-indicators">
                                <li data-target="#carousel" data-slide-to="0" class="active"></li>
                                <li data-target="#carousel" data-slide-to="1"></li>
                                <li data-target="#carousel" data-slide-to="2"></li>
                                <li data-target="#carousel" data-slide-to="3"></li>
                                <li data-target="#carousel" data-slide-to="4"></li>
                            </ul>
                            <div className="carousel-inner">
                                <div class="carousel-item active" data-bs-interval="2000">
                                    <img src={image5} className="image5" alt="loading failed"></img>
                                    <div className="carousel-caption">
                                        <h1>Campus</h1>
                                    </div>
                                </div>
                                <div className="carousel-item " data-bs-interval="2000">
                                    <img src={image1} className="image1" alt="loading failed" ></img>
                                    <div className="carousel-caption">
                                        <h1>Classroom</h1>
                                    </div>
                                </div>
                                <div class="carousel-item" data-bs-interval="2000">
                                    <img src={image2} className="image2" alt="loading failed" ></img>
                                    <div className="carousel-caption">
                                        <h1>Hallway</h1>
                                    </div>
                                </div>
                                <div class="carousel-item">
                                    <img src={image3} className="image3" alt="loading failed"></img>
                                    <div className="carousel-caption">
                                        <h1>Co Curricular</h1>
                                    </div>
                                </div>
                                <div class="carousel-item">
                                    <img src={image4} className="image4" alt="loading failed" ></img>
                                    <div className="carousel-caption">
                                        <h1>Sports</h1>
                                    </div>
                                </div>
                            </div>
                            <a class="carousel-control-prev" href="#carousel" data-slide="prev">
                                <span class="carousel-control-prev-icon"></span>
                            </a>
                            <a class="carousel-control-next" href="#carousel" data-slide="next">
                                <span class="carousel-control-next-icon"></span>
                            </a>
                        </div>
                    </div>
                    <div className="utilities">
                        <div className="box">
                            <img src={image6} alt="loading failed" />
                            <p className="content"> <strong>100+</strong><br /> Acres of School <br /> Campus</p>
                        </div>
                        <div className="box">
                            <img src={image7} alt="loading failed" />
                            <p className="content"><strong>30+</strong><br /> Co-Curricular <br /> Activities</p>
                        </div>
                        <div className="box">
                            <img src={image8} alt="loading failed" />
                            <p className="content"><strong>500+</strong><br />Fully Residential <br />Students</p>
                        </div>
                        <div className="box">
                            <img src={image9} alt="loading failed" />
                            <p className="content"><strong>20</strong><br /> Years of Academic<br /> Excellence</p>
                        </div>
                        <div className="box">
                            <img src={image10} alt="loading failed" />
                            <p className="content"><strong>A+</strong><br /> Hostel <br />Facilities</p>
                        </div>
                    </div>
                    <div className="about">
                        <h3>About MFHS</h3>
                        <p>Mystic Falls High School is one of India’s best fully residential, international co-educational schools, located in Mystic Falls. Our meticulous attention to academic excellence is matched by an inspiring range of extra-curricular activities that ensures the holistic development of every child under our care.</p>
                    </div>
                    <div className="facilities">
                        <div className="content" >
                            <i ><BiBuildings /></i>
                            <h3>Academic Facilites</h3>
                            <p >We provide state-of-the-art facilities for effective teaching and learning at the school.</p>
                        </div>
                        <div className="content">
                            <i ><BiFootball /></i>
                            <h3>Sport & Games</h3>
                            <p >We encourage students to pursue an active lifestyle, and provide the latest facilities for all sports and games</p>
                        </div>
                        <div className="content">
                            <i ><RiParentFill /></i>
                            <h3 >Boarding & Homely Care</h3>
                            <p >It is our earnest endeavour to make our students’ stay in the school ‘a home away from home’.</p>
                        </div>
                        <div className="content">
                            <i ><RiAwardFill /></i>
                            <h3 >Awards</h3>
                            <p >MFHS has won several awards for providing world-class academic and co-curricular education facilities.</p>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default HomePageComponent;