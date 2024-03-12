import i18n from 'i18next';
import LanguageDetector from 'i18next-browser-languagedetector';
import {initReactI18next} from "react-i18next";

i18n.use(LanguageDetector).use(initReactI18next).init({
    debug:true,
    lng: "en",
    resources:{
        en:{
            translation:{
                login: "Login",
                userid: "User ID",
                password: "Password",
                autherr: "Incorrect user id or password.",
                welcome: "Welcome",
                role: "Role",
                logout: "Logout",
                accRestrict: "Access restricted website",
                resPage: "Restricted Page",
                resText: "Hi Manager, this is a restricted page.",
            },
        },
        ch:{
            translation:{
                login: "登录",
                userid: "用户 ID",
                password: "密码",
                autherr: "用户ID或密码不正确。",
                welcome: "欢迎",
                role: "角色",
                logout: "登出",
                accRestrict: "访问受限网站",
                resPage: "受限网页",
                resText: "管理员您好，这是一个受限页面。",
            },
        }
    }
})