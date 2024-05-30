public class Athletisme extends Sport{

    private boolean courseHaie;
    
    public Athletisme(int distance, String nom, int tailleEquipe, int largeurTerrain, int longueurTerrain, int placeSpectateur, boolean courseHaie){
        super(distance, nom, tailleEquipe, largeurTerrain, longueurTerrain, placeSpectateur);
        this.courseHaie = courseHaie;
    }

    public boolean isCourseHaie() {
        return courseHaie;
    }

    public void setCourseHaie(boolean courseHaie) {
        this.courseHaie = courseHaie;
    }
}