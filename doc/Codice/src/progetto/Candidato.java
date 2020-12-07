package progetto;

import java.util.Random;

public class Candidato extends Votante {
    private String nome;
    private String cognome;
    private String sesso;
    private int eta;
    private int idC;

    public Candidato(){
        nome="";
        cognome="";
        sesso="";
        eta=0;
        idC=0;
    }

    public void generaIdC(ListaCandidati listaCandidati){
        Random random = new Random();
        idC = random.nextInt(listaCandidati.getNumCandidati());
    }

    public int getIdC() { return idC; }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void setSesso(String sesso) { this.sesso = sesso; }

    public String getSesso() { return sesso; }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Candidato{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", sesso='" + sesso + '\'' +
                ", eta=" + eta +
                ", idC=" + idC +
                '}';
    }
}
