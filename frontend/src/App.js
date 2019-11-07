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
            <Link to="/" className="link">Signup / Login</Link>{' '}
            <Link to="/reservation" className="link">Make a reservation</Link>{Reservation}
          </nav>
            <Route exact path="/" render={props =>
              <div>
                <Signup />
                <Login />
              </div>
            } />
            <Route path="/reservation" component={Reservation} />
        </div>
      </Router>


    </div>
  );
  }
}

export default App;
