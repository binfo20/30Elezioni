package progetto;

import java.util.Arrays;

class ListaCandidati {

    private int NumCandidati;
    private String NomeGruppo;
    private Candidato[] listaC = new Candidato[NumCandidati];

    public ListaCandidati(){
        NumCandidati=0;
        NomeGruppo="";
    }

    public void inizializzaC(){
        listaC = new Candidato[NumCandidati];
        for(int i=0; i<NumCandidati; i++){
            listaC[i] = new Candidato();
        }
    }

    public void setListaC(Candidato[] listaC) {
        this.listaC = listaC;
    }

    public Candidato[] getListaC() {
        return listaC;
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

    public void inserisciC(int i, Candidato candidato){
        listaC[i].setEmail(candidato.getEmail());
        listaC[i].setUsername(candidato.getUsername());
        listaC[i].setPassword(candidato.getPassword());
        listaC[i].setNumTelefono(candidato.getNumTelefono());
        listaC[i].setCognome(candidato.getCognome());
        listaC[i].setEta(candidato.getEta());
        listaC[i].setNome(candidato.getNome());
        listaC[i].setSesso(candidato.getSesso());
    }

    public void rimuoviC(int posC){
        listaC[posC] = null;
    }

    public void modifica(){

    }

    public String toString() {
        return "ListaCandidati{" +
                "listaC=" + Arrays.toString(listaC) +
                '}';
    }
}
