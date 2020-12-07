package progetto;

public class Conteggio {
    private Candidato ClassificaNomi[];
    private Voto ClassificaVoti[];
    private double percentuale;
    private int SchedeBianche;

    public Conteggio(Candidato[] classificaNomi, Voto[] classificaVoti, double percentuale, int schedeBianche) {
        ClassificaNomi = classificaNomi;
        ClassificaVoti = classificaVoti;
        this.percentuale = percentuale;
        SchedeBianche = schedeBianche;
    }

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
        SchedeBianche = schedeBianche;
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
