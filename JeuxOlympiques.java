import java.util.ArrayList;
import java.util.List;

public class JeuxOlympiques {
    
    private String dateDeDebut;
    private String dateDeFin;
    private List<Pays> listePays;

    /**
     * Constructeur de la classe JeuxOlympiques avec les dates de début et de fin spécifiées.
     * Initialise une liste vide de pays participants.
     *
     * @param debut La date de début des jeux olympiques.
     * @param fin   La date de fin des jeux olympiques.
     */
    public JeuxOlympiques(String debut, String fin) {
        this.dateDeDebut = debut;
        this.dateDeFin = fin;
        this.listePays = new ArrayList<>();
    }

    /**
     * Constructeur de la classe JeuxOlympiques avec les dates et une liste de pays spécifiés.
     *
     * @param debut    La date de début des jeux olympiques.
     * @param fin      La date de fin des jeux olympiques.
     * @param lesPays  La liste des pays participants.
     */
    public JeuxOlympiques(String debut, String fin, List<Pays> lesPays) {
        this.dateDeDebut = debut;
        this.dateDeFin = fin;
        this.listePays = lesPays;
    }

    /**
     * Retourne la date de début des jeux olympiques.
     *
     * @return La date de début des jeux olympiques.
     */
    public String getDateDeDebut() {
        return dateDeDebut;
    }

    /**
     * Modifie la date de début des jeux olympiques.
     *
     * @param dateDeDebut La nouvelle date de début des jeux olympiques.
     */
    public void setDateDeDebut(String dateDeDebut) {
        this.dateDeDebut = dateDeDebut;
    }

    /**
     * Retourne la date de fin des jeux olympiques.
     *
     * @return La date de fin des jeux olympiques.
     */
    public String getDateDeFin() {
        return dateDeFin;
    }

    /**
     * Modifie la date de fin des jeux olympiques.
     *
     * @param dateDeFin La nouvelle date de fin des jeux olympiques.
     */
    public void setDateDeFin(String dateDeFin) {
        this.dateDeFin = dateDeFin;
    }

    /**
     * Retourne la liste des pays participants aux jeux olympiques.
     *
     * @return La liste des pays participants.
     */
    public List<Pays> getListePays() {
        return listePays;
    }

    /**
     * Modifie la liste des pays participants aux jeux olympiques.
     *
     * @param listePays La nouvelle liste des pays participants.
     */
    public void setListePays(List<Pays> listePays) {
        this.listePays = listePays;
    }

    /**
     * Ajoute un pays à la liste des pays participants.
     *
     * @param unPays Le pays à ajouter.
     */
    public void ajoutePays(Pays unPays) {
        this.listePays.add(unPays);
    }

    /**
     * Ajoute un pays à la liste des pays participants avec les attributs spécifiés.
     *
     * @param nbOr       Le nombre de médailles d'or du pays.
     * @param nbArgent   Le nombre de médailles d'argent du pays.
     * @param nbBronze   Le nombre de médailles de bronze du pays.
     * @param nom        Le nom du pays.
     * @param lesAthletes La liste des athlètes du pays.
     */
    public void ajoutePays(int nbOr, int nbArgent, int nbBronze, String nom, List<Athlete> lesAthletes) {
        this.listePays.add(new Pays(nbOr, nbArgent, nbBronze, nom, lesAthletes));
    }

    /**
     * Ajoute un pays à la liste des pays participants avec le nom spécifié.
     * Initialise un pays avec zéro médaille et une liste vide d'athlètes.
     *
     * @param nom Le nom du pays.
     */
    public void ajoutePays(String nom) {
        this.listePays.add(new Pays(nom));
    }

    /**
     * Retire un pays de la liste des pays participants.
     *
     * @param pays Le pays à retirer.
     */
    public void retierPays(Pays pays) {
        this.listePays.remove(pays);
    }
}