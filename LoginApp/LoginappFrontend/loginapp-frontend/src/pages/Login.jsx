import api from "../api/axiosConfig";
import React, { useEffect, useState } from "react";
import LanguageSelector from "../components/LanguageSelector.jsx";
import { TextField } from "@mui/material";
import { Button, Typography } from "@mui/material";
import { useNavigate } from "react-router-dom";
import { useTranslation } from "react-i18next";

export const Login = (props) => {
  const [userId, setUserId] = useState("");
  const [password, setPassword] = useState("");
  const [hide, setHide] = useState(true);
  const [login, setLogin] = useState(false);
  const [userData, setUserData] = useState("");
  const navigate = useNavigate();
  const { t } = useTranslation();

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await api.get(`/api/v1/users/${userId}/${password}`);
      if (response.data !== "") {
        setUserData(response.data);
        setHide(true);
        setLogin(true);
      } else {
        setHide(false);
      }
    } catch (err) {
      console.log(err);
    }
  };

  useEffect(() => {
    if (login === true) {
      navigate("/Home", { state: { userData } });
      setUserData("");
    }
  }, [login, navigate, userData]);

  return (
    <div className="App">
      <div className="auth-form-container">
        <form className="login-form" onSubmit={handleSubmit}>
          <label className="header-label">{t("login")}</label>
          <TextField
            className="auth-inputfield"
            required
            label={t("userid")}
            defaultValue=""
            variant="outlined"
            onChange={(e) => setUserId(e.target.value)}
            autoComplete="off"
            style={{ margin: "0.5rem" }}
          />
          <TextField
            className="auth-inputfield"
            required
            label={t("password")}
            type="password"
            defaultValue=""
            variant="outlined"
            onChange={(e) => setPassword(e.target.value)}
            autoComplete="off"
            style={{ margin: "0.5rem" }}
          />
          {hide ? null : (
            <Typography
              style={{ color: "red", fontSize: "small", textAlign: "center" }}
            >
              {t("autherr")}
            </Typography>
          )}
          <Button
            variant="contained"
            type="submit"
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
            {t("login")}
          </Button>
          <LanguageSelector />
        </form>
      </div>
    </div>
  );
};
