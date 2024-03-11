import './App.css';
import {Route, Routes} from "react-router-dom"
import {Login} from "./pages/Login"
import { Home } from './pages/Home';

function App() {
  return (
    <Routes>
      <Route path = "/" element={<Login/>}/>
      <Route path="/Home" element={<Home/>}/>
    </Routes>
  );
}

export default App;
