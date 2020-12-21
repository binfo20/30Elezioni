
package elezioni.v2;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Aimen
 */

public class ElezioniV2 {
    
    
    public static void main(String[] args) throws IOException {
        
        
        Scanner in = new Scanner(System.in);
        ArrayList <Votante> listaVotanti = new ArrayList<Votante>();
        ArrayList<Candidato>listaCandidati= new ArrayList<Candidato>();
        //INIZIO AGGIUNTA VOTANTI ALL'ARRAYLIST
        System.out.println("Inserisci il numero di votanti");
        int nvotanti = in.nextInt();
        for(int i=0;i<nvotanti;i++){
            System.out.println("Inserisci votante\netà , email e pin");
        int eta = in.nextInt();
        String email = in.next();
        int pin = in.nextInt();
        listaVotanti.add(new Votante(eta,email,pin));
        }
        //FINE AGGIUNTA VOTANTI ALL'ARRAY LIST
        
        //INIZIO AGGIUNTA CANDIDATI ALL'ARRAYLIST
           System.out.println("Inserisci il numero di candidati alle elezioni");
            int nCandidati = in.nextInt();
          for(int j=0;j<nCandidati;j++){
                System.out.println("Inserisci candidato\n Nome:");
                 String nome = in.next();
                  System.out.println("Cognome:");
                 String cognome = in.next();
                  System.out.println("Età:");
                   int età = in.nextInt();
                   System.out.println("Partito:");
                 String Partito = in.next();
                    listaCandidati.add(new Candidato(nome,cognome,età,Partito));
          }
        //FINE AGGIUNTA CANDIDATI ALL'ARRAYLIST
        
        
        
        
        
        //INIZIO SCRITTURA SU FILE TXT DEI CANDITATI E VOTANTI
        Salvataggio.stampaSuFile(listaCandidati, listaVotanti);
        //FINE SCRITTURA SU FILE TXT DEI CANDITATI E VOTANTI
        
        
        //Salvataggio s = new Salvataggio();
        //for(int i=0;i<nvotanti;i++)
          //  s.SalvaVotante(listaVotanti.get(i));
        
        
        
    }

    
    
}

