var arreglo =[1,2,3,4,5];
console.log(arreglo.length);
arreglo.push(6);
for(let index =0 ;index <arreglo.length;index++){
    var element=arreglo[index];
    console.log(element);

}
console.log(arreglo.length);
arreglo.pop();
console.log(arreglo[3]);
console.log(arreglo.slice(2,4));
console.log(arreglo.shift());
console.log(arreglo.reverse());
var arregloString= 'daniel';
var arreglopalabra = arregloString.split('');
console.log(arreglopalabra.reverse());
console.log(arreglo);
var arreglodividido =arreglo.slice(2,4);
console.log(arreglodividido);
arreglo.splice(0,1);
console.log(arreglo);

//foreach
console.log('Foreach');
arreglo.forEach((elemento2,indice) => {
    console.log(elemento2,indice);
});
 var arreglomutado=arreglo.map((e,i) =>{
return e + i;
}).forEach((el ,ind)=>{
    console.log(el);
}).map((e)=>{
    return e -i;
});
console.log(arreglomutado);
var arreglo3=arreglo.some((e,i)=>{
    return e== 2;
});
console.log(arreglo3);

