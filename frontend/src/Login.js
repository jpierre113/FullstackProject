import React from 'react';

const Login = (props) => {

    return(
      <div className="Login">
        <h1>Login</h1>

        <form onSubmit={props.submitForm}>
        <input
        type="text"
        label="email"
        value={props.email}
        onChange={props.handleEmailChange}
        id="email"
        placeholder="Email"
        />
        </form>

        <form onSubmit={props.submitForm}>
        <input
        type="text"
        label="password"
        value={props.password}
        onChange={props.handlePasswordChange}
        id="password"
        placeholder="Password"
        />
        </form>
        <input type="submit" value="Login!" />
      </div>

    );

}
  export default Login;
