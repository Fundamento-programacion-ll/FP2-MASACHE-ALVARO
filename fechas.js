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
