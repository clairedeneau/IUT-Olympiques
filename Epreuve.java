import java.util.List;
import java.util.ArrayList;

public class Epreuve {

    private String nom;
    private char sexe;
    private List<Score<Integer, Double, Equipe>> classement;
    private Sport sport;


    public Epreuve(String nom, char sexe, Sport sport){
    /**
     * Constructeur pour initialiser une épreuve avec son nom, le sexe des participants et le sport associé.
     *
     * @param nom Le nom de l'épreuve.
     * @param sexe Le sexe des participants ('M' pour masculin, 'F' pour féminin).
     * @param sport Le sport associé à l'épreuve.
     */
        this.nom = nom;
        this.sexe = sexe;
        this.classement = new ArrayList<Score<Integer, Double, Equipe>>();
        this.sport = sport;
    }
    
    public boolean contient(Equipe equipe){
        /**
     * Vérifie si une équipe participe à l'épreuve.
     *
     * @param equipe L'équipe à vérifier.
     * @return true si l'équipe participe, sinon false.
     */
        for(Score<Integer, Double, Equipe> sc : this.classement){
            if (sc.getParticipant().equals(equipe)){return true;}
        }
        return false;
    }

    // public void participer(Equipe equipe, int classmt){
    //     /**
    //  * Ajoute une équipe au classement de l'épreuve avec son classement.
    //  *
    //  * @param equipe L'équipe à ajouter.
    //  * @param classmt Le classement de l'équipe.
    //  */
    //     if (!(this.classement.contient(equipe))){
    //         Score<Integer, Double, Equipe> scr = new Score<Integer, Double, Equipe>(classmt, equipe);
    //         this.classement.add(scr);
    //     }
    // }

    // public void participer(Equipe equipe, int classmt, double pointsOuTemps){
    //     /**
    //  * Ajoute une équipe au classement de l'épreuve avec son classement et ses points ou son temps.
    //  *
    //  * @param equipe L'équipe à ajouter.
    //  * @param classmt Le classement de l'équipe.
    //  * @param pointsOuTemps Les points ou le temps de l'équipe.
    //  */
    //     if (!(this.classement.contient(equipe))){
    //         Score<Integer, Double, Equipe> scr = new Score<Integer, Double, Equipe>(classmt, pointsOuTemps, equipe);
    //         this.classement.add(scr);
    //     }
    // }
    // public void modifScore(Equipe equipe, int score){
    //     /**
    //  * Modifie le score d'une équipe participante.
    //  *
    //  * @param equipe L'équipe dont le score doit être modifié.
    //  * @param score Le nouveau score de l'équipe.
    //  */
    //     for(Score<Integer, Double, Equipe> sc : this.classement){
    //         if(sc.getParticipant().equals(Equipe)){
    //             sc.setScore(score);
    //         }
    //     }
    // }
}
