import image2 from '../../Images/classroom_teaching.jpg'
import image1 from '../../Images/library.jpg';
import './infrastructure.css';
const InfraStructureComponent = () => {
    return (
        <div>
            <div className="home">
                <div className="heading">
                    <div className="jumbotron"><h1>Infrastructure</h1></div>
                </div>
                <div className="classroom">
                    <h2>Classrooms</h2>
                    <p>At MFHS, students learn in ergonomically designed classrooms equipped with SMART Boards, and all students from Grades 1 to 5 are provided with laptops. The Higher Secondary School block has 32 Smart Classrooms where 11 Smart LED panels and Smart Document Cameras are also installed. Wi-Fi access points are available to provide wireless coverage to all the classrooms.</p>
                    <img src={image2} alt="loading failed" />
                </div>
                <div className="library">
                    <h2>Library</h2>
                    <p>There are three libraries located in different sections of the school. The collection includes books, newspapers, magazines, Kindles, desktop computers, reference materials, CDs and DVDs.

                        GSIS’ well-stocked library houses over 50,000 volumes of books, comprising references, prescribed texts and popular fiction. The school subscribes to over 14 newspapers and 125 national and international magazines. The library is equipped with a computerized database, enabling students to have quick and easy access to necessary books. The school also has memberships of two international libraries to meet the additional needs of students.

                        In order to promote reading, the school organizes various festivals, displays and activities from time to time. These include reading hour sessions, interaction with authors, author birthday celebrations, literary events, quizzes, summer and winter reading challenges. Well qualified teacher librarians assist students with skill developments.

                        In order to attract young readers, the library space has been upgraded to create a better learning ambience and provide adequate space with bean bags and couches to collaborate, research, learn, share, read and relax.</p>
                    <img src={image1} alt="loading failed" />
                </div>
            </div>
        </div>
    );
}

export default InfraStructureComponent;