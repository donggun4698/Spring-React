import React from "react";
import "./Footer.css";
import footerlogo from "../footerlogo.png";

class Footer extends React.Component {
  render() {
    return (
      <div className="footer">
        <div className="content">
          {/* <div className="sponsor">
            <ul>
              <li>
                <img src={require("../sponsors/sponsor1.png")} alt="sponsor" />
              </li>
              <li>
                <img src={require("../sponsors/sponsor2.png")} alt="sponsor" />
              </li>
              <li>
                <img src={require("../sponsors/sponsor3.png")} alt="sponsor" />
              </li>
            </ul>
          </div> */}
          <div className="companyinfo">
            <img className="footer-logo" src={footerlogo} alt="logo" />
            <a href="/">이용약관</a>
            <span className="copyright">
              © Copyright ChangWon Spark Baseball Club. All Right Reserved.
            </span>
          </div>
        </div>
      </div>
    );
  }
}

export default Footer;
