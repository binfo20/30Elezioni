/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elezioni_javafx;

/**
 *
 * @author famig
 */
public class VotoFX {
    
    String voto;

    public VotoFX(String voto) {
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
        return "VotoFX{" + "voto=" + voto + '}'+ "\n";
    }

    
}
