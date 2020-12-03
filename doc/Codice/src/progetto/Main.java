package progetto;
import java.util.Scanner;
public class Main {

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
