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

module.exports = rotas; 