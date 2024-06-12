import java.util.ArrayList;
import java.util.List;

public class Pays {
    
    private int nbMedailleOr;
    private int nbMedailleArgent;
    private int nbMedailleBronze;
    private String nom;
    private List<Athlete> listeAthletes;

    /**
     * Constructeur de la classe Pays avec des médailles et une liste d'athlètes spécifiés.
     *
     * @param nbMedailleOr     Le nombre de médailles d'or.
     * @param nbMedailleArgent Le nombre de médailles d'argent.
     * @param nbMedailleBronze Le nombre de médailles de bronze.
     * @param nom              Le nom du pays.
     * @param listeAthletes    La liste des athlètes du pays.
     */
    public Pays(int nbMedailleOr, int nbMedailleArgent, int nbMedailleBronze, String nom, List<Athlete> listeAthletes) {
        this.nbMedailleOr = nbMedailleOr;
        this.nbMedailleArgent = nbMedailleArgent;
        this.nbMedailleBronze = nbMedailleBronze;
        this.nom = nom;
        this.listeAthletes = listeAthletes;
    }

    /**
     * Constructeur de la classe Pays avec un nom spécifié.
     * Initialise un pays avec zéro médaille et une liste vide d'athlètes.
     *
     * @param nom Le nom du pays.
     */
    public Pays(String nom) {
        this.nom = nom;
        this.listeAthletes = new ArrayList<>();
        this.nbMedailleOr = 0;
        this.nbMedailleArgent = 0;
        this.nbMedailleBronze = 0;
    }

    /**
     * Ajoute un nouvel athlète à la liste avec les attributs spécifiés.
     *
     * @param force      La force de l'athlète.
     * @param agilite    L'agilité de l'athlète.
     * @param endurance  L'endurance de l'athlète.
     * @param sexe       Le sexe de l'athlète.
     * @param nom        Le nom de l'athlète.
     * @param prenom     Le prénom de l'athlète.
     * @param nbVictoire Le nombre de victoires de l'athlète.
     */
    public void ajouterAthlete(int force, int agilite, int endurance, char sexe, String nom, String prenom, int nbVictoire) {
        this.listeAthletes.add(new Athlete(force, agilite, endurance, sexe, nom, prenom, nbVictoire));
    }

    /**
     * Ajoute un athlète existant à la liste.
     *
     * @param unAthlete L'athlète à ajouter.
     */
    public void ajouterAthlete(Athlete unAthlete) {
        this.listeAthletes.add(unAthlete);
    }

    /**
     * Retire un athlète de la liste.
     *
     * @param unAthlete L'athlète à retirer.
     */
    public void retirerAthlete(Athlete unAthlete) {
        this.listeAthletes.remove(unAthlete);
    }

    /**
     * Retire un athlète de la liste en spécifiant ses attributs.
     *
     * @param force      La force de l'athlète.
     * @param agilite    L'agilité de l'athlète.
     * @param endurance  L'endurance de l'athlète.
     * @param sexe       Le sexe de l'athlète.
     * @param nom        Le nom de l'athlète.
     * @param prenom     Le prénom de l'athlète.
     * @param nbVictoire Le nombre de victoires de l'athlète.
     */
    public void retirerAthlete(int force, int agilite, int endurance, char sexe, String nom, String prenom, int nbVictoire) {
        this.listeAthletes.remove(new Athlete(force, agilite, endurance, sexe, nom, prenom, nbVictoire));
    }

    /**
     * Retourne le nombre de médailles d'or du pays.
     *
     * @return Le nombre de médailles d'or.
     */
    public int getNbMedailleOr() {
        return nbMedailleOr;
    }

    /**
     * Modifie le nombre de médailles d'or du pays.
     *
     * @param nbMedailleOr Le nouveau nombre de médailles d'or.
     */
    public void setNbMedailleOr(int nbMedailleOr) {
        this.nbMedailleOr = nbMedailleOr;
    }

    /**
     * Retourne le nombre de médailles d'argent du pays.
     *
     * @return Le nombre de médailles d'argent.
     */
    public int getNbMedailleArgent() {
        return nbMedailleArgent;
    }

    /**
     * Modifie le nombre de médailles d'argent du pays.
     *
     * @param nbMedailleArgent Le nouveau nombre de médailles d'argent.
     */
    public void setNbMedailleArgent(int nbMedailleArgent) {
        this.nbMedailleArgent = nbMedailleArgent;
    }

    /**
     * Retourne le nombre de médailles de bronze du pays.
     *
     * @return Le nombre de médailles de bronze.
     */
    public int getNbMedailleBronze() {
        return nbMedailleBronze;
    }

    /**
     * Modifie le nombre de médailles de bronze du pays.
     *
     * @param nbMedailleBronze Le nouveau nombre de médailles de bronze.
     */
    public void setNbMedailleBronze(int nbMedailleBronze) {
        this.nbMedailleBronze = nbMedailleBronze;
    }

    /**
     * Retourne le nom du pays.
     *
     * @return Le nom du pays.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Modifie le nom du pays.
     *
     * @param nom Le nouveau nom du pays.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne la liste des athlètes du pays.
     *
     * @return La liste des athlètes.
     */
    public List<Athlete> getListeAthletes() {
        return listeAthletes;
    }

    /**
     * Modifie la liste des athlètes du pays.
     *
     * @param listeAthletes La nouvelle liste des athlètes.
     */
    public void setListeAthletes(List<Athlete> listeAthletes) {
        this.listeAthletes = listeAthletes;
    }
}