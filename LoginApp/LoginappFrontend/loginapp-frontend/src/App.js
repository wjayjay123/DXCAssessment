import './App.css';
import {Route, Routes} from "react-router-dom"
import {Login} from "./pages/Login"
import { Home } from './pages/Home';
import { Restricted } from './pages/Restricted';

function App() {
  return (
    <Routes>
      <Route path = "/" element={<Login/>}/>
      <Route path="/Home" element={<Home/>}/>
      <Route path="/Restricted" element={<Restricted/>}/>
    </Routes>
  );
}

export default App;
