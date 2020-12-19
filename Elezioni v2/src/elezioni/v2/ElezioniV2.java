
package elezioni.v2;
import java.util.*;
import java.util.Scanner;



public class ElezioniV2 {
    

    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        int nvotanti;
        ArrayList<Votante> listaVotanti = new ArrayList<Votante>();
        System.out.println("Inserisci il numero di votanti");
        nvotanti = in.nextInt();
        for(int i=0;i<nvotanti;i++){
            System.out.println("Inserisci votante\netà , email e pin");
        int eta = in.nextInt();
        String email = in.next();
        int pin = in.nextInt();
        
        listaVotanti.add(new Votante(eta,email,pin));
        
        }
        for(int i=0;i<listaVotanti.size();i++){
            System.out.println(listaVotanti.get(i)+"\n");
        }
        
        //PICCOLA PROVA SALVATAGGIO
        Salvataggio s = new Salvataggio();
        for(int i=0;i<nvotanti;i++)
            s.Salva(listaVotanti.get(i));
        //FINE PROVA SALVATAGGIO
        
    }
    
}
