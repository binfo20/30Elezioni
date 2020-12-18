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
public class ListaVotanti {
    private int NumTot;
    private Votante[] listaV;

    public Votante[] getListaV() {
        return listaV;
    }

    public int getNumTot() { return NumTot; }

    public void setNumTot(int numTot) {
        NumTot = numTot;
    }

    //Crea un votante per ogni indirizzo della listaV
    public void inizializzaV(){
        listaV = new Votante[NumTot];
        for(int i=0; i<NumTot; i++){
            listaV[i] = new Votante();
        }
    }

    //Inserisco i parametri che ho assegnato a votante e li inserisco nell'indirizzo "i" di listaV
    public void inserisciV(int i, Votante votante){
        listaV[i].setEmail(votante.getEmail());
        listaV[i].setUsername(votante.getUsername());
        listaV[i].setPassword(votante.getPassword());
        listaV[i].setNumTelefono(votante.getNumTelefono());
    }

    //Data una certa posizione rimuove il contenuto di questo nella lista
    public void rimuoviV(int posV){
        listaV[posV] = null;
    }

    public void modificaV(int posV, String ambito){
        if(ambito.equalsIgnoreCase("email")){

        }
    }
}