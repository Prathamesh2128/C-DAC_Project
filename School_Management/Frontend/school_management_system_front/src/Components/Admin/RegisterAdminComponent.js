import { Component } from "react";
import ApiService from "../../Service/ApiService";
import "bootstrap/dist/css/bootstrap.min.css";

class RegisterAdminComponent extends Component {
    constructor(props) {
        super(props);
        this.state = {
            userName: '',
            password: '',
            email: '',
            roles: ['ROLE_ADMIN'],
            instituteName: 'Mystic Falls High School',
            adharNo: '',
            message: null
        }
    }

    registerAdmin = (event) => {
        event.preventDefault();
        let admin = {
            userName: this.state.userName,
            password: this.state.password,
            roles: this.state.roles,
            email: this.state.email,
            instituteName: this.state.instituteName,
            adharNo: this.state.adharNo
        };
        console.log(admin);
        ApiService.registerAdmin(admin)
            .then(response => {
                console.log(response.data);
                this.setState({ message: 'Admin registration successful...' });
                this.props.history.push('/home');
            })
            .catch(err => {
                console.error("in error ", err.response.data);
                alert(err.response.data.message);
                this.props.history.push('/user/signup/admin');
            })
    }

    onChange = (event) =>
        this.setState({
            [event.target.name]: event.target.value
        });

    render() {
        return (
            <div>
                <body>
                
                    <div className="container">
                        <div className="row justify-content-center">
                            <div className="col-sm-6">
                                <h3>Admin Registration</h3>
                                <div className="form-group">
                                    <label for="userName">Username</label>
                                    <input type="text" placeholder="Enter Username" id="userName" name="userName" className="form-control" value={this.state.userName} onChange={this.onChange} />
                                </div>
                                <div className="form-group">
                                    <label for="email">Email</label>
                                    <input type="email" placeholder="Enter Email" id="email" name="email" className="form-control" value={this.state.email} onChange={this.onChange} />
                                </div>
                                <div className="form-group">
                                    <label for="roles">Role</label>
                                    <input type="text" placeholder="Mystic Falls High School" id="roles" name="role" className="form-control" disabled value={this.state.roles} onChange={this.onChange} />
                                </div>
                                <div className="form-group">
                                    <label for="instituteName">Institute Name</label>
                                    <input type="text" placeholder="Mystic Falls High School" id="instituteName" name="instituteName" className="form-control" disabled value={this.state.instituteName} onChange={this.onChange} />
                                </div>
                                <div className="form-group">
                                    <label for="adharNo">Aadhar Card No</label>
                                    <input type="text" placeholder="Enter Aadhar No" id="adharNo" name="adharNo" className="form-control" value={this.state.adharNo} onChange={this.onChange} />
                                </div>
                                <div className="form-group">
                                    <label for="password">Password</label>
                                    <input type="password" placeholder="Enter Password" id="password" name="password" className="form-control" value={this.state.password} onChange={this.onChange} />
                                </div>

                                <button className="btn btn-primary" onClick={this.registerAdmin}>Register</button>
                            </div>
                            <p></p>
                        </div>
                    </div>
                </body>
            </div>
        );
    }
}

export default RegisterAdminComponent;