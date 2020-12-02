package progetto;

class inserimentoCandidati {

    private int NumCandidati;
    private String NomeGruppo;
    private Candidato ListaC[];

    public inserimentoCandidati() {
        NumCandidati=0;
        NomeGruppo="";
    }

    public int getNumCandidati() {
        return NumCandidati;
    }

    public void setNumCandidati(int numCandidati) {
        NumCandidati = numCandidati;
    }

    public String getNomeGruppo() {
        return NomeGruppo;
    }

    public void setNomeGruppo(String nomeGruppo) {
        NomeGruppo = nomeGruppo;
    }

    public Candidato[] getListaC() {
        return ListaC;
    }

    public void setListaC(Candidato[] listaC) {
        ListaC = listaC;
    }
}
