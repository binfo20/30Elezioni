package progetto;

public class Voto {
    private String data;
    private String orario;
    private boolean isScritto;
    private String voto;
    private int VotiTot;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setVotiTot(ListaCandidati listaCandidati, ListaVotanti listaVotanti) {
        VotiTot = listaCandidati.getNumCandidati() + listaVotanti.getNumTot();
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setOrario(String orario) {
        this.orario = orario;
    }

    public void setScritto(boolean scritto) {
        isScritto = scritto;
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }

    public int getVotiTot() {
        return VotiTot;
    }

    public String getData() {
        return data;
    }

    public String getOrario() {
        return orario;
    }

    public String getVoto() {
        return voto;
    }

    public boolean isScritto() {
        return isScritto;
    }

    public boolean controlloDataOra(){

        return true;
    }

    public void controlloVoto(ListaCandidati listaCandidati, Candidato candidato){
        for (int i = 0; i < listaCandidati.getNumCandidati(); i++) {
        }
    }

}
