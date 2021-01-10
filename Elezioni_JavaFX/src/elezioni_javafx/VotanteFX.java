/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elezioni_javafx;
import java.io.Serializable;

/**
 *
 * @author famig
 */
public class VotanteFX implements Serializable  {
    //Il votante è segreto
    protected  String eta;
    protected  String email;
    protected String pin;

    public VotanteFX(String eta, String email, String pin) {
        this.eta = eta;
        this.email = email;
        this.pin = pin;
    }
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEta() {
        return eta;
    }

    public String getPin() {
        return pin;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    
    
    
}
