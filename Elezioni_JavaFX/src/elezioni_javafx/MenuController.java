/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elezioni_javafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author famig
 */
public class MenuController implements Initializable {
    
    @FXML
    private Button autorizzazione;
    @FXML
    private Button stampa_voti;
    @FXML
    private Button stampa_lista_votanti;
    @FXML
    private Button stampa_lista_candidati;
    @FXML
    private Button cancella_tutto;
    @FXML
    private Button vota;
    @FXML
    private Button candidati;
    @FXML
    private RadioButton sesso_maschio;
    @FXML
    private RadioButton sesso_femmina;
    @FXML
    private TextField nome_candidato;
    @FXML
    private TextField cognome_candidato;
    @FXML
    private TextField eta_candidato;
    @FXML
    private TextField partito_candidato;
    @FXML
    private TextField email_votante;
    @FXML
    private TextField pin_votante;
    @FXML
    private TextField eta_votante;
    @FXML
    private TextField partito_votante;
    
    @FXML
    private void attiva(MouseEvent event){
        stampa_lista_votanti.setDisable(false);
        stampa_lista_candidati.setDisable(false);
        cancella_tutto.setDisable(false);
        stampa_voti.setDisable(false);
    }
    
    @FXML
    private void scelta_sesso(MouseEvent event){
       if(sesso_maschio.isPressed())sesso_femmina.setSelected(false);
       if(sesso_femmina.isPressed())sesso_maschio.setSelected(false);
    }
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
