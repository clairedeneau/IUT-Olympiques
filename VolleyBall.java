public class VolleyBall extends Sport{

    private boolean sableTerrain;
    private boolean salleTerrain;

    public VolleyBall(int distance, String nom, int tailleEquipe, int largeurTerrain, int longueurTerrain, int placeSpectateur, boolean sableTerrain, boolean salleTerrain){
        super(distance, nom, tailleEquipe, largeurTerrain, longueurTerrain, placeSpectateur);
        this.sableTerrain = sableTerrain;
        this.salleTerrain = salleTerrain;
    }

    public boolean isSableTerrain() {
        return sableTerrain;
    }

    public void setSableTerrain(boolean sableTerrain) {
        this.sableTerrain = sableTerrain;
    }

    public boolean isSalleTerrain() {
        return salleTerrain;
    }

    public void setSalleTerrain(boolean salleTerrain) {
        this.salleTerrain = salleTerrain;
    }
    
}
