import { Button } from "@mui/material";
import { useLocation } from "react-router-dom";
import { useNavigate } from "react-router-dom";

export const Home = () => {
  const location = useLocation();
  const userData = location.state.userData;
  const navigate = useNavigate();

  const handleLogOut = () => {
    navigate("/");
  };

  return (
    <div className="App">
      <div className="auth-form-container">
        <label className="header-label">
          Welcome, {userData.name} ({userData.username})
        </label>
        <label className="sub-label">Role: {userData.role}</label>
        {userData.role === "Manager" ? (
          <a href="/Restricted" target="_blank">
            Access restricted website
          </a>
        ) : null}
        <Button
          variant="contained"
          type="submit"
          onClick={handleLogOut}
          style={{
            backgroundImage:
              "linear-gradient(69deg, #735DA5, #af83b9 50%, #D3C5E5)",
            color: "white",
            fontWeight: "bold",
            padding: "15px",
            borderRadius: "10px",
            margin: "0.5rem",
            width: "23em",
          }}
        >
          Logout
        </Button>
      </div>
    </div>
  );
};
