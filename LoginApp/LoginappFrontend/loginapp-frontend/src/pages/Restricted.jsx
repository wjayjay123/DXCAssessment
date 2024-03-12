import { Typography } from "@mui/material";
import Image from "../image/topsecret.png";
import { useTranslation } from "react-i18next";
import LanguageSelector from "../components/LanguageSelector";

export const Restricted = () => {
  const { t } = useTranslation();

  return (
    <div className="App">
      <div className="auth-form-container">
        <label className="header-label">{t("resPage")}</label>
        <Typography
          style={{ color: "black", fontSize: "big", textAlign: "center" }}
        >
          {t("resText")}
        </Typography>
        <img src={Image} height="200px" width="200px" />
        <LanguageSelector />
      </div>
    </div>
  );
};
