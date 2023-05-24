// import './App.css';
import {Route, Routes} from "react-router-dom";
import Home from "./Home";
import History from "./History";
import React from "react";
function MyRouter() {
   return (
           <Routes>
               <Route path="/home" element={<Home/>}/>
               <Route path="/history" element={<History/>}/>
               {/*<Route path="/about" element={<About/>}/>*/}
               {/*<Route path="/contact" element={<Contact/>}/>*/}
           </Routes>

    // <h4>MUIE</h4>
   )
}
export default MyRouter;
