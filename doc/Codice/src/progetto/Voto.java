package progetto;

public class Voto {
    private String data;
    private String orario;
    private boolean isScritto;
    private String voto;

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
}
