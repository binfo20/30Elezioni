package progetto;

public class ListaVotanti {
    private int NumTot;
    private Votante[] listaV;

    public Votante[] getListaV() {
        return listaV;
    }

    public void inizializzaV(){
        listaV = new Votante[NumTot];
        for(int i=0; i<NumTot; i++){
            listaV[i] = new Votante();
        }
    }

    public int getNumTot() { return NumTot; }

    public void setNumTot(int numTot) {
        NumTot = numTot;
    }

    public void inserisciV(int i, Votante votante){
        listaV[i].setEmail(votante.getEmail());
        listaV[i].setUsername(votante.getUsername());
        listaV[i].setPassword(votante.getPassword());
        listaV[i].setNumTelefono(votante.getNumTelefono());
    }

    public void rimuoviV(int posV){
        listaV[posV] = null;
    }

    public void modificaV(int posV, String ambito){
        if(ambito.equalsIgnoreCase("email")){

        }
    }
}
