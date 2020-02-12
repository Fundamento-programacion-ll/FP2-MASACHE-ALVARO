const EventEmitter =require('events');
//evento principal
class eventouno extends EventEmitter{}
var instanciaeventouno = new eventouno();
instanciaeventouno.on('saludar',respuesta=>{
console.log('hola');
console.log(respuesta);
});
instanciaeventouno.emit('saludar','daniel');
    