import React from 'react';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Home from './pages/Home';
import Header from './components/Header';
import Records from './pages/Records';
import Charts from './pages/Charts';

//Rotas
const AppRoutes = () => (
  <Routes>
    <Route path='/' element={<Home />} />
    <Route path='/records' element={<Records />} />
    <Route path='/charts' element={<Charts />} />
  </Routes>
  
);

//Header
const MainRoutes = () => (
  <BrowserRouter>
    <Header />
    <AppRoutes />
  </BrowserRouter>
);

export default MainRoutes;
