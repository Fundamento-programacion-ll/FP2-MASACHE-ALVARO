var arreglojson = [{
    nombre: 'anthony',
    edad: 29
}, {
    nombre: 'daniel',
    edad: 24
}, {
    nombre: 'pepe',
    edad: 21
}, {
    nombre: 'marco',
    edad: 26
}, {
    nombre: 'josa',
    edad: 28
}];

var suma = 0;
for (let index = 0; index < arreglojson.length; index++) {
    var element = arreglojson[index].edad;
    suma = suma + element;
};
console.log(suma);