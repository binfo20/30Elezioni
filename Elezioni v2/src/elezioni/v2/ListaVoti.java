/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elezioni.v2;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Aimen
 */
public class ListaVoti {
    public ArrayList <Voto> listaVoti;

    public ArrayList<Voto> getListaVoti() {
        return listaVoti;
    }

    public void setListaVoti(ArrayList<Voto> listaVoti) {
        this.listaVoti = listaVoti;
    }
    
    public void aggiungiVoti(Voto p){
        listaVoti.add(p);
    }

    @Override
    public String toString() {
        return "ListaVoti{" + "listaVoti=" + listaVoti + '}';
    }
    
    
    
    
    
}
