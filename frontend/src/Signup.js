import React from 'react';

const Signup = (props) => {

    return(
      <div className="Signup">
      <h1>Signup</h1>

      <form onSubmit={props.submitForm}>
      <input
      type="text"
      label="firstName"
      value={props.firstName}
      onChange={props.handleFirstNameChange}
      id="firstName"
      placeholder="First Name"
      />
      </form>

      <form onSubmit={props.submitForm}>
      <input
      type="text"
      label="lastName"
      value={props.lastName}
      onChange={props.handleLastNameChange}
      id="lastName"
      placeholder="Last Name"
      />
      </form>

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
      </div>
    );

}
  export default Signup;
