import React from 'react';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Home from './pages/Home';
import Header from './components/Header';
import Records from './pages/Records';

//Rotas
const AppRoutes = () => (
  <Routes>
    <Route path='/' element={<Home />} />
    <Route path='/records' element={<Records />} />
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
