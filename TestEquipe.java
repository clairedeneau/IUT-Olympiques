import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestEquipe {
    
    Equipe lesGoats = new Equipe();

    @Test
    public void testParticiper() {
        Equipe g2 = new Equipe();
        Athlete jean = new Athlete(5, 6, 7, 'H', "Pierre", "Jean", 0);
        g2.ajouterAthlete(jean);
        g2.ajouterAthlete(51, 56, 47, 'H', "Pizaeazeerre", "Lcaz", 5);
        assertEquals(172, g2.participer());
    }
    
    @Test
    public void testAjouteAthlete() {
        Equipe g2 = new Equipe();
        Athlete jean = new Athlete(5, 6, 7, 'H', "Pierre", "Jean", 0);
        g2.ajouterAthlete(jean);
        g2.ajouterAthlete(51, 56, 47, 'H', "Pizaeazeerre", "Lcaz", 5);
        Athlete test2 = new Athlete(51, 56, 47, 'H', "Pizaeazeerre", "Lcaz", 5);
        List<Athlete> test = new ArrayList<>();
        test.add(jean);
        test.add(test2);
        assertEquals(test, g2.getLesAthletes());
    }

    @Test
    public void testRetirerAthlete() {
        Equipe g2 = new Equipe();
        Athlete jean = new Athlete(5, 6, 7, 'H', "Pierre", "Jean", 0);
        g2.ajouterAthlete(jean);
        g2.ajouterAthlete(51, 56, 47, 'H', "Pizaeazeerre", "Lcaz", 5);
        g2.retirerAthlete(jean);
        g2.retirerAthlete(51, 56, 47, 'H', "Pizaeazeerre", "Lcaz", 5);
        List<Athlete> test = new ArrayList<>();

        assertEquals(test, g2.getLesAthletes());
    }
    
    @Test
    public void testGetLesAthletes() {
        List<Athlete> test = new ArrayList<>();
        assertEquals(test, lesGoats.getLesAthletes());
    }

    @Test 
    public void testSetLesAthletes() {
        Equipe g2 = new Equipe();
        Athlete jean = new Athlete(5, 6, 7, 'H', "Pierre", "Jean", 0);
        Athlete test = new Athlete(51, 56, 47, 'H', "Pizaeazeerre", "Lcaz", 5);
        List<Athlete> test2 = new ArrayList<>();
        test2.add(test);
        test2.add(jean);
        g2.setLesAthletes(test2);

        assertEquals(test2, g2.getLesAthletes());
    }
    
    @Test
    public void testGetNbVictoire() {
        assertEquals(0, lesGoats.getNbVictoire());
    }

    @Test
    public void testSetNbVictoire() {
        lesGoats.setNbVictoire(5);
        assertEquals(5, lesGoats.getNbVictoire());
    }

    @Test
    public void testEquals() {
        Athlete jean = new Athlete(5, 6, 7, 'H', "Pierre", "Jean", 0);
        Athlete test = new Athlete(51, 56, 47, 'H', "Pizaeazeerre", "Lcaz", 5);

        List<Athlete> goat = new ArrayList<>();
        goat.add(jean);
        goat.add(test);

        Equipe g2 = new Equipe(goat, 5);
        Equipe Fnatic = new Equipe(goat, 5);
        System.out.println(g2.getLesAthletes());
        System.out.println(Fnatic.getLesAthletes());
        assertEquals(true, g2.equals(Fnatic));
    }
}
