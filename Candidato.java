package progetto;

public class Candidato extends Votante {
    private String nome;
    private String cognome;
    private boolean isMale;
    private int eta;

    public Candidato(){
        nome="";
        cognome="";
        isMale=true;
        eta=0;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

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
}
