/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elezioni_javafx;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author famig
 */
public class SalvataggioFX {
    public String SalvaVotante(VotanteFX v){
        
         ObjectOutputStream output = null;
        
        try{
            output = new ObjectOutputStream(new FileOutputStream("Votante "+v.pin+".dat"));
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
    public static void stampaSuFile(ArrayList<CandidatoFX>ListaCanditati , ArrayList<VotanteFX>ListaVotanti) throws IOException {
		FileWriter fwrite = new FileWriter("Liste.txt");
                fwrite.write("ELENCO VOTANTI\n");
		for(int i=0;i< ListaVotanti.size();i++){
                    fwrite.write("votante numero "+ (i+1) +ListaVotanti.get(i));
                }
                fwrite.write("ELENCO CANDIDATI\n");
                for(int h=0;h<ListaCanditati.size(); h++){
                    fwrite.write("votante numero "+ (h+1)+ ListaCanditati.get(h));
                }
                       
		
		fwrite.close();
	}
}
