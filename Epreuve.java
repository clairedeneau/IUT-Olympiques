import java.util.List;
import java.util.ArrayList;

public class Epreuve {

    private String nom;
    private char sexe;
    private List<Score<Integer, Double, Equipe>> classement;
    private Sport sport;


    public Epreuve(String nom, char sexe, Sport sport){
        this.nom = nom;
        this.sexe = sexe;
        this.classement = new ArrayList<Score<Integer, Double, Equipe>>();
        this.sport = sport;
    }
    
    public boolean contient(Equipe equipe){
        for(Score<Integer, Double, Equipe> sc : this.classement){
            if (sc.getParticipant().equals(equipe)){return true;}
        }
        return false;
    }

    public void participer(Equipe equipe, int classmt){
        if (!(this.classement.contient(equipe))){
            Score<Integer, Double, Equipe> scr = new Score<Integer, Double, Equipe>(classement, equipe);
            this.classement.add(scr);
        }
    }

    public void participer(Equipe equipe, int classmt, double pointsOuTemps){
        if (!(this.classement.contient(equipe))){
            Score<Integer, Double, Equipe> scr = new Score<Integer, Double, Equipe>(classement, pointsOuTemps, equipe);
            this.classement.add(scr);
        }
    }
    public void modifScore(Equipe equipe, int score){
        for(Score<Integer, Double, Equipe> sc : this.classement){
            if(sc.getParticipant().equals(Equipe)){
                sc.setScore(score);
            }
        }
    }
}