import java.util.HashMap;

public abstract class Sport {

    protected String sexe;
    protected int distance;
    protected String nom;
    protected int tailleEquipe;
    protected HashMap classement;

    public String faireRegle() {

    }

    public Equipe match(Equipe autreEquipe) {

    }
    
    public Athlète match(Athlète autreEquipe) {

    }

    public int getNbVictoire() {

    }

    public double getClassement(Athlète participant) {
        
    }
}