/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

import java.util.ArrayList;

/**
 *
 * @author HP Probook 440 G3
 */
public class paises {
    private ArrayList<provincias> listaprovincias;

    public ArrayList<provincias> getListaprovincias() {
        return listaprovincias;
    }

    public void setListaprovincias(ArrayList<provincias> listaprovincias) {
        this.listaprovincias = listaprovincias;
    }

    public paises() {
        this.listaprovincias= new ArrayList<>();
    }

    public paises(ArrayList<provincias> listaprovincias) {
        this.listaprovincias = listaprovincias;
    }
    public void agregarprovincias(provincias p) {
        this.listaprovincias.add(p);
        
    }
    
}
