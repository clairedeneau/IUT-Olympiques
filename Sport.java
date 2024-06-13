/**
 * Classe abstraite représentant un sport.
 * Cette classe fournit les attributs de base et les méthodes pour les sports généraux.
 */
public abstract class Sport {

    protected int distance;
    protected String nom;
    protected int tailleEquipe;
    protected int largeurTerrain;
    protected int longueurTerrain;
    protected int placeSpectateur;

    /**
     * Constructeur de la classe Sport.
     *
     * @param distance        la distance associée au sport (par exemple, longueur de la course)
     * @param nom             le nom du sport
     * @param tailleEquipe    le nombre de joueurs par équipe
     * @param largeurTerrain  la largeur du terrain
     * @param longueurTerrain la longueur du terrain
     * @param placeSpectateur le nombre de places disponibles pour les spectateurs
     */
    public Sport(int distance, String nom, int tailleEquipe, int largeurTerrain, int longueurTerrain, int placeSpectateur) {
        this.distance = distance;
        this.nom = nom;
        this.tailleEquipe = tailleEquipe;
        this.largeurTerrain = largeurTerrain;
        this.longueurTerrain = longueurTerrain;
        this.placeSpectateur = placeSpectateur;
    }

    /**
     * Obtient la distance associée au sport.
     *
     * @return la distance du sport
     */
    public int getDistance() {
        return distance;
    }

    /**
     * Définit la distance associée au sport.
     *
     * @param distance la nouvelle distance du sport
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }

    /**
     * Obtient le nom du sport.
     *
     * @return le nom du sport
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom du sport.
     *
     * @param nom le nouveau nom du sport
     */
    public void setNom(String nom) {
        this.nom = nom;
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
     * Obtient la largeur du terrain.
     *
     * @return la largeur du terrain
     */
    public int getLargeurTerrain() {
        return largeurTerrain;
    }

    /**
     * Définit la largeur du terrain.
     *
     * @param largeurTerrain la nouvelle largeur du terrain
     */
    public void setLargeurTerrain(int largeurTerrain) {
        this.largeurTerrain = largeurTerrain;
    }

    /**
     * Obtient la longueur du terrain.
     *
     * @return la longueur du terrain
     */
    public int getLongueurTerrain() {
        return longueurTerrain;
    }

    /**
     * Définit la longueur du terrain.
     *
     * @param longueurTerrain la nouvelle longueur du terrain
     */
    public void setLongueurTerrain(int longueurTerrain) {
        this.longueurTerrain = longueurTerrain;
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
}