import React from "react";
import Button from "@material-ui/core/Button";
import axios from "axios";
import "./Signup.css";

class Signup extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      id: "",
      pw: "",
      email: "",
      nickname: "",
      confirm_pw: ""
    };
  }
  handleSubmit = () => {
    this.joinMember()
      .then(res => {
        console.log(res.data);
      })
      .catch(error => {
        console.log(error);
      });
  };

  joinMember = () => {
    const option = {
      method: "post",
      headers: { "content-type": "application/json;charset=UTF-8" },
      url: "/api/members",
      data: JSON.stringify({
        id: this.state.id,
        pw: this.state.pw,
        nickname: this.state.nickname,
        email: this.state.email
      })
    };
    return axios(option);
  };

  handleChange = e => {
    this.setState({
      [e.target.name]: e.target.value
    });
  };
  render() {
    return (
      <div className="signup-form">
        <ul>
          <li>
            <span>회원가입</span>
          </li>
          <li>
            <input
              type="text"
              name="id"
              placeholder="아이디"
              onChange={this.handleChange}
            />
          </li>
          <li>
            <input
              type="password"
              name="pw"
              placeholder="비밀번호"
              onChange={this.handleChange}
            />
          </li>
          <li>
            <input
              type="password"
              name="confirm_pw"
              placeholder="비밀번호 확인"
              onChange={this.handleChange}
            />
          </li>
          <li>
            <input
              type="text"
              name="email"
              placeholder="이메일"
              onChange={this.handleChange}
            />
          </li>
          <li>
            <input
              type="text"
              name="nickname"
              placeholder="닉네임"
              onChange={this.handleChange}
            />
          </li>
          <Button
            variant="contained"
            color="primary"
            className="submit"
            onClick={this.handleSubmit}
          >
            회원가입
          </Button>
          <li />
        </ul>
      </div>
    );
  }
}

export default Signup;
