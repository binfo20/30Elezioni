package progetto;
import java.util.*;
import java.text.SimpleDateFormat;

public class Voto {
    private String data;
    private String orarioAttuale;
    private String orarioFine;
    private String orarioInizio;
    private boolean isScritto;
    private String voto;
    private int VotiTot;
    private int id;
    private int[] contaVoti;

    //Calcola i voti totali sommando i voti dei votanti e quelli del candidato
    public void setVotiTot(ListaCandidati listaCandidati, ListaVotanti listaVotanti) {
        VotiTot = listaCandidati.getNumCandidati() + listaVotanti.getNumTot();
    }

    public void setOrarioAttuale() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HH");
        orarioAttuale = formatter.format(date);
        System.out.println(orarioAttuale);
    }

    public void setId(int id) { this.id = id; }

    public int getId() { return id; }

    public void setVotiTot(int votiTot) { VotiTot = votiTot; }

    public int[] getContaVoti() { return contaVoti; }

    public void setData(String data) {
        this.data = data;
    }

    public void setOrarioInizio(String orarioInizio) { this.orarioInizio = orarioInizio; }

    public void setOrarioFine(String orarioFine) { this.orarioFine = orarioFine; }

    public String getOrarioAttuale() { return orarioAttuale; }

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

    public String getOrarioInizio() { return orarioInizio; }

    public String getOrarioFine() { return orarioFine; }

    public String getVoto() {
        return voto;
    }

    public boolean isScritto() {
        return isScritto;
    }

    //Controlla se la data attuale è compresa tra la data di apertura della votazione e quella di chiusura
    public boolean controlloDataOra(){
        int controlloOraInizio;
        int controlloOraFine;
        int controlloOraAttuale;
        controlloOraInizio = Integer.parseInt(orarioInizio);
        controlloOraFine = Integer.parseInt(orarioFine);
        controlloOraAttuale = Integer.parseInt(orarioAttuale);
        return controlloOraAttuale >= controlloOraInizio && controlloOraAttuale <= controlloOraFine;
    }

    //Inizializza la lista dei voti contaVoti
    public void inizializzaContaVoti(){
        contaVoti = new int[VotiTot];
        for(int i=0; i<VotiTot; i++){
            contaVoti[i] = 0;
        }
    }

    //Da fare
    public void controlloVoto(ListaCandidati listaCandidati, Candidato candidato){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < listaCandidati.getNumCandidati(); i++) {
            listaCandidati.ottieniC(i,candidato);
            if(candidato.getIdC() == id){
                contaVoti[i]++;
            }
        }
    }
}
