public class Escrime extends Sport{
    
    private boolean fleuret;
    private boolean epee;
    private boolean sabre;

    public Escrime(int distance, String nom, int tailleEquipe, int largeurTerrain, int longueurTerrain, int placeSpectateur, boolean fleuret, boolean epee, boolean sabre){
        super(distance, nom, tailleEquipe, largeurTerrain, longueurTerrain, placeSpectateur);
        this.fleuret = fleuret;
        this.epee = epee;
        this.sabre = sabre;
    }

    public boolean isFleuret() {
        return fleuret;
    }

    public void setFleuret(boolean fleuret) {
        this.fleuret = fleuret;
    }

    public boolean isEpee() {
        return epee;
    }

    public void setEpee(boolean epee) {
        this.epee = epee;
    }

    public boolean isSabre() {
        return sabre;
    }

    public void setSabre(boolean sabre) {
        this.sabre = sabre;
    }
}
