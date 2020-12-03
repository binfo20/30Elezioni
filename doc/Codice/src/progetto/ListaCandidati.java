package progetto;

class ListaCandidati {

    private int NumCandidati;
    private String NomeGruppo;

    public ListaCandidati(){
        NumCandidati=0;
        NomeGruppo="";
    }

    public int getNumCandidati() {
        return NumCandidati;
    }

    public void setNumCandidati(int numCandidati) {
        NumCandidati = numCandidati+1;
    }

    public String getNomeGruppo() {
        return NomeGruppo;
    }

    public void setNomeGruppo(String nomeGruppo) {
        NomeGruppo = nomeGruppo;
    }

}
