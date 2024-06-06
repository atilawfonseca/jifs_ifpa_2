//para poder enchergar o .env
require('dotenv').config();
const express = require('express');
const path = require('path');

//DB_URL = mongodb://localhost:27017/db_jifs

const app = express();
const PORTA = process.env.PORT || 4000;

//
app.use(express.urlencoded({extended: false}));
app.use(express.json());

app.use(express.static(path.join(__dirname, 'front-end')));

//atualizar o projeto no github sem atualizar no vercel, como fazer isso. 

//redefinindo a pasta views para ser encontrada pelo express
app.set('views', path.join(__dirname, 'front-end', 'views'));
app.set('view engine', 'ejs');

app.use('', require('./rotas/rotas_views'));


app.listen(PORTA, ()=> {
    console.log(`Servidor iniciado na porta http://localhost:${PORTA}`)
})
//para funcionar na vercel alterar localhost
//console.log(`Servidor iniciado na porta http://localhost:${PORTA}`)

//quando for colocar pra subir no vercel tem que colocar só a porta, tirar o local host