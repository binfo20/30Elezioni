
package elezioni.v2;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;


/**
 *
 * @author Aimen
 */

public class ElezioniV2 {
    
    
    public static void RisultatiFinali(ArrayList<Voto> listaVoti) 
    { 
  
        
        Set<Voto> st = new HashSet<Voto>(listaVoti); 
        for (Voto s : st) 
            System.out.println(s + ": " + Collections.frequency(listaVoti, s)); 
    } 
    
    public static void InserimentoVotanti(ArrayList<Votante>listaVotanti){
        
           System.out.println("Inserisci il numero dei votanti:");
        Scanner in = new Scanner(System.in);
        int nvotanti = in.nextInt();
        for(int i=0;i<nvotanti;i++){
            System.out.println("Inserisci votante\netà , email e pin");
        int eta = in.nextInt();
        String email = in.next();
        int pin = in.nextInt();
        listaVotanti.add(new Votante(eta,email,pin));
        }
        
    }
    
    
       public static void InserimentoCandidati(ArrayList<Candidato>listaCandidati){
            Scanner in = new Scanner(System.in);
         System.out.println("Inserisci il numero di candidati alle elezioni");
            int nCandidati = in.nextInt();
          for(int j=0;j<nCandidati;j++){
                System.out.println("Inserisci candidato\nNome:");
                 String nome = in.next();
                  System.out.println("Cognome:");
                 String cognome = in.next();
                  System.out.println("Età:");
                   int età = in.nextInt();
                   System.out.println("Partito:");
                 String Partito = in.next();
                  System.out.println("Sesso: scrivi M/F");
                  String check_sesso = in.next();
                  boolean isMale;
                  if("M".equals(check_sesso)||"m".equals(check_sesso))
                    isMale = true;
                  else isMale = false;
                    listaCandidati.add(new Candidato(nome,cognome,età,isMale,Partito));
          }
      
    }
    
       public static void InserimentoVoti(ArrayList<Voto>listaVoti , ArrayList<Votante>listaVotanti, ArrayList <Candidato>listaCandidati){
           Scanner in = new Scanner(System.in); 
           System.out.println("Caro votante , i candidati sono : ");
            for(int k=0;k<listaCandidati.size();k++){
            
            System.out.println(listaCandidati.get(k));
        }
            for(int l=0;l<listaVotanti.size();l++){
                System.out.println("\n\n\n\n\n\n"+listaVotanti.get(l)+" è il suo turno\nDeve indicare il nome del partito scrivendolo correttamente");
                String voto = in.next();
                listaVoti.add(new Voto(voto));
            }
       }
       
       
    public static void main(String[] args) throws IOException {        
       Scanner in = new Scanner(System.in);
      
        ArrayList <Votante> listaVotanti = new ArrayList<Votante>();
        ArrayList<Candidato>listaCandidati= new ArrayList<Candidato>();
        ArrayList<Voto>listaVoti= new ArrayList<Voto>();
        
        InserimentoVotanti(listaVotanti);

        InserimentoCandidati(listaCandidati);
 
        InserimentoVoti(listaVoti , listaVotanti, listaCandidati);
            
        RisultatiFinali(listaVoti);
        
        Salvataggio.stampaSuFile(listaCandidati, listaVotanti);
        
        
        
         }
}

