import React, { useEffect, useState } from "react";
import { useTranslation } from "react-i18next";
import "../i18n.js";

const LanguageSelector = () => {
  const { i18n } = useTranslation();

  const handleLang = (e) => {
    if (e.target.value === "English") {
      i18n.changeLanguage("en");
    } else {
      i18n.changeLanguage("ch");
    }
  };

  return (
    <select className="lang-selector" onChange={handleLang}>
      <option>English</option>
      <option>中文</option>
    </select>
  );
};

export default LanguageSelector;
