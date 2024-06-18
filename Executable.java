import java.util.ArrayList;
import java.util.List;

public class Executable {
    public static void main(String[] args) {

        // Création des Jeux Olympiques
        JeuxOlympiques jeuxOlympiques = new JeuxOlympiques("2024-07-26", "2024-08-11");

        // Création d'une liste initiale d'athlètes
        List<Athlete> athletesFrance = new ArrayList<>();
        athletesFrance.add(new Athlete(80, 85, 90, 'M', "Doré", "Benjamin", 10));
        athletesFrance.add(new Athlete(75, 80, 85, 'F', "Devers--Doré", "Lucas", 8));

        List<Athlete> athletesUSA = new ArrayList<>();
        athletesUSA.add(new Athlete(85, 90, 95, 'M', "Brown", "James", 15));
        athletesUSA.add(new Athlete(78, 83, 88, 'F', "Williams", "Sara", 12));

        List<Athlete> athletesItalie = new ArrayList<>();
        athletesFrance.add(new Athlete(80, 85, 90, 'M', "Mussolini", "Venito", 10));

        // Création de pays avec des médailles et des athlètes
        Pays france = new Pays(5, 3, 2, "France", athletesFrance);
        Pays usa = new Pays(7, 5, 6, "USA", athletesUSA);
        Pays italie = new Pays(7, 5, 6, "USA", athletesItalie);

        // Ajout des pays aux Jeux Olympiques
        jeuxOlympiques.ajoutePays(france);
        jeuxOlympiques.ajoutePays(usa);
        jeuxOlympiques.ajoutePays(italie);

        // Affichage des informations sur les Jeux Olympiques
        System.out.println("Jeux Olympiques de " + jeuxOlympiques.getDateDeDebut() + " à " + jeuxOlympiques.getDateDeFin());
        System.out.println("Pays participants: ");
        for (Pays pays : jeuxOlympiques.getListePays()) {
            System.out.println("- " + pays.getNom() + ": Or=" + pays.getNbMedailleOr() + ", Argent=" + pays.getNbMedailleArgent() + ", Bronze=" + pays.getNbMedailleBronze());
            System.out.println("  Athlètes: " + pays.getListeAthletes());
        }

        // Ajout d'un nouveau pays
        jeuxOlympiques.ajoutePays("Canada");
        System.out.println("Pays après ajout de Canada:");
        for (Pays pays : jeuxOlympiques.getListePays()) {
            System.out.println("- " + pays.getNom());
        }

        // Retrait d'un pays
        jeuxOlympiques.retierPays(italie);
        System.out.println("Pays après retrait de Canada:");
        for (Pays pays : jeuxOlympiques.getListePays()) {
            System.out.println("- " + pays.getNom());
        }

        // Création de quelques équipes
        Equipe equipeFrance = new Equipe();
        equipeFrance.ajouterAthlete(80, 70, 90, 'M', "Doré", "Benjamin", 5);
        equipeFrance.ajouterAthlete(75, 80, 85, 'F', "Devers--Doré", "Lucas", 8);
        
        Equipe equipeUSA = new Equipe();
        equipeUSA.ajouterAthlete(85, 90, 95, 'M', "Brown", "James", 15);
        equipeUSA.ajouterAthlete(85, 90, 95, 'M', "Williams", "Sara", 15);
        
        // Création d'un sport
        Athletisme sprint = new Athletisme(100, "Sprint 100m", 4, 10, 100, 500, false);
        Athletisme haies = new Athletisme(110, "Course de haies 110m", 4, 10, 100, 500, true);

        // Participation des équipes aux épreuves
        Epreuve epreuve1 = new Epreuve("Sprint 100m", 'M', sprint);
        epreuve1.participer(equipeFrance, 1);
        epreuve1.participer(equipeUSA, 2);

        Epreuve epreuve2 = new Epreuve("Course de haies 110m", 'F', haies);
        epreuve2.participer(equipeFrance, 2, 13.5);
        epreuve2.participer(equipeUSA, 1, 13.2);

        // Affichage des résultats
        //System.out.println("Résultats des Jeux Olympiques " + jeuxOlympiques.getDateDeDebut() + " - " + jeuxOlympiques.getDateDeFin());
        //System.out.println("---------------------------------------------");
 
        //for (Pays pays : jeuxOlympiques.getListePays()) {
            //System.out.println("Pays : " + pays.getNom());
            //for (Equipe equipe : pays.getListeEquipe()) {
                //System.out.println("\tEquipe : Victoires - " + equipe.getNbVictoire());
                //System.out.println("\tAthlètes : ");
                //for (Athlete athlete : equipe.getLesAthletes()) {
                    //System.out.println("\t\t" + athlete.getPrenom() + " " + athlete.getNom() + " - Victoires : " + athlete.getNbVictoire());
                //}
            //}
            //System.out.println("---------------------------------------------");
         //}
    }

}

