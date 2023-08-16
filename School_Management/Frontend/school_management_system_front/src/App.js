import './App.css';
import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import HomePageComponent from './components/Home';
import UserComponent from './components/user/UserComponent';
import Login from './components/user/LoginUserComponent';
import '../src/components/Home.css'

class App extends Component {
  render() {
    return (
      <div >
        <Router>
          <Switch>
            <Route path="/" exact component={HomePageComponent} />
            <Route path="/user" component={UserComponent} />
            <Route path="/api/signin" component={Login} />
          </Switch>
        </Router>
      </div>
    )
  }
}

export default App;
