import React from "react";
import "./Header.css";
import { Link } from "react-router-dom";
import mainlogo from "../mainlogo.png";

class Header extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      active: false
    };
  }

  handleFocus = () => {
    this.setState({
      active: true
    });
  };

  handleUnfocus = () => {
    this.setState({
      active: false
    });
  };

  render() {
    const menuInfo = [
      {
        title: "spark",
        gnv: "스파크",
        subnv: ["구단 소개", "구장 시설"],
        path: ["/spark/club", "/spark/stadium"]
      },
      {
        title: "games",
        gnv: "경기정보",
        subnv: ["일정결과"],
        path: ["/games"]
      },
      {
        title: "records",
        gnv: "기록",
        subnv: ["팀 기록", "타자 기록", "투수 기록"],
        path: ["/records/team", "/records/batter", "/records/pitcher"]
      },
      {
        title: "players",
        gnv: "선수단",
        subnv: ["전체 선수단", "코치진", "투수", "타자"],
        path: [
          "/players",
          "/players/coach",
          "/players/batter",
          "/players/pitcher"
        ]
      },
      {
        title: "fan",
        gnv: "팬",
        subnv: ["자유게시판", "응원단"],
        path: ["/fan/talk", "/fan/cheering"]
      },
      {
        title: "media",
        gnv: "미디어",
        subnv: ["공지사항", "이벤트", "포토"],
        path: ["/media/notice", "/media/event", "/media/photo"]
      }
    ];

    return (
      <div
        className={this.state.active ? "header active" : "header"}
        onMouseOver={this.handleFocus}
        onMouseLeave={this.handleUnfocus}
      >
        <div className="header-wrap">
          <div className="user-area">
            <Link to="/login">
              <span>로그인</span>
            </Link>
            <Link to="/signup">
              <span>회원가입</span>
            </Link>
          </div>
          <Link to="/">
            <img className="main-logo" src={mainlogo} alt="logo" />
          </Link>
          <div className="gnav">
            {menuInfo.map((names, index) => {
              return (
                <div className={names.title} key={index}>
                  <h2>
                    <Link to={names.path[0]}>{names.gnv}</Link>
                  </h2>
                  <ul>
                    {names.subnv.map((sub, index) => {
                      return (
                        <li key={index}>
                          <Link to={names.path[index]}>{sub}</Link>
                        </li>
                      );
                    })}
                  </ul>
                </div>
              );
            })}
          </div>
        </div>
      </div>
    );
  }
}

export default Header;
