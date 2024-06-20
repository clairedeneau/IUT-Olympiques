public class Escrime extends Sport{
    
    // Attributs privés
    private boolean fleuret;
    private boolean epee;
    private boolean sabre;
    private String nom;

    /**
     * Constructeur de la classe Escrime.
     * 
     * @param nom le nom de la discipline (par défaut "Escrime")
     * @param tailleEquipe la taille de l'équipe participant à la discipline
     * @param placeSpectateur le nombre de places pour les spectateurs
     * @param fleuret indique si le fleuret est utilisé
     * @param epee indique si l'épée est utilisée
     * @param sabre indique si le sabre est utilisé
     */
    public Escrime(String nom, int tailleEquipe, int placeSpectateur, boolean fleuret, boolean epee, boolean sabre){
        super(nom, tailleEquipe, placeSpectateur);
        this.fleuret = fleuret;
        this.epee = epee;
        this.sabre = sabre;
        this.nom = "Escrime";
    }

    /**
     * Vérifie si le fleuret est utilisé.
     * 
     * @return true si le fleuret est utilisé, sinon false
     */
    public boolean isFleuret() {
        return fleuret;
    }

    /**
     * Définit l'utilisation du fleuret.
     * 
     * @param fleuret true pour utiliser le fleuret, sinon false
     */
    public void setFleuret(boolean fleuret) {
        this.fleuret = fleuret;
    }

    /**
     * Vérifie si l'épée est utilisée.
     * 
     * @return true si l'épée est utilisée, sinon false
     */
    public boolean isEpee() {
        return epee;
    }

    /**
     * Définit l'utilisation de l'épée.
     * 
     * @param epee true pour utiliser l'épée, sinon false
     */
    public void setEpee(boolean epee) {
        this.epee = epee;
    }

    /**
     * Vérifie si le sabre est utilisé.
     * 
     * @return true si le sabre est utilisé, sinon false
     */
    public boolean isSabre() {
        return sabre;
    }

    /**
     * Définit l'utilisation du sabre.
     * 
     * @param sabre true pour utiliser le sabre, sinon false
     */
    public void setSabre(boolean sabre) {
        this.sabre = sabre;
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