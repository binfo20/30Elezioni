/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elezioni.v2;

/**
 *
 * @author Tommy
 */
public class Candidato {
    protected String nome;
    protected String cognome;
    protected  int eta;
    protected String partito;
    protected boolean isMale; 

    public Candidato(String nome, String cognome, int eta, boolean isMale, String partito) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.isMale = isMale;
        this.partito = partito;
    }

    public boolean isIsMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
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

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getPartito() {
        return partito;
    }

    public void setPartito(String partito) {
        this.partito = partito;
    }

    @Override
    public String toString() {
        return "Candidato{" + "nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", partito=" + partito + ", isMale=" + isMale + '}';
    }

    
    
   
}
