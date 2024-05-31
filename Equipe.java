import java.util.List;
import java.util.ArrayList;

public class Equipe {
    
    private List<Athlete> lesAthletes;
    private int nbVictoire;


    public Equipe() {
        this.lesAthletes = new ArrayList<>();
        this.nbVictoire = 0;

    }
    
    public Equipe(List<Athlete> listeAthletes, int victoire) {
        this.lesAthletes = listeAthletes;
        this.nbVictoire = victoire;

    }

    public void ajouterAthlete(int force, int agilite, int endurance, char sexe, String nom, String prenom, int victoire) {
        this.lesAthletes.add(new Athlete(force, agilite, endurance, sexe, nom, prenom, victoire));
    }

    public void ajouterAthlete(Athlete athlete) {
        this.lesAthletes.add(athlete);
    }

    public void retirerAthlete(Athlete athlete) {
        this.lesAthletes.remove(athlete);
    }

    public List<Athlete> getLesAthletes() {
        return lesAthletes;
    }

    public void setLesAthletes(List<Athlete> lesAthletes) {
        this.lesAthletes = lesAthletes;
    }

    public int getNbVictoire() {
        return nbVictoire;
    }

    public void setNbVictoire(int nbVictoire) {
        this.nbVictoire = nbVictoire;
    }

    @Override
    public boolean equals (Object o) {
        if (o == null) {
            return false;
        }

        if (o == this) {
            return true;
        }

        if (!(o instanceof Equipe)) {
            return false;
        }


        Equipe autreEquipe = (Equipe) o;


        if (autreEquipe.lesAthletes.size() != this.lesAthletes.size()) {
            return false;
        }

        for (Athlete athlete : lesAthletes) {
            for (Athlete a : autreEquipe.lesAthletes) {
                if (!(athlete.equals(a))) {
                    return false;
                }
            }
            return false;
        }
        
        return autreEquipe.nbVictoire == this.nbVictoire;
        

    }
}
