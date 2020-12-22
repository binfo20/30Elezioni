/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elezioni.v2;
import java.util.*;
/**
 *
 * @author Tommy
 */
//lista di tutti i candidati
public class ListaCandidati {
        public ArrayList<Candidato> listaCandidato;

    public ListaCandidati(ArrayList<Candidato> listaCandidato) {
        super();
        this.listaCandidato = listaCandidato;
    }

    public ArrayList<Candidato> getListaCandidato() {
        return listaCandidato;
    }

    public void setListaCandidato(ArrayList<Candidato> listaCandidato) {
        this.listaCandidato = listaCandidato;
    }
    
      public void aggiungiCandidato(Candidato p){
       listaCandidato.add(p);
    }

    @Override
    public String toString() {
        return "ListaCandidati{" + "listaCandidato=" + listaCandidato + '}';
    }

     
    
     
}
