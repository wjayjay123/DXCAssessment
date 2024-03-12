import React, { useEffect, useState } from "react";
import { useTranslation } from "react-i18next";
import "../i18n.js";

const LanguageSelector = () => {
  const { i18n } = useTranslation();
  const [lang, setLang] = useState("English");

  const handleLang = (e) => {
    setLang(e.target.value);
    if (e.target.value === "English") {
      i18n.changeLanguage("en");
    } else {
      i18n.changeLanguage("ch");
    }
  };

  return (
    <select
      className="lang-selector"
      onChange={handleLang}
      value={i18n.language === "en" ? "English" : "中文"}
    >
      <option>English</option>
      <option>中文</option>
    </select>
  );
};

export default LanguageSelector;
