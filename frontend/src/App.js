import React, {Component} from 'react';
import Home from './Home';
import Reservation from './Reservation';
import Signup from './Signup';
import Login from './Login';

import {
  BrowserRouter as Router,
  Route,
  Link
}
from 'react-router-dom';

import './App.css';

class App extends Component {
  render(){
  return (
    <div className="App">

    <Router>
        <div>
          <nav>
            <Link to="/">Signup / Login</Link>{' '}
            <Link to="/reservation">Make a reservation</Link>
          </nav>
          <Route exact path="/" component={Home} />
          <Route path="/reservation" component={Reservation} />
        </div>
      </Router>

      <Signup /> <Login />


    </div>
  );
  }
}

export default App;
