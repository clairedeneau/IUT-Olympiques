public class Athletisme extends Sport{

    // Attributs privés
    private boolean courseHaie;
    private int distance;
    private final String nom = "Athletisme";
    private final int ID = 1;
    
    /**
     * Constructeur de la classe Athletisme.
     * 
     * @param distance la distance de la course d'athlétisme
     * @param nom le nom de la discipline (par défaut "Athlétisme")
     * @param tailleEquipe la taille de l'équipe participant à la discipline
     * @param placeSpectateur le nombre de places pour les spectateurs
     * @param courseHaie indique si la course comporte des haies
     */
    public Athletisme(int distance, int tailleEquipe, int placeSpectateur, boolean courseHaie){
        super(tailleEquipe, placeSpectateur);
        this.distance = distance;
        this.courseHaie = courseHaie;
    }

    /**
     * Vérifie si la course comporte des haies.
     * 
     * @return true si la course comporte des haies, sinon false
     */
    public boolean isCourseHaie() {
        return courseHaie;
    }

    /**
     * Définit si la course comporte des haies.
     * 
     * @param courseHaie true pour indiquer que la course comporte des haies, sinon false
     */
    public void setCourseHaie(boolean courseHaie) {
        this.courseHaie = courseHaie;
    }

    /**
     * Obtient la distance de la course d'athlétisme.
     * 
     * @return la distance de la course
     */
    public int getDistance() {
        return distance;
    }

    /**
     * Définit la distance de la course d'athlétisme.
     * 
     * @param distance la nouvelle distance de la course
     */
    public void setDistance(int distance) {
        this.distance = distance;
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