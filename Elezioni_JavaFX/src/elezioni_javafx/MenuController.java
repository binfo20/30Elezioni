/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elezioni_javafx;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author famig
 */
public class MenuController implements Initializable {
    
    ArrayList <VotanteFX> listaVotanti = new ArrayList<>();
    
    String nomecandidato, cognomecandidato, etacandidato,
           partitocandidato, sessocandidato;
    
    String mailvotante,pinvotante,etavotante,partitovotante;
    
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
    private TextArea hosalvatoilvotante;
    @FXML
    private ChoiceBox partito_votante;
    
    @FXML
    private void attiva(MouseEvent event){
        stampa_lista_votanti.setDisable(false);
        stampa_lista_candidati.setDisable(false);
        cancella_tutto.setDisable(false);
        stampa_voti.setDisable(false);
    }
    
    
    
    @FXML
    private void salva_votante(MouseEvent event) throws InterruptedException{
        mailvotante=email_votante.getText();
        if("".equals(mailvotante)){
            email_votante.setPromptText("SCRIVI LA MAIL");
            return;
        }
        pinvotante=pin_votante.getText();
        if("".equals(pinvotante)){
            pin_votante.setPromptText("SCRIVI IL PIN");
            return;
        }
        etavotante=eta_votante.getText();
        if("".equals(etavotante)){
            eta_votante.setPromptText("SCRIVI L'ETA");
            return;
        }
        partitovotante=(String)partito_votante.getValue();
        if("".equals(partitovotante)){
            partito_votante.setValue(0);
            return;
        }
        listaVotanti.add(new VotanteFX(etavotante,mailvotante,pinvotante));
        Thread.sleep(3000);
        email_votante.setText("");
        pin_votante.setText("");
        eta_votante.setText("");
        partito_votante.setValue(null);
        hosalvatoilvotante.setVisible(false);
    }
    
    @FXML
    private void salva_candidato(MouseEvent event){
        nomecandidato=nome_candidato.getText();
        cognomecandidato=cognome_candidato.getText();
        etacandidato=eta_candidato.getText();
        partitocandidato=partito_candidato.getText();
        if(sesso_maschio.isSelected())sessocandidato=sesso_maschio.getText();
        else sessocandidato=sesso_femmina.getText();
        partito_votante.getItems().add(partitocandidato);
    }
    
    @FXML
    private void scelta_sesso(MouseEvent event){
       if(sesso_maschio.isPressed())sesso_femmina.setSelected(false);
       if(sesso_femmina.isPressed())sesso_maschio.setSelected(false);
    }
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        partito_votante.getItems().add("SCEGLI PARTITO");
    }    
    
}

