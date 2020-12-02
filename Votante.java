package progetto;

import java.security.*;

public class Votante {
    private String email;
    private String NumTelefono;
    private String pin;
    private String password;
    private String username;
    private boolean isVotato;

    public Votante() {
        email="";
        NumTelefono="";
        pin="";
        password="";
        username="";
        isVotato=true;
    }

    public boolean isVotato() {
        return isVotato;
    }

    public void setVotato(boolean votato) {
        isVotato = votato;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPin() {
        return pin;
    }

    public void setPin() {
        SecureRandom random = new SecureRandom();
        int num = random.nextInt(100000);
        String formatted = String.format("%05d", num);
        pin = formatted;
    }

    public String getNumTelefono() {
        return NumTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        NumTelefono = numTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
