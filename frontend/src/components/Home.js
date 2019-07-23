import React from "react";
import "./Home.css";

class Home extends React.Component {
  render() {
    return (
      <div className="main">
        <div className="banner" />
        <div className="photo-section" />
        <div className="notice-section" />
        <div className="event-section" />
        <div className="team-section" />
        <div className="spronsor-section" />
      </div>
    );
  }
}

export default Home;
