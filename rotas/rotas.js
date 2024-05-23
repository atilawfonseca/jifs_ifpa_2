const express = require('express');
const rotas = express.Router();


rotas.get('/', async (req, res) => {
    try {
        app.get('/', (req, res) => {
            res.send('ola, mundo!');
        })
        
    } catch (error) {
        res.json({message: error.message});
    }
})