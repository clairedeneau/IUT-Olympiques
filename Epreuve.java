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

    public void participer(Equipe equipe, int classmt){
        /**
     * Ajoute une équipe au classement de l'épreuve avec son classement.
     *
     * @param equipe L'équipe à ajouter.
     * @param classmt Le classement de l'équipe.
     */
        if (!(this.contient(equipe))){
            Score<Integer, Double, Equipe> scr = new Score<Integer, Double, Equipe>(classmt, equipe);
            this.classement.add(scr);
        }
    }

    public void participer(Equipe equipe, int classmt, double pointsOuTemps){
        /**
     * Ajoute une équipe au classement de l'épreuve avec son classement et ses points ou son temps.
     *
     * @param equipe L'équipe à ajouter.
     * @param classmt Le classement de l'équipe.
     * @param pointsOuTemps Les points ou le temps de l'équipe.
     */
        if (!(this.contient(equipe))){
            Score<Integer, Double, Equipe> scr = new Score<Integer, Double, Equipe>(classmt, pointsOuTemps, equipe);
            this.classement.add(scr);
        }
    }
    public void modifScore(Equipe equipe, double score){
        /**
     * Modifie le score d'une équipe participante.
     *
     * @param equipe L'équipe dont le score doit être modifié.
     * @param score Le nouveau score de l'équipe.
     */
        for(Score<Integer, Double, Equipe> sc : this.classement){
            if(sc.getParticipant().equals(equipe)){
                sc.setScore(score);
            }
        }
    }

    /**
     * Obtient le nom de l'épreuve.
     * 
     * @return Le nom de l'épreuve.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom de l'épreuve.
     * 
     * @param nom Le nom à définir pour l'épreuve.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

     /**
     * Obtient le sexe des participants de l'épreuve.
     * 
     * @return Le sexe des participants.
     */
    public char getSexe() {
        return sexe;
    }

    /**
     * Définit le sexe des participants de l'épreuve.
     * 
     * @param sexe Le sexe à définir pour les participants.
     */
    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

     /**
     * Obtient le classement des participants de l'épreuve.
     * 
     * @return Une liste de scores représentant le classement.
     */
    public List<Score<Integer, Double, Equipe>> getClassement() {
        return classement;
    }

    /**
     * Définit le classement des participants de l'épreuve.
     * 
     * @param classement Une liste de scores représentant le classement à définir.
     */
    public void setClassement(List<Score<Integer, Double, Equipe>> classement) {
        this.classement = classement;
    }

    /**
     * Obtient le sport de l'épreuve.
     * 
     * @return Le sport de l'épreuve.
     */
    public Sport getSport() {
        return sport;
    }

    /**
     * Définit le sport de l'épreuve.
     * 
     * @param sport Le sport à définir pour l'épreuve.
     */
    public void setSport(Sport sport) {
        this.sport = sport;
    }
    
    /**
     * Lance l'épreuve et met à jour le classement et les scores des participants.
     * Met également à jour le nombre de médailles des pays correspondants.
     */
    public void lancer(){
        int place = 1;
        int score = 100;
        for (Score<Integer, Double, Equipe> result : this.classement){
            result.setClassement(place);
            result.setScore(score);
            place++;
            score -= 5;
            if (place == 1){
                result.getParticipant().ajouteVictoire();
                result.getParticipant().getLesAthletes().get(0).getPays().ajouteOr();
            }
            if (place == 2){
                result.getParticipant().getLesAthletes().get(0).getPays().ajouteArgent();
            }
            if (place == 3){
                result.getParticipant().getLesAthletes().get(0).getPays().ajouteBronze();
            }
        }
    }
}