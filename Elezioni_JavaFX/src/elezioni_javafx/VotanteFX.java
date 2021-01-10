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
    protected  int eta;
    protected  String email;
    protected int pin;
    

    public VotanteFX(int eta, String email, int pin) {
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

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    
    
}
