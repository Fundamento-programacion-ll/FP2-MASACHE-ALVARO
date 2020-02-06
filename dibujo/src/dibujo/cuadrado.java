/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujo;

import java.awt.Color;
import java.awt.Graphics;
import javax.accessibility.AccessibleContext;
import javax.swing.JOptionPane;

/**
 *
 * @author HP Probook 440 G3
 */
public class cuadrado extends figuras{
    private double lado;

   

    public cuadrado(int lado) {
        this.lado = lado;
    }

public    cuadrado() {
        super();
        String datos =JOptionPane.showInputDialog(null,"ingrese los valores");
        this.lado=Integer.parseInt(datos);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.DARK_GRAY);
        g.fill3DRect((int) this.lado,(int) this.lado,(int) this.lado,(int) this.lado ,true);
    }

}