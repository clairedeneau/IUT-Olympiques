import java.util.ArrayList;
import java.util.List;

public class Pays {
    
    private int nbMedailleOr;
    private int nbMedailleArgent;
    private int nbMedailleBronze;
    private String nom;
    private List<Athlete> listeAthletes;

    /**
     * Constructeur de la classe Pays avec des médailles et une liste d'équipes spécifiés.
     *
     * @param nbMedailleOr     Le nombre de médailles d'or.
     * @param nbMedailleArgent Le nombre de médailles d'argent.
     * @param nbMedailleBronze Le nombre de médailles de bronze.
     * @param nom              Le nom du pays.
     * @param listeEquipes     La liste des équipes du pays.
     */
    public Pays(int nbMedailleOr, int nbMedailleArgent, int nbMedailleBronze, String nom, List<Athlete> athletes) {
        this.nbMedailleOr = nbMedailleOr;
        this.nbMedailleArgent = nbMedailleArgent;
        this.nbMedailleBronze = nbMedailleBronze;
        this.nom = nom;
        this.listeAthletes = athletes;
    }

    /**
     * Constructeur de la classe Pays avec un nom spécifié.
     * Initialise un pays avec zéro médaille et une liste vide d'équipes.
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
     * Ajoute une équipe existante à la liste.
     *
     * @param nomEquipe    Le nom de l'équipe.
     * @param listeAthletes La liste des athlètes de l'équipe.
     * @param nbVictoire   Le nombre de victoires de l'équipe.
     */
    public void ajouterAthletes(List<Athlete> listeAthletes) {
        this.listeAthletes.addAll(listeAthletes);
    }

    public void ajouteAthlete(Athlete atl){
        if (!(this.listeAthletes.contains(atl))){
            this.listeAthletes.add(atl);
        }
    }

    /**
     * Retire une équipe de la liste.
     *
     * @param uneEquipe L'équipe à retirer.
     */
    public void retirerAthlete(Athlete athlete) {
        this.listeAthletes.remove(athlete);
    }

    /**
     * Retire une équipe de la liste en spécifiant ses attributs.
     *
     * @param nomEquipe    Le nom de l'équipe.
     * @param listeAthletes La liste des athlètes de l'équipe.
     * @param nbVictoire   Le nombre de victoires de l'équipe.
     */
    public void retirerAthleteByNom(String nom, String prenom) {
        for (Athlete atl : this.listeAthletes){
            if (atl.getNom().equals(nom) && atl.getPrenom().equals(prenom)){
                this.listeAthletes.remove(atl);
            }
        }
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
     * Retourne la liste des équipes du pays.
     *
     * @return La liste des équipes.
     */
    public List<Athlete> getListeAthlete() {
        return listeAthletes;
    }

    /**
     * Modifie la liste des équipes du pays.
     *
     * @param listeAthletes La nouvelle liste des équipes.
     */
    public void setListeAthletes(List<Athlete> listeAthletes) {
        this.listeAthletes = listeAthletes;
    }

    public void ajouteOr(){
        this.nbMedailleOr += 1;
    }

    public void ajouteArgent(){
        this.nbMedailleArgent += 1;
    }

    public void ajouteBronze(){
        this.nbMedailleBronze += 1;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pays other = (Pays) obj;
        if (nom == null) {
            if (other.nom != null)
                return false;
        } else if (!nom.equals(other.nom))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Pays [nbMedailleOr=" + nbMedailleOr + ", nbMedailleArgent=" + nbMedailleArgent + ", nbMedailleBronze="
                + nbMedailleBronze + ", nom=" + nom + ", listeAthletes=" + listeAthletes + "]";
    }
    
}