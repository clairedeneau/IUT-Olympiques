public class VolleyBall extends Sport{

    // Attributs privés
    private boolean sableTerrain;
    private boolean salleTerrain;
    private int largeurTerrain;
    private int longueurTerrain;
    private final String nom = "Volley-ball";
    private final int ID = 5;

    /**
     * Constructeur de la classe VolleyBall.
     * 
     * @param nom le nom de la discipline (par défaut "Volley-Ball")
     * @param tailleEquipe la taille de l'équipe participant à la discipline
     * @param largeurTerrain la largeur du terrain de volley-ball
     * @param longueurTerrain la longueur du terrain de volley-ball
     * @param placeSpectateur le nombre de places pour les spectateurs
     * @param sableTerrain indique si le terrain est en sable
     * @param salleTerrain indique si le terrain est en salle
     */
    public VolleyBall(int tailleEquipe, int largeurTerrain, int longueurTerrain, int placeSpectateur, boolean sableTerrain, boolean salleTerrain){
        super(tailleEquipe, placeSpectateur);
        this.sableTerrain = sableTerrain;
        this.salleTerrain = salleTerrain;
        this.largeurTerrain = largeurTerrain;
        this.longueurTerrain = longueurTerrain;

    }

    /**
     * Vérifie si le terrain est en sable.
     * 
     * @return true si le terrain est en sable, sinon false
     */
    public boolean isSableTerrain() {
        return sableTerrain;
    }

    /**
     * Définit si le terrain est en sable.
     * 
     * @param sableTerrain true pour indiquer que le terrain est en sable, sinon false
     */
    public void setSableTerrain(boolean sableTerrain) {
        this.sableTerrain = sableTerrain;
    }

    /**
     * Vérifie si le terrain est en salle.
     * 
     * @return true si le terrain est en salle, sinon false
     */
    public boolean isSalleTerrain() {
        return salleTerrain;
    }

    /**
     * Définit si le terrain est en salle.
     * 
     * @param salleTerrain true pour indiquer que le terrain est en salle, sinon false
     */
    public void setSalleTerrain(boolean salleTerrain) {
        this.salleTerrain = salleTerrain;
    }

    /**
     * Obtient la largeur du terrain de volley-ball.
     * 
     * @return la largeur du terrain
     */
    public int getLargeurTerrain() {
        return largeurTerrain;
    }

    /**
     * Définit la largeur du terrain de volley-ball.
     * 
     * @param largeurTerrain la nouvelle largeur du terrain
     */
    public void setLargeurTerrain(int largeurTerrain) {
        this.largeurTerrain = largeurTerrain;
    }

    /**
     * Obtient la longueur du terrain de volley-ball.
     * 
     * @return la longueur du terrain
     */
    public int getLongueurTerrain() {
        return longueurTerrain;
    }

    /**
     * Définit la longueur du terrain de volley-ball.
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

    public int getID() {
        return ID;
    }

    
}