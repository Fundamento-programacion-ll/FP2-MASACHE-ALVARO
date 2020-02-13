var arreglo = {

}
var nombresb = [{
    nombre: 'daniel',
    apellido: 'masache',
    edad: 26
}, {
    nombre: 'jose',
    apellido: 'males',
    edad: 26
}, {
    nombre: 'paul',
    apellido: 'simbaña',
    edad: 46
}, {
    nombre: 'marcos',
    apellido: 'toresani',
    edad: 28
}, {
    nombre: 'josefa',
    apellido: 'altamirano',
    edad: 26
}];
var buscarusuario = (nombresb, usuariobuscar) => {
    var usuarioencontrado = nombresb.find((usuario) => {

        return usuario.nombre === usuariobuscar;
    });
    console.log(usuarioencontrado);
};
buscarusuario(nombresb, ('daniel'));
//agregar usuario

var nuevousuario = (nombresb, nom, ape, ed) => {
    var arreglonuevo ={
        nombre:nom,
        apellido:ape,
        edad:ed
    }
    return nombresb.push(arreglonuevo);
};
nuevousuario(nombresb, ("sddfsgdh"), ("gsdfh"), (26));


//buscar usuario
var buscarusuarion = (nombresb, usuariobuscar) => {
    var usuarioencontrado = nombresb.find((usuario) => {

        return usuario.nombre === usuariobuscar;
    });
    if (usuarioencontrado !== undefined) {
        console.log(usuarioencontrado);

    } else {
        nuevousuario(nombresb, (usuariobuscar), ("gallardo"), (27));
        
    }

};
buscarusuarion(nombresb, ('daniel'));
console.log(nombresb);
//eliminar usuario
var eliminarusuario=(nombresb,usuariobuscar)=>{
    var usuarioencontrado=nombresb.filter(())
}
