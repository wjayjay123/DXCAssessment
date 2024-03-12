import { Typography } from "@mui/material";
import Image from "../image/topsecret.png";

export const Restricted = () => {
  return (
    <div className="App">
      <div className="auth-form-container">
        <label className="header-label">Restricted Page</label>
        <Typography
          style={{ color: "black", fontSize: "big", textAlign: "center" }}
        >
          Hi Manager, this is a restricted page.
        </Typography>
        <img src={Image} height="200px" width="200px" />
      </div>
    </div>
  );
};
