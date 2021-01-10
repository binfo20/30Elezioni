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
public class CandidatoFX {
    protected String nome;
    protected String cognome;
    protected String eta;
    protected String partito;
    protected String Sesso; 

    public CandidatoFX(String nome, String cognome, String eta, String partito, String Sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.partito = partito;
        this.Sesso = Sesso;
    }

    @Override
    public String toString() {
        return "CandidatoFX{" + "nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", partito=" + partito + ", Sesso=" + Sesso + '}' + "\n";
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public String getPartito() {
        return partito;
    }

    public void setPartito(String partito) {
        this.partito = partito;
    }

    public String getSesso() {
        return Sesso;
    }

    public void setSesso(String Sesso) {
        this.Sesso = Sesso;
    }

   

    
    
   
}
