public class Athlete implements Util {

    private int force;
    private int agilite;
    private int endurance;
    private char sexe;
    private String nom;
    private String prenom;
    private int nbVictoire;

    /**
     * Constructeur de la classe Athlete.
     *
     * @param force      La force de l'athlète.
     * @param agilite    L'agilité de l'athlète.
     * @param endurance  L'endurance de l'athlète.
     * @param sexe       Le sexe de l'athlète.
     * @param nom        Le nom de l'athlète.
     * @param prenom     Le prénom de l'athlète.
     * @param nbVictoire Le nombre de victoires de l'athlète.
     */
    public Athlete(int force, int agilite, int endurance, char sexe, String nom, String prenom, int nbVictoire) {
        this.force = force;
        this.agilite = agilite;
        this.endurance = endurance;
        this.sexe = sexe;
        this.nom = nom;
        this.prenom = prenom;
        this.nbVictoire = nbVictoire;
    }

    /**
     * Retourne la force de l'athlète.
     *
     * @return La force de l'athlète.
     */
    public int getForce() {
        return force;
    }

    /**
     * Modifie la force de l'athlète.
     *
     * @param force La nouvelle force de l'athlète.
     */
    public void setForce(int force) {
        this.force = force;
    }

    /**
     * Retourne l'agilité de l'athlète.
     *
     * @return L'agilité de l'athlète.
     */
    public int getAgilite() {
        return agilite;
    }

    /**
     * Modifie l'agilité de l'athlète.
     *
     * @param agilite La nouvelle agilité de l'athlète.
     */
    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    /**
     * Retourne l'endurance de l'athlète.
     *
     * @return L'endurance de l'athlète.
     */
    public int getEndurance() {
        return endurance;
    }

    /**
     * Modifie l'endurance de l'athlète.
     *
     * @param endurance La nouvelle endurance de l'athlète.
     */
    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    /**
     * Retourne le sexe de l'athlète.
     *
     * @return Le sexe de l'athlète.
     */
    public char getSexe() {
        return sexe;
    }

    /**
     * Modifie le sexe de l'athlète.
     *
     * @param sexe Le nouveau sexe de l'athlète.
     */
    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    /**
     * Retourne le nom de l'athlète.
     *
     * @return Le nom de l'athlète.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Modifie le nom de l'athlète.
     *
     * @param nom Le nouveau nom de l'athlète.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne le prénom de l'athlète.
     *
     * @return Le prénom de l'athlète.
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Modifie le prénom de l'athlète.
     *
     * @param prenom Le nouveau prénom de l'athlète.
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Retourne le nombre de victoires de l'athlète.
     *
     * @return Le nombre de victoires de l'athlète.
     */
    @Override
    public int getNbVictoire() {
        return nbVictoire;
    }

    /**
     * Modifie le nombre de victoires de l'athlète.
     *
     * @param nbVictoire Le nouveau nombre de victoires de l'athlète.
     */
    @Override
    public void setNbVictoire(int nbVictoire) {
        this.nbVictoire = nbVictoire;
    }

    /**
     * Participe à une compétition et retourne une note basée sur les attributs de l'athlète.
     *
     * @return Une note représentant la performance de l'athlète.
     */
    @Override
    public int participer() {
        return this.agilite + this.endurance + this.force;
    }

    /**
     * Vérifie si l'objet donné est égal à cet athlète.
     *
     * @param o L'objet à comparer avec cet athlète.
     * @return true si l'objet donné est égal à cet athlète, false sinon.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof Athlete)) {
            return false;
        }
        Athlete autreAthlete = (Athlete) o;
        return this.force == autreAthlete.force || this.agilite == autreAthlete.agilite || this.endurance == autreAthlete.endurance ||
                this.sexe == autreAthlete.sexe || this.nom.equals(autreAthlete.nom) || this.prenom.equals(autreAthlete.prenom) || this.nbVictoire == autreAthlete.nbVictoire;
    }
}