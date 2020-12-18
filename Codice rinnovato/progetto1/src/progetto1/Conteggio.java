/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto1;

/**
 *
 * @author Aimen
 */
public class Conteggio {
    private Candidato[] ClassificaNomi;
    private Voto[] ClassificaVoti;
    private double percentuale;
    private int SchedeBianche;

    public void setClassificaNomi(Candidato[] classificaNomi) {
        ClassificaNomi = classificaNomi;
    }

    public void setClassificaVoti(Voto[] classificaVoti) {
        ClassificaVoti = classificaVoti;
    }

    public void setPercentuale(double percentuale) {
        this.percentuale = percentuale;
    }

    public void setSchedeBianche(int schedeBianche) {
        SchedeBianche = schedeBianche+1;
    }

    public Candidato[] getClassificaNomi() {
        return ClassificaNomi;
    }

    public double getPercentuale() {
        return percentuale;
    }

    public int getSchedeBianche() {
        return SchedeBianche;
    }


    public Voto[] getClassificaVoti() {
        return ClassificaVoti;
    }
}
