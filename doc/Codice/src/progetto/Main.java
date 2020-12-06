package progetto;
import java.util.Scanner;
public class Main {

    /**
     * Allora, mi sembra che stiate ancora lavorando in modalità C++
     * Nel senso che usate Candidati come uno struct, e la logica è nel main.
     *
     * Avete  giustamente l'oggetto ListaVotanti?
     * Bene questo oggetto, e SOLO QUESTO deve occuparsi della lista.
     * Deve inserire, togliere, stampare la lista
     * Se volete inserire tutti i dati, magari fare un metodo .inserisci() che si occupa nell'inserimento
     * di tutti i votanti. E potrebbe aver il metodo .salva() e .carica() [Ma questa è una mia idea, ci sono
     * altre strade]
     *
     * Analogo per i candidati, che magari riuscite a riciclare parte del codice
     *
     * Così separate le responsabilità, che altrimenti sono tutte di main() e quindi non potete spartirle tra
     * i diversi programmatori.
     *
     * Main potrebbe occuparsi dei dati globali della votazione (che mi pare siano in voto, ma una cosa è
     * l'oraraio di un VOTO (ovvero quando io esprimo il voto) e una cosa è l'orario di una VOTAZIONE
     * tipo, si vota Domenica 12 marzo dalle 7 alle 23. Sono cose diverse, e secondo me le avete
     * messe assieme.
     *
     * Manca tutto il Javadoc
     *
     * Rimettete a posto l'UML dopo, che per il resto va anche abbanstanza bene
     *
     *
     * @param args
     */


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListaVotanti listaVotanti = new ListaVotanti();
        System.out.println("Quanti votanti ci sono?: ");
        listaVotanti.setNumTot(in.nextInt());
        Votante[] lisV = new Votante[listaVotanti.getNumTot()];
        ListaCandidati listaCandidati = new ListaCandidati();
        int numC=0;
        for (int i = 0; i < listaVotanti.getNumTot(); i++) {
            lisV[i] = new Votante();
        }
        in.nextLine();
        for (int i = 0; i < listaVotanti.getNumTot(); i++) {
            String isCandidato;
            System.out.println("Inserisci l'email: ");
            lisV[i].setEmail(in.nextLine());
            System.out.println("Inserisci numero di telefono: ");
            lisV[i].setNumTelefono(in.nextLine());
            System.out.println("Inserisci la password: ");
            lisV[i].setPassword(in.nextLine());
            System.out.println("Inserisci l'username");
            lisV[i].setUsername(in.nextLine());
            System.out.println("Sei anche un candidato?: si o no");
            isCandidato = in.nextLine();
            lisV[i].generaPin();
            if(isCandidato.equalsIgnoreCase("si")) lisV[i].setVotato(true);
            else if(isCandidato.equalsIgnoreCase("no")) lisV[i].setVotato(false);
            else {
                System.out.println("Valore non valido, considerato automaticamente non candidato");
                lisV[i].setVotato(false);
            }
            if(lisV[i].isVotato()){
                listaCandidati.setNumCandidati(numC);
            }
        }
        for (int i = 0; i < listaVotanti.getNumTot(); i++) {
            System.out.println(lisV[i]);
        }
        System.out.println(numC);
        listaCandidati.setNumCandidati(numC);
        Candidato[] lisC = new Candidato[listaCandidati.getNumCandidati()];
        for (int i = 0; i <listaCandidati.getNumCandidati(); i++) {

        }
    }
}
