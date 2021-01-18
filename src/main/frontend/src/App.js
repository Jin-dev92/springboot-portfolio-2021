import './App.css';
import React from 'react';
import { HashRouter, Route, Router } from 'react-router-dom';

import Navigation from './component/Navigation';
import Home from './routes/Home';
import Admin from './routes/Admin';
import Posts from './routes/Posts';
import Kokoa from './routes/Kokoa';
function App() {
  return (
    <HashRouter>
      <Navigation component={Navigation}/>
      <Route path="/" exact={true} component={Home}/>
      <Route path="/admin" component={Admin}/>
      <Route path="/posts" component={Posts}/>
      <Route path="/kokoa" component={Kokoa}/>
      {/* <Route path="/movie/:id" component={Detail}/> */}
    </HashRouter>
  );
}

export default App;
