public abstract class Sport {

    protected int distance;
    protected String nom;
    protected int tailleEquipe;
    protected int largeurTerrain;
    protected int longueurTerrain;
    protected int placeSpectateur;

    public Sport(int distance, String nom, int tailleEquipe, int largeurTerrain, int longueurTerrain, int placeSpectateur){
        
        this.distance = distance;
        this.nom = nom;
        this.tailleEquipe = tailleEquipe;
        this.largeurTerrain = largeurTerrain;
        this.longueurTerrain = longueurTerrain;
        this.placeSpectateur = placeSpectateur;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTailleEquipe() {
        return tailleEquipe;
    }

    public void setTailleEquipe(int tailleEquipe) {
        this.tailleEquipe = tailleEquipe;
    }

    public int getLargeurTerrain() {
        return largeurTerrain;
    }

    public void setLargeurTerrain(int largeurTerrain) {
        this.largeurTerrain = largeurTerrain;
    }

    public int getLongueurTerrain() {
        return longueurTerrain;
    }

    public void setLongueurTerrain(int longueurTerrain) {
        this.longueurTerrain = longueurTerrain;
    }

    public int getPlaceSpectateur() {
        return placeSpectateur;
    }

    public void setPlaceSpectateur(int placeSpectateur) {
        this.placeSpectateur = placeSpectateur;
    }
}