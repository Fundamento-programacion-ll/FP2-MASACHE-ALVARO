var nombre='daniel';
var a="";
var lo = nombre.length;
console.log(nombre.length);
console.log(nombre.indexOf('d'));
console.log(nombre.substring(2,4))
console.log(nombre.search('d,a'));

console.log(nombre.charAt(3));

while(lo>=0){
    a += nombre.charAt(lo);
    console.log(a);
    lo--;
}

console.log(nombre.slice(1, -5));
console.log(nombre.slice(1,4));
console.log(nombre.split(""));
var texto ='hola mundo'
console.log("antes de remplazar");
console.log("despues de remplazar");
var texmod=(texto.replace("mundo","hola"));
console.log(texmod);
var text2= "hola mundo aparte"
console.log(text2);
console.log(text2.trim());
console.log(texto.concat("",nombre));
console.log(texto.localeCompare("hola"));
console.log(texto.toLowerCase());
