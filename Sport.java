import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class Sport {

    protected String sexe;
    protected int distance;
    protected String nom;
    protected int tailleEquipe;
    protected HashMap<Integer, Athlete> classement;
    protected int largeurTerrain;
    protected int longueurTerrain;
    protected int placeSpectateur;

    public Sport(String sexe, int distance, String nom, int tailleEquipe, HashMap<Integer, Athlete> classement, int largeurTerrain, int longueurTerrain, int placeSpectateur){
        this.sexe = sexe;
        this.distance = distance;
        this.nom = nom;
        this.tailleEquipe = tailleEquipe;
        this.classement = new HashMap<Integer, Athlete>();
        this.largeurTerrain = largeurTerrain;
        this.longueurTerrain = longueurTerrain;
        this.placeSpectateur = placeSpectateur;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
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