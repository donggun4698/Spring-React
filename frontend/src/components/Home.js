import React from "react";
import Slider from "react-slick";
import "slick-carousel/slick/slick.css";
import "slick-carousel/slick/slick-theme.css";
import "./Home.css";

class Home extends React.Component {
  render() {
    const slickSettings = {
      dots: true,
      className: "sliderBanner",
      infinite: true,
      arrows: false,
      autoplay: true,
      autoplaySpeed: 3000
    };
    return (
      <div className="main">
        <div className="banner">
          <Slider {...slickSettings}>
            <div>
              <img src="https://placeimg.com/1900/400/1" alt="test" />
            </div>
            <div>
              <img src="https://placeimg.com/1900/400/2" alt="test" />
            </div>
            <div>
              <img src="https://placeimg.com/1900/400/3" alt="test" />
            </div>
          </Slider>
        </div>
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
