//para poder enchergar o .env
require('dotenv').config();
const express = require('express');
const path = require('path');


const app = express();
const PORTA = process.env.PORT || 4000;

//
app.use(express.urlencoded({extended: false}));
app.use(express.json());

app.use(express.static(path.join(__dirname, 'front-end')));

app.set('view engine', 'ejs');

app.use("", require('./rotas/rotas'));



app.listen(PORTA, ()=> {
    console.log(`Servidor iniciado na porta http://localhost:${PORTA}`)
})
