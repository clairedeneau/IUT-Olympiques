public class Athlete {
    
    private int force;
    private int agilite;
    private int endurance;
    private String sexe;
    private String nom;
    private String prenom;
    private int nbVictoire;
    
    public Athlete(int force, int agilite, int endurance, char sexe, String nom, String prenom, int nbVictoire) {
        this.force = force;
        this.agilite = agilite;
        this.endurance = endurance;
        this.sexe = sexe;
        this.nom = nom;
        this.prenom = prenom;
        this.nbVictoire = nbVictoire;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNbVictoire() {
        return nbVictoire;
    }

    public void setNbVictoire(int nbVictoire) {
        this.nbVictoire = nbVictoire;
    }

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
