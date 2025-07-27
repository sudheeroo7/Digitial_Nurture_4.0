import { useState } from 'react';
import reactLogo from './assets/react.svg';
import viteLogo from '/vite.svg';
import './App.css';
import Home from './Components/Home';
import About from './Components/About';
import Contact from './Components/Contact';
function App(){
  return (
    <div className='container'>
      <Home />
      <About />
      <Contact />
    </div>
  );
}
export default App;
