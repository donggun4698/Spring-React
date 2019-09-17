import React from "react";
import "./App.css";
import Header from "./components/Header";
import Footer from "./components/Footer";
import { BrowserRouter as Router, Route } from "react-router-dom";
import Home from "./components/Home";
import Login from "./components/Login";
import Signup from "./components/Signup";
function App() {
  return (
    <Router>
      <Header />
      <div className="contents">
        <Route exact path="/" component={Home} />
        <Route exact path="/spark" component={Home} />
        <Route path="/spark/club" component={Home} />
        <Route path="/spark/stadium" component={Home} />
        <Route exact path="/games" component={Home} />

        <Route exact path="/records" component={Home} />

        <Route exact path="/players" component={Home} />

        <Route exact path="/fan" component={Home} />

        <Route exact path="/media" component={Home} />

        <Route path="/login" component={Login} />
        <Route path="/Signup" component={Signup} />
      </div>
      <Footer />
    </Router>
  );
}

export default App;
