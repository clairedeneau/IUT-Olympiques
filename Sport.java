/**
 * Classe abstraite représentant un sport.
 * Cette classe fournit les attributs de base et les méthodes pour les sports généraux.
 */
public abstract class Sport {

    protected String nom;
    protected int tailleEquipe;
    protected int placeSpectateur;
    protected String nom;

    /**
     * Constructeur de la classe Sport.
     *
     * @param tailleEquipe    le nombre de joueurs par équipe
     * @param placeSpectateur le nombre de places disponibles pour les spectateurs
     */
    public Sport(String nom, int tailleEquipe, int placeSpectateur) {
        this.nom = nom;
        this.tailleEquipe = tailleEquipe;
        this.placeSpectateur = placeSpectateur;
    }


    public Sport(String nom) {
        this.nom = nom;
        this.tailleEquipe = 0;
        this.placeSpectateur = 0;
    }



    /**
     * Obtient la taille de l'équipe.
     *
     * @return la taille de l'équipe
     */
    public int getTailleEquipe() {
        return tailleEquipe;
    }

    /**
     * Définit la taille de l'équipe.
     *
     * @param tailleEquipe la nouvelle taille de l'équipe
     */
    public void setTailleEquipe(int tailleEquipe) {
        this.tailleEquipe = tailleEquipe;
    }

    /**
     * Obtient le nombre de places pour les spectateurs.
     *
     * @return le nombre de places pour les spectateurs
     */
    public int getPlaceSpectateur() {
        return placeSpectateur;
    }

    /**
     * Définit le nombre de places pour les spectateurs.
     *
     * @param placeSpectateur le nouveau nombre de places pour les spectateurs
     */
    public void setPlaceSpectateur(int placeSpectateur) {
        this.placeSpectateur = placeSpectateur;
    }

    @Override
    public String toString() {
        return this.nom;
    }

    
}