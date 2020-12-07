package progetto;
import java.util.List;
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
     *
     */


    public static void inserimentoV(ListaVotanti listaVotanti, Votante votante){
        Scanner in = new Scanner(System.in);
        System.out.println("Quanti votanti ci sono?: ");
        listaVotanti.setNumTot(in.nextInt());
        listaVotanti.inizializzaV();
        in.nextLine();
        for (int i = 0; i < listaVotanti.getNumTot(); i++) {
            System.out.println("Inserisci l'email: ");
            votante.setEmail(in.nextLine());
            System.out.println("Inserisci numero di telefono: ");
            votante.setNumTelefono(in.nextLine());
            System.out.println("Inserisci la password: ");
            votante.setPassword(in.nextLine());
            System.out.println("Inserisci l'username: ");
            votante.setUsername(in.nextLine());
            listaVotanti.inserisciV(i,votante);
        }
    }

    public static void inserimentoC(ListaCandidati listaCandidati, Candidato candidato){
        Scanner in = new Scanner(System.in);
        System.out.println("Quanti candidati ci sono?: ");
        listaCandidati.setNumCandidati(in.nextInt());
        listaCandidati.inizializzaC();
        in.nextLine();
        for(int i = 0; i < listaCandidati.getNumCandidati(); i++){
            System.out.println("Inserisci l'email: ");
            candidato.setEmail(in.nextLine());
            System.out.println("Inserisci il tuo numero di telefono: ");
            candidato.setNumTelefono(in.nextLine());
            System.out.println("Inserisci la password: ");
            candidato.setPassword(in.nextLine());
            System.out.println("Inserisci l'username: ");
            candidato.setUsername(in.nextLine());
            System.out.println("Inserisci il tuo nome: ");
            candidato.setNome(in.nextLine());
            System.out.println("Inserisci il cognome: ");
            candidato.setCognome(in.nextLine());
            System.out.println("Inserisci la tua età: ");
            candidato.setEta(in.nextInt());
            in.nextLine();
            do{
                System.out.println("Di che sesso sei?: maschio o femmina ");
                candidato.setSesso(in.nextLine());
            }while(!candidato.getSesso().equalsIgnoreCase("maschio") && !candidato.getSesso().equalsIgnoreCase("femmina"));
            listaCandidati.inserisciC(i,candidato);
        }
    }

    public static void inserimentoVoto(Voto voto, ListaVotanti listaVotanti, ListaCandidati listaCandidati, Candidato candidato){
        Scanner in = new Scanner(System.in);
        voto.setVotiTot(listaCandidati, listaVotanti);
        String isVuoto;
        for(int i=0; i<voto.getVotiTot(); i++){
            do {
                System.out.println("Vuoi lasciare carta bianca?: si o no");
                isVuoto = in.nextLine();
                if (isVuoto.equalsIgnoreCase("si")) voto.setScritto(true);
                else if (isVuoto.equalsIgnoreCase("no")) voto.setScritto(false);
            }while(!isVuoto.equalsIgnoreCase("si") && !isVuoto.equalsIgnoreCase("no"));
            System.out.println("Chi vuoi votare: ");
            System.out.println(listaCandidati);
            System.out.println("Inserisci l'ID del candidato: ");
            voto.setId(in.nextInt());
            voto.controlloVoto(listaCandidati, candidato);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Votante votante = new Votante();
        Candidato candidato = new Candidato();
        ListaVotanti listaVotanti = new ListaVotanti();
        ListaCandidati listaCandidati = new ListaCandidati();
        Voto voto = new Voto();
        int menu;
        while(true) {
            System.out.println("Cosa vuoi fare: inserimento votanti(1), inserimento candidati(2), inserimento voti(3)");
            menu = in.nextInt();
            switch (menu) {
                case (1) -> inserimentoV(listaVotanti, votante);
                case (2) -> inserimentoC(listaCandidati, candidato);
                case (3) -> inserimentoVoto(voto, listaVotanti, listaCandidati, candidato);
            }
        }
    }
}
