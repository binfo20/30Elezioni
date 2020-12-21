/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elezioni.v2;

/**
 *
 * @author Aimen
 */
public class Voto {
   
    String voto;

    public Voto(String voto) {
        this.voto = voto;
    }
    
    
    public String getVoto() {
        return voto;
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }

    @Override
    public String toString() {
        return "Voto{" + "voto=" + voto + '}';
    }

    

    
    
    
    
}
