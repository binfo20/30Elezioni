/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elezioni.v2;
import java.io.*;
import java.util.*;

/**
 *
 * @author MorsOfficial
 */
public class Salvataggio implements Serializable {
    
     public String SalvaVotante(Votante v){
        
         ObjectOutputStream output = null;
        
        try{
            output = new ObjectOutputStream(new FileOutputStream("Votante "+v.email+".dat"));
        }
        
        catch(FileNotFoundException e){

        } catch (IOException e) {
            
            e.printStackTrace();
        }
        
        try{
            output.writeObject(v);
        }catch(IOException e1){
            e1.printStackTrace();
        }
        
        try {
            output.close();
        }catch (IOException e2){
            e2.printStackTrace();
        }
        
        return "Salvo "+ v.toString() ;
    }
    public static void stampaSuFile(ArrayList<Candidato>ListaCanditati , ArrayList<Votante>ListaVotanti) throws IOException {
		FileWriter fwrite = new FileWriter("Liste.txt");
                fwrite.write("\nELENCO VOTANTI\n");
		for(int i=0;i< ListaVotanti.size();i++){
                    fwrite.write("\nVotante numero "+ (i+1) +ListaVotanti.get(i));
                }
                fwrite.write("\nELENCO CANDIDATI\n");
                for(int h=0;h<ListaCanditati.size(); h++){
                    fwrite.write("\nCandidato numero "+ (h+1)+ ListaCanditati.get(h));
                }
                       
		
		fwrite.close();
	}

    /*public static void esci(){
        
    }
    */
    

}
