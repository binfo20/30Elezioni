
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
        int nvotanti;
        ArrayList<Votante> listaVotanti = new ArrayList<Votante>();
        ArrayList<Candidato>listaCandidati= new ArrayList<Candidato>();
       void Inserimento_Votanti(listaVotanti){
        
        System.out.println("Inserisci il numero di votanti");
        nvotanti = in.nextInt();
        for(int i=0;i<nvotanti;i++){
            System.out.println("Inserisci votante\netà , email e pin");
        int eta = in.nextInt();
        String email = in.next();
        int pin = in.nextInt();
        
        listaVotanti.add(new Votante(eta,email,pin));
        }
        
        }
        
        
        
        Salvataggio.stampaSuFile(listaCandidati, listaVotanti);
        
        
        
        //Salvataggio s = new Salvataggio();
        //for(int i=0;i<nvotanti;i++)
          //  s.SalvaVotante(listaVotanti.get(i));
        
        
        
    }
    
}
