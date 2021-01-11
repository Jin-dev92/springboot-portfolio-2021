import './App.css';
import React from 'react';
import Navigation from './component/Navigation';
import Home from './routes/Home'
import Admin from './routes/Admin'
import { HashRouter, Route } from 'react-router-dom';

function App() {
  return (
    <HashRouter>
      <Navigation component={Navigation}/>
      <Route path="/" exact={true} component={Home}/>
      <Route path="/admin" component={Admin}/>
      {/* <Route path="/movie/:id" component={Detail}/> */}
    </HashRouter>
  );
}

export default App;
