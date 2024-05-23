const mongoose = require('mongoose');

const userSchema = new mongoose.Schema({
    nome: {
        type: String, 
        require: true,
    },
    email: {
        type: String, 
        require: true, 
    },
    telefone: {
        type: String, 
        require: true, 
    },
    imagem: {
        type: String, 
        require: true, 
    },
    created: {
        type: Date, 
        require: true, 
        default: Date.now, 
    }
});
module.exports = mongoose.model('Coordenadores', userSchema);