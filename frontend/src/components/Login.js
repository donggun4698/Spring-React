import React from "react";
import Button from "@material-ui/core/Button";
import axios from "axios";
import "./Login.css";

class Login extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      id: "",
      pw: "",
      data: ""
    };
  }

  handleChange = e => {
    this.setState({
      [e.target.name]: e.target.value
    });
  };

  handleSubmit = () => {
    axios.get("https://reqres.in/api/users?page=2").then(res => {
      console.log(res);
      this.setState({ data: res.data.data });
    });
  };

  render() {
    return (
      <div className="login-form">
        <ul>
          <li>
            <span>로그인</span>
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
          <Button
            variant="contained"
            color="primary"
            className="submit"
            onClick={this.handleSubmit}
          >
            로그인
          </Button>
          <li />
        </ul>
        {JSON.stringify(this.state.data)}
      </div>
    );
  }
}

export default Login;
