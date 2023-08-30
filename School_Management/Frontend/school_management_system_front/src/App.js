import './App.css';
import '../src/Home.css';

import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'


import Header from './Components/Header/Header';
import Footer from './Components/Footer/Footer';

import HomeComponent from './Components/Home/HomeComponent';
import AcademicsComponent from './Components/Academics/AcademicsComponent';
import InfraStructureComponent from './Components/InfraStructure/InfraStructureComponent';
import AboutComponent from './Components/About/AboutComponent';
import ContactComponent from './Components/Contact/ContactComponent';
import UserComponent from './Components/User/UserComponent';
import LoginComponent from './Components/User/LoginComponent';
import LoginHomeComponent from './Components/User/LoginHomeComponent';
import UserProfileComponent from './Components/User/UserProfileComponent';
import AdminComponent from './Components/Admin/AdminComponent';
import RegisterAdminComponent from './Components/Admin/RegisterAdminComponent';
import RegisterTeacherComponent from './Components/Admin/RegisterTeacherComponent';
import RegisterStudentComponent from './Components/Admin/RegisterStudentComponent';
import StudentListComponent from './Components/Admin/StudentListComponent';
import TeacherListComponent from './Components/Admin/TeacherListComponent';
import StudentComponent from './Components/Student/StudentComponent';
import TeacherComponent from './Components/Teacher/TeacherComponent';
import EditStudentComponent from './Components/Admin/EditStudentComponent';
import EditTeacherComponent from './Components/Admin/EditTeacherComponent';
import FeedbackComponent from './Components/Student/FeedbackComponent';
import TeachersStudentListComponent from './Components/Teacher/TeachersStudentListComponent';
import UpdateAttendanceComponent from './Components/Teacher/UpdateAttendanceComponent';
import AddFeedbackComponent from './Components/Teacher/AddFeedbackComponent';
const App = () => {
  return (
    <div >
      <Header />
      <Router>
        <Switch>
          <Route path="/" exact component={HomeComponent} />
          <Route path="/academics" component={AcademicsComponent} />
          <Route path="/infrastructure" component={InfraStructureComponent} />
          <Route path="/about" component={AboutComponent} />
          <Route path="/contact" component={ContactComponent} />
          <Route path='/user' exact component={UserComponent} />
          <Route path='/api/signin' component={LoginComponent} />
          <Route path='/home' component={LoginHomeComponent} />
          <Route path="/profile" component={UserProfileComponent} />
          <Route path="/admin" component={AdminComponent} />
          <Route path="/student" component={StudentComponent} />
          <Route path="/teacher" component={TeacherComponent} />
          <Route path="/register" component={RegisterAdminComponent} />
          <Route path="/add-teacher" component={RegisterTeacherComponent} />
          <Route path="/add-user" component={RegisterStudentComponent} />
          <Route path="/list" component={StudentListComponent} />
          <Route path="/list-t" component={TeacherListComponent} />
          <Route path="/edit-user" component={EditStudentComponent} />
          <Route path="/edit-teacher" component={EditTeacherComponent} />
          <Route path="/feedbackDetails" component={FeedbackComponent} />
          <Route path="/stlist" component={TeachersStudentListComponent} />
          <Route path="/update-attendance" component={UpdateAttendanceComponent} />
          <Route path="/feedback" component={AddFeedbackComponent} />
        </Switch>
      </Router>
      <Footer></Footer>
    </div>
  )
}

export default App;
