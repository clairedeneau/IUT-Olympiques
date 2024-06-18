import java.util.List;
import java.util.ArrayList;

public class Equipe implements Util {
    
    private String nomEquipe;
    private List<Athlete> lesAthletes;
    private int nbVictoire;

    /**
     * Constructeur de la classe Equipe.
     * Initialise une nouvelle équipe avec une liste vide d'athlètes et un nombre de victoires à zéro.
     *
     * @param nomEquipe Le nom de l'équipe.
     */
    public Equipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
        this.lesAthletes = new ArrayList<>();
        this.nbVictoire = 0;
    }
    
    /**
     * Constructeur de la classe Equipe avec une liste d'athlètes et un nombre de victoires spécifiés.
     *
     * @param nomEquipe     Le nom de l'équipe.
     * @param listeAthletes La liste des athlètes de l'équipe.
     * @param victoire      Le nombre de victoires de l'équipe.
     */
    public Equipe(String nomEquipe, List<Athlete> listeAthletes, int victoire) {
        this.nomEquipe = nomEquipe;
        this.lesAthletes = listeAthletes;
        this.nbVictoire = victoire;
    }

    /**
     * Ajoute un nouvel athlète à l'équipe avec les attributs spécifiés.
     *
     * @param force      La force de l'athlète.
     * @param agilite    L'agilité de l'athlète.
     * @param endurance  L'endurance de l'athlète.
     * @param sexe       Le sexe de l'athlète.
     * @param nom        Le nom de l'athlète.
     * @param prenom     Le prénom de l'athlète.
     * @param victoire   Le nombre de victoires de l'athlète.
     */
    public void ajouterAthlete(double force, double agilite, double endurance, char sexe, String nom, String prenom, int victoire) {
        this.lesAthletes.add(new Athlete(force, agilite, endurance, sexe, nom, prenom, victoire));
    }

    /**
     * Ajoute un athlète existant à l'équipe.
     *
     * @param athlete L'athlète à ajouter.
     */
    public void ajouterAthlete(Athlete athlete) {
        this.lesAthletes.add(athlete);
    }

    /**
     * Retire un athlète de l'équipe.
     *
     * @param athlete L'athlète à retirer.
     */
    public void retirerAthlete(Athlete athlete) {
        this.lesAthletes.remove(athlete);
    }

    /**
     * Retire un athlète de l'équipe en spécifiant ses attributs.
     *
     * @param force      La force de l'athlète.
     * @param agilite    L'agilité de l'athlète.
     * @param endurance  L'endurance de l'athlète.
     * @param sexe       Le sexe de l'athlète.
     * @param nom        Le nom de l'athlète.
     * @param prenom     Le prénom de l'athlète.
     * @param victoire   Le nombre de victoires de l'athlète.
     */
    public void retirerAthlete(double force, double agilite, double endurance, char sexe, String nom, String prenom, int victoire) {
        this.lesAthletes.remove(new Athlete(force, agilite, endurance, sexe, nom, prenom, victoire));
    }

    /**
     * Retourne la liste des athlètes de l'équipe.
     *
     * @return La liste des athlètes de l'équipe.
     */
    public List<Athlete> getLesAthletes() {
        return lesAthletes;
    }

    /**
     * Modifie la liste des athlètes de l'équipe.
     *
     * @param lesAthletes La nouvelle liste des athlètes de l'équipe.
     */
    public void setLesAthletes(List<Athlete> lesAthletes) {
        this.lesAthletes = lesAthletes;
    }

    /**
     * Retourne le nombre de victoires de l'équipe.
     *
     * @return Le nombre de victoires de l'équipe.
     */
    @Override
    public int getNbVictoire() {
        return nbVictoire;
    }

    /**
     * Modifie le nombre de victoires de l'équipe.
     *
     * @param nbVictoire Le nouveau nombre de victoires de l'équipe.
     */
    @Override
    public void setNbVictoire(int nbVictoire) {
        this.nbVictoire = nbVictoire;
    }

    /**
     * Calcule le code de hachage pour l'équipe.
     *
     * @return Le code de hachage de l'équipe.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((lesAthletes == null) ? 0 : lesAthletes.hashCode());
        result = prime * result + nbVictoire;
        return result;
    }

    /**
     * Vérifie si l'objet donné est égal à cette équipe.
     *
     * @param obj L'objet à comparer avec cette équipe.
     * @return true si l'objet donné est égal à cette équipe, false sinon.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Equipe other = (Equipe) obj;
        if (lesAthletes == null) {
            if (other.lesAthletes != null)
                return false;
        } else if (!lesAthletes.equals(other.lesAthletes))
            return false;
        if (nbVictoire != other.nbVictoire)
            return false;
        return true;
    }

    /**
     * Participe à une compétition et retourne une note basée sur la somme des attributs de tous les athlètes de l'équipe.
     *
     * @return Une note représentant la performance collective de l'équipe.
     */
    @Override 
    public double participer() {
        double res = 0;
        for (Athlete athlete : lesAthletes) {
            res += athlete.getAgilite() + athlete.getForce() + athlete.getEndurance();
        }
        return res;
    }

    /**
     * Retourne le nom de l'équipe.
     *
     * @return Le nom de l'équipe.
     */
    public String getNomEquipe() {
        return nomEquipe;
    }

    /**
     * Modifie le nom de l'équipe.
     *
     * @param nomEquipe Le nouveau nom de l'équipe.
     */
    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    @Override
    public String toString() {
        return "Equipe [nomEquipe=" + nomEquipe + ", lesAthletes=" + lesAthletes + ", nbVictoire=" + nbVictoire + "]";
    }
   
}