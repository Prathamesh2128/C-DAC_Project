import './App.css';
import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import HomePageComponent from './components/Home';
import UserComponent from './components/user/UserComponent';
import Login from './components/user/LoginUserComponent';
import LoginHomeComponent from './components/LoginHomeComponent';
import AcademicsComponent from './components/AcademicsComponent';
import InfraStructureComponent from './components/InfraStructureComponent';
import AboutComponent from './components/AboutComponent';
import ContactComponent from './components/ContactComponent';
import ProfileComponent from './components/ProfileComponent';
import AdminComponent from './components/admin/AdminComponent';
import RegisterAdminComponent from './components/admin/RegisterAdminComponent';
import '../src/components/Home.css'
import Header from './components/Header';
import Footer from './components/Footer';

class App extends Component {
  render() {
    return (
      <div >
        <Header></Header>
        <Router>
          <Switch>
            <Route path="/" exact component={HomePageComponent} />
            <Route path="/user" component={UserComponent} />
            <Route path="/api/signin" component={Login} />
            <Route path="/home" exact component={LoginHomeComponent} />
            <Route path="/academics" component={AcademicsComponent} />
            <Route path="/infrastructure" component={InfraStructureComponent} />
            <Route path="/about" component={AboutComponent} />
            <Route path="/contact" component={ContactComponent} />
            <Route path="/profile" component={ProfileComponent} />
            <Route path="/admin" component={AdminComponent} />
            <Route path="/admin/register" component={RegisterAdminComponent} />
          </Switch>
        </Router>
        <Footer></Footer>
      </div>
    )
  }
}

export default App;
