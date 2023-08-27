import './Home.css';
import '../Academics.css';

const AcademicsComponent = () => {
    return (
        <div>
            <div className="home">
                <div className="jumbotron"><h1>Academics</h1></div>
                <div>
                    <h3 >THE FOUR PILLARS OF LEARNING</h3>
                    <div className="box">
                        <p className=""><strong>Learning to know</strong>to provide the cognitive tools
                            required to better comprehend the world and its
                            complexities, and to provide an appropriate and
                            adequate foundation for future learning.</p>
                    </div>
                    <div className="box">
                        <p className=""><strong>Learning to do</strong>to provide the skills, that would enable individuals to effectively participate in the global economy and society.</p>
                    </div>
                    <div className="box">
                        <p className=""><strong>Learning to be</strong> to provide self-analytical and social skills, to enable individuals to develop to their fullest
                            potential psycho-socially, affectively as well as
                            physically, for an all round ‘complete person’.</p>
                    </div>
                    <div className="box">
                        <p className=""><strong>Learning to live together</strong>to expose individuals, to the values implicit within human rights, democratic
                            principles, intercultural understanding, respect and peace at all levels of society and human relationships to enable living in peace and harmony.</p>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default AcademicsComponent;