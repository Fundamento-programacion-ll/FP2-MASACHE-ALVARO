/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
/**
 *
 * @author HP Probook 440 G3
 */
public class paises {
       private ArrayList<provincias> listaprovincias;

    public ArrayList<provincias> getListaprovincias() {
        return listaprovincias;
    }

    public void setListaprovincias() {
        int opcion ;
        provincias provincia;
        do {            
            provincia = new provincias();
            agregarprov(provincia);
            
            opcion = JOptionPane.showConfirmDialog(null, "Mas Provincias", "Continuar",JOptionPane.YES_NO_CANCEL_OPTION);
        } while (opcion==JOptionPane.YES_NO_CANCEL_OPTION); 
        
        
    }

    public paises(ArrayList<provincias> listaprovincias) {
        this.listaprovincias = listaprovincias;
    }
    //aqui se inicializan las variables
    public paises() {
        this.listaprovincias = new ArrayList<>();
        
    }
    
    public void agregarprov (provincias p){
        
    this.listaprovincias.add(p);
    }
    
    public void ordenarp (){
    
        Collections.sort(listaprovincias,new comparador());
    }

    

    void ordenarnum() {
        
        Collections.sort(listaprovincias, new comparador2());
    }
    
    @Override
    public String toString() {
        return "Lista Provincias \n "+ listaprovincias;
    }
}
