import React, {useEffect, useState} from 'react';
import axios from 'axios'; // é o que faz a ponte com o http
import {RecordsResponse} from'./types';
import './styles.css';
import { formatDate } from './helpers';


const BASE_URL = 'http://localhost:8080'

const Records = () => {
  const [recordsResponse, setRecordsResponse] = useState<RecordsResponse>(); 
  // useState é um Hooks que faz o estado dos meus dados
  //integração com API
  // essa função trata do ciclo de vida do componente
  // O que estiver aqui dentro será executado assim que esse componente inicializar
  useEffect(() => {
    //chamando o endpoint
    axios.get(`${BASE_URL}/records?linesPerPage=12`).then(response => setRecordsResponse(response.data) );
  }, []);

  return (
    <div className='page-container'>
      <table className='records-table' cellPadding="0" cellSpacing="0">
      <thead>
        <tr>
          <th>INSTANTE</th>
          <th>NOME</th>
          <th>IDADE</th>
          <th>PLATAFORMA</th>
          <th>GÊNERO</th>
          <th>TÍTULO DO GAME</th>
        </tr>
      </thead>
      <tbody>
        {recordsResponse?.content.map(record => (
            <tr key={record.id}>
            <td>{formatDate(record.moment)}</td>
            <td>{record.name}</td>
            <td>{record.age}</td>
            <td className='text-secondary'>{record.gamePlatform}</td>
            <td>{record.genreName}</td>
            <td className='text-primary'>{record.gameTitle}</td>
          </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default Records;