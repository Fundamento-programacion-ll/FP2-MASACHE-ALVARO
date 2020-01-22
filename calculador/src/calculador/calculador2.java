/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculador;

/**
 *
 * @author HP Probook 440 G3
 */
public class calculador2 {
     public int result;
    
    public int calcularPotencia(int N, int p){
        result = N*N;
        p--;
        
        while(p!=1){
            result *= N;
            p--;
        }
        return result;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    
}
