package progetto;

import java.security.*;

public class Votante {
    private String email;
    private String NumTelefono;
    private String pin;
    private String password;
    private String username;

    public Votante() {
        email="";
        NumTelefono="";
        pin="";
        password="";
        username="";
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

    public String toString() {
        return "Votante{" +
                "email='" + email + '\'' +
                ", NumTelefono='" + NumTelefono + '\'' +
                ", pin='" + pin + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    //Genera il Pin che viene assegnato al votante
    public void generaPin() {
        SecureRandom random = new SecureRandom();
        int num = random.nextInt(10000);
        String formatted = String.format("%05d", num);
        pin = formatted;
    }
}
