public class Natation extends Sport{

    // Attributs privés
    private int profondeurPiscine;
    private String nom;
    private int distance;
    
    /**
     * Constructeur de la classe Natation.
     * 
     * @param distance la distance de la course de natation
     * @param nom le nom de la discipline (par défaut "Natation")
     * @param tailleEquipe la taille de l'équipe participant à la discipline
     * @param placeSpectateur le nombre de places pour les spectateurs
     * @param profondeurPiscine la profondeur de la piscine utilisée
     */
    public Natation(int distance, String nom, int tailleEquipe, int placeSpectateur, int profondeurPiscine){
        super(tailleEquipe, placeSpectateur);
        this.distance = distance;
        this.nom = "Natation";
        this.profondeurPiscine = profondeurPiscine;
    }

    /**
     * Obtient la profondeur de la piscine.
     * 
     * @return la profondeur de la piscine
     */
    public int getProfondeurPiscine() {
        return profondeurPiscine;
    }

    /**
     * Définit la profondeur de la piscine.
     * 
     * @param profondeurPiscine la nouvelle profondeur de la piscine
     */
    public void setProfondeurPiscine(int profondeurPiscine) {
        this.profondeurPiscine = profondeurPiscine;
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

    /**
     * Obtient la distance de la course.
     * 
     * @return la distance de la course
     */
    public int getDistance() {
        return distance;
    }

    /**
     * Définit la distance de la course.
     * 
     * @param distance la nouvelle distance de la course
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }

}