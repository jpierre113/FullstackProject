import React {Component} from 'react';
import Header from './Header';
import Nav from './Nav';
import Footer from './Footer';
import Main from './Main';
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
            <Link to="/">Go to Home Page</Link>{' '}
            <Link to="/main">See Our Procedures</Link>{' '}
            <Link to="/reservation">Make a reservation</Link>
          </nav>
          <Route exact path="/" component={Home} />
          <Route path="/main" component={Main} />
          <Route path="/reservation" component={Reservation} />
        </div>
      </Router>
      <Header />
      <Nav />
      <Main />
      <Footer />
    </div>
  );
  }
}

export default App;
