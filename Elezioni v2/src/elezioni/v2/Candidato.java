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
   protected int partito; 

    public Candidato(String nome, String cognome, int eta, int partito) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.partito = partito;
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

    public int getPartito() {
        return partito;
    }

    public void setPartito(int partito) {
        this.partito = partito;
    }

    @Override
    public String toString() {
        return "Candidato{" + "nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", partito=" + partito + '}';
    }
    
   
}
