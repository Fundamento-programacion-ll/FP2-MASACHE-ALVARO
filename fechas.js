
var arreglo=[
    {
    nombre :'daniel',
    apellido:'masache',
    edad:26,
}
];var buscarusuario=(arreglo,usuarioabuscar)=>{
    var usuarioencontrado=arreglo.find((usuario)=>{
        return usuario.nombre === usuarioabuscar;
    });
    console.log(usuarioencontrado);
};
buscarusuario(arreglo,('daniel'));
//fechas 2
const moment = require ('moment');
var fecha=new Date();
console.log(fecha);
console.log(fecha.getDay());
console.log(fecha.getMonth()+1);
console.log(fecha.getUTCFullYear());
console.log(fecha.getDay(),fecha.getMonth(),fecha.getFullYear());
const horaactual = moment().format('hh:mm:ss');
console.log(horaactual);
console.log(moment().add(3,'hours').toString());
console.log(fecha.toISOString());
console.log(fecha.toDateString());
console.log(fecha.toUTCString());
console.log(fecha.getDay(),fecha.getMonth());
console.log(moment().format('dddd').toString());


