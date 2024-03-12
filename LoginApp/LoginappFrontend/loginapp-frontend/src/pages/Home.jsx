import { Button } from "@mui/material";
import { useLocation } from "react-router-dom";
import { useNavigate } from "react-router-dom";
import { useTranslation } from "react-i18next";
import LanguageSelector from "../components/LanguageSelector";

export const Home = () => {
  const location = useLocation();
  const userData = location.state.userData;
  const navigate = useNavigate();
  const { t } = useTranslation();

  const handleLogOut = () => {
    navigate("/");
  };

  return (
    <div className="App">
      <div className="auth-form-container">
        <label className="header-label">
          {t("welcome")}, {userData.name} ({userData.username})
        </label>
        <label className="sub-label">
          {t("role")}: {userData.role}
        </label>
        {userData.role === "Manager" ? (
          <a href="/Restricted" target="_blank">
            {t("accRestrict")}
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
          {t("logout")}
        </Button>
        <LanguageSelector />
      </div>
    </div>
  );
};
