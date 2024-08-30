import React from 'react'
import { Container } from 'react-bootstrap'
import Footer from './components/app/Footer'
import Router from './router/Router'
import Header from './components/app/Header'
import MenuBar from './components/app/MenuBar'

const App = () => {
  return (

    <Container>
        <Header/>
        <MenuBar/>
        <Router/>
        <Footer/>
    </Container>
  )
}

export default App