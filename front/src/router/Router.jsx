import React from 'react'
import { Route, Routes } from 'react-router'
import Home from '../components/app/Home'
import { Navbar } from 'react-bootstrap'
import BbsList from '../components/bbs/BbsList'

const Router = () => {
  return (
    <Routes>
        <Route path='/home' element={<Home/>}/>
        <Route path='/bbs/list' element={<BbsList/>}/>

    </Routes>
  )
}

export default Router