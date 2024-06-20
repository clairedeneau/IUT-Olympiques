public class Handball extends Sport{
    
    // Attributs privés
    private int largeurTerrain;
    private int longueurTerrain;
    private String nom;

    /**
     * Constructeur de la classe Handball.
     * 
     * @param nom le nom de la discipline (par défaut "Handball")
     * @param tailleEquipe la taille de l'équipe participant à la discipline
     * @param largeurTerrain la largeur du terrain de handball
     * @param longueurTerrain la longueur du terrain de handball
     * @param placeSpectateur le nombre de places pour les spectateurs
     */
    public Handball(String nom, int tailleEquipe, int largeurTerrain, int longueurTerrain, int placeSpectateur){
        super(nom, tailleEquipe, placeSpectateur);
        this.largeurTerrain = largeurTerrain;
        this.longueurTerrain = longueurTerrain;
        this.nom = "Handball";
    }

    /**
     * Obtient la largeur du terrain de handball.
     * 
     * @return la largeur du terrain
     */
    public int getLargeurTerrain() {
        return largeurTerrain;
    }

    /**
     * Définit la largeur du terrain de handball.
     * 
     * @param largeurTerrain la nouvelle largeur du terrain
     */
    public void setLargeurTerrain(int largeurTerrain) {
        this.largeurTerrain = largeurTerrain;
    }

    /**
     * Obtient la longueur du terrain de handball.
     * 
     * @return la longueur du terrain
     */
    public int getLongueurTerrain() {
        return longueurTerrain;
    }

    /**
     * Définit la longueur du terrain de handball.
     * 
     * @param longueurTerrain la nouvelle longueur du terrain
     */
    public void setLongueurTerrain(int longueurTerrain) {
        this.longueurTerrain = longueurTerrain;
    }

    /**
     * Obtient le nom de la discipline.
     * 
     * @return le nom de la discipline
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom de la discipline.
     * 
     * @param nom le nouveau nom de la discipline
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    
}