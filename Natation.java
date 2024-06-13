public class Natation extends Sport{

    private int profondeurPiscine;
    
    public Natation(int distance, String nom, int tailleEquipe, int largeurTerrain, int longueurTerrain, int placeSpectateur, int profondeurPiscine){
        super(distance, nom, tailleEquipe, largeurTerrain, longueurTerrain, placeSpectateur);
        this.profondeurPiscine = profondeurPiscine;
    }

    public int getProfondeurPiscine() {
        return profondeurPiscine;
    }

    public void setProfondeurPiscine(int profondeurPiscine) {
        this.profondeurPiscine = profondeurPiscine;
    }
}

