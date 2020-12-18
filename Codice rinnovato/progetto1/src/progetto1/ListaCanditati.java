/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto1;

/**
 *
 * @author Aimen
 */
import java.util.Arrays;

class ListaCandidati{

    private int NumCandidati;
    private String NomeGruppo;
    private Candidato[] listaC = new Candidato[NumCandidati];

    public ListaCandidati(){
        NumCandidati=0;
        NomeGruppo="";
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

    public String toString() {
        return "ListaCandidati{" +
                "listaC=" + Arrays.toString(listaC) +
                '}';
    }

    //Crea un candidato per ogni indirizzo della listaC
    public void inizializzaC(){
        listaC = new Candidato[NumCandidati];
        for(int i=0; i<NumCandidati; i++){
            listaC[i] = new Candidato();
        }
    }

    //Inserisco i parametri che ho messo in candidato nel main e li inserisco nell'indirizzo "i" della listaC
    public void inserisciC(int i, Candidato candidato){
        listaC[i].setEmail(candidato.getEmail());
        listaC[i].setUsername(candidato.getUsername());
        listaC[i].setPassword(candidato.getPassword());
        listaC[i].setNumTelefono(candidato.getNumTelefono());
        listaC[i].setCognome(candidato.getCognome());
        listaC[i].setEta(candidato.getEta());
        listaC[i].setNome(candidato.getNome());
        listaC[i].setSesso(candidato.getSesso());
        listaC[i].setIdC(i);
        listaC[i].generaPin();
    }
    //Ottengo i parametri del candidato che ho assegnato all'indirizzo "i" passato
    public void ottieniC(int i, Candidato candidato){
        candidato.setIdC(listaC[i].getIdC());
        candidato.setEmail(listaC[i].getEmail());
        candidato.setUsername(listaC[i].getUsername());
        candidato.setPassword(listaC[i].getPassword());
        candidato.setNumTelefono(listaC[i].getNumTelefono());
        candidato.setCognome(listaC[i].getCognome());
        candidato.setEta(listaC[i].getEta());
        candidato.setNome(listaC[i].getNome());
        candidato.setSesso(listaC[i].getSesso());
    }

    //Data una certa posizione rimuove il contenuto di questo nella lista
    public void rimuoviC(int posC){
        listaC[posC] = null;
    }

    //Da fare
    public void modificaC(){

    }
}
