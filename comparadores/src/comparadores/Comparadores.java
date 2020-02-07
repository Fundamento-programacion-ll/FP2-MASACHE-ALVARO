/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

/**
 *
 * @author HP Probook 440 G3
 */
public class Comparadores {
     public static void main(String[] args) {
          String salida = "";
        paises p = new paises();
        
        p.setListaprovincias();
        salida += "Lista Provincias: \n"+p.toString();
        System.out.println(salida);
        
        
        p.ordenarp();
        salida += "Lista Provincias: \n"+p.toString();
        System.out.println(salida);
        
        p.ordenarnum();
        salida += "Lista Habitantes: \n"+p.toString();
        System.out.println(salida);
    }
    }
    
   
    
    

