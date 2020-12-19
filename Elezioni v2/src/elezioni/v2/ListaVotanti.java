/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elezioni.v2;
import java.util.*;
/**
 *
 * @author Aimen
 */
public class ListaVotanti {
    protected ArrayList<Votante> listaVotanti;

    public ListaVotanti() {
        super();
        this.listaVotanti=listaVotanti;
    }

    public ArrayList<Votante> getListaVotanti() {
        return listaVotanti;
    }

    public void setListaVotanti(ArrayList<Votante> listaVotanti) {
        this.listaVotanti = listaVotanti;
    }
    
    public void aggiungiVotante(Votante p){
        listaVotanti.add(p);
    }

    @Override
    public String toString() {
        return "ListaVotanti{" + "listaVotanti=" + listaVotanti + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
}
