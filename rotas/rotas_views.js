const express = require('express');
const rotas = express.Router();


rotas.get('/', async (req, res) => {
    try {
        
        res.render('index', {
            title:'Página Inicial'
        })
    } catch (error) {
        res.json({message: error.message})
    }
})

rotas.get('/modalidades', async (req, res) => {
    try{
        res.render('modalidades', {
            title: 'Modalidades'
        })
    }
    catch(error){
        res.json({message: error.message})
    }
})

rotas.get('/login', async (req, res) => {
    try{
        res.render('login', {
            title: 'login'
        })
    }
    catch(error){
        res.json({message: error.message})
    }
})

rotas.get('/cadastrar', async (req, res) => {
    try{
        res.render('cadastro', {
            title: 'cadastro'
        })
    }
    catch(error){
        res.json({message: error.message})
    }
})

rotas.get('/recuperar_senha', async (req, res) => {
    try{
        res.render('recuperar_senha', {
            title: 'Recuperação de senha'
        })
    }
    catch(error){
        res.json({message: error.message})
    }
})

module.exports = rotas; 