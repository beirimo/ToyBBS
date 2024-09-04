import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { Table } from 'react-bootstrap'

const BbsList = () => {
    const [form, setForm] = useState(``);
    const [list, setList] = useState([]);
    const [page, setPage] = useState();
    


const CallAPI = async() =>{
    const res= await axios.get('/bbs/list');

    console.log(res.data);
    setList();
    
};


useEffect(()=>{
    CallAPI(); 
},[])



    
  return (
    <div>게시판
    
    <Table responsive="sm">
      <thead>
        <tr>
          <th>#</th>
          <th>Table heading</th>
          <th>Table heading</th>
          <th>Table heading</th>
          <th>Table heading</th>
          <th>Table heading</th>
          <th>Table heading</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>1</td>
          <td>Table cell</td>
          <td>Table cell</td>
          <td>Table cell</td>
          <td>Table cell</td>
          <td>Table cell</td>
          <td>Table cell</td>
        </tr>
        
      </tbody>
    </Table>
    </div>
    
  )
}

export default BbsList