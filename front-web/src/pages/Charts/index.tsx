import React from 'react';
import './styles.css';
import Filters from '../../components/Filters/Index';


const Charts = () => {
  return(
    <div className='page-container'>
              <Filters link='/records' linkText='VER TABELA' />
    </div>
  );
}

export default Charts;