import { useEffect, useState } from "react";
import { useLocation } from "react-router-dom";

export const Home = () => {
  const location = useLocation();
  const userData = location.state.userData;

  return (
    <div className="App">
      <div className="auth-form-container">
        <label className="header-label">Welcome, {userData.name}</label>
      </div>
    </div>
  );
};
