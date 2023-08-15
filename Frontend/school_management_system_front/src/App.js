import './App.css';
import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import HomePageComponent from './components/Home';
import '../src/components/Home.css'
class App extends Component{
  render(){
    return(
      <div >
        <Router>
          <Switch>
            <Route path="/" exact component={HomePageComponent} />
          </Switch>
        </Router>
      </div>
    )
  }
}

export default App;
