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
 * @author famig
 */
public class Salvataggio implements Serializable {
    
     public String Salva(Votante v){
        
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


}
