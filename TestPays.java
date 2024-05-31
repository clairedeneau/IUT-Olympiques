import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPays {
    
    Pays france = new Pays("France");



    @Test
    public void testGetNbOr(){
        assertEquals(0, france.getNbMedailleOr());
    }

    @Test
    public void testGetNbArgent(){        
        assertEquals(0, france.getNbMedailleArgent());
    }

    @Test
    public void testGetNbBronze(){
        assertEquals(0, france.getNbMedailleBronze());
    }

    @Test
    public void testSetNbMedailleOr() {
        france.setNbMedailleOr(5);
        assertEquals(5, france.getNbMedailleOr());
    }
    
    @Test
    public void testSetNbMedailleArgent() {
        france.setNbMedailleArgent(5);
        assertEquals(5, france.getNbMedailleArgent());
    }

    @Test
    public void testSetNbMedailleBronze() {
        france.setNbMedailleBronze(5);
        assertEquals(5, france.getNbMedailleBronze());
    }

    @Test
    public void testGetListeAthletes() {
        List<Athlete> test = new ArrayList<>();
        assertEquals(test, france.getListeAthletes());
    }

    @Test
    public void testSetListeAthletes() {
        List<Athlete> lesAthletes = new ArrayList<>();
        Athlete jean = new Athlete(5, 6, 7, 'H', "Pierre", "Jean", 0);
        Athlete matheo = new Athlete(5, 6, 7, 'H', "AABBD", "Matheo", 0);
        Athlete arthur = new Athlete(5, 6, 7, 'H', "ezaeaezae", "Arthur", 0);
        lesAthletes.add(jean);
        lesAthletes.add(matheo);
        lesAthletes.add(arthur);
        france.setListeAthletes(lesAthletes);

        assertEquals(lesAthletes, france.getListeAthletes());
    }

    @Test
    public void testAjouteAthlete() {
        Pays luxembourg = new Pays("Luxembourg");
        Athlete jean = new Athlete(5, 6, 7, 'H', "Pierre", "Jean", 0);
        luxembourg.ajouterAthlete(jean);
        luxembourg.ajouterAthlete(51, 56, 47, 'H', "Pizaeazeerre", "Lcaz", 5);
        Athlete test2 = new Athlete(51, 56, 47, 'H', "Pizaeazeerre", "Lcaz", 5);
        List<Athlete> test = new ArrayList<>();
        test.add(jean);
        test.add(test2);
        assertEquals(test, luxembourg.getListeAthletes());
    }

    @Test
    public void testRetirerAthlete() {
        Pays luxembourg = new Pays("Luxembourg");
        Athlete jean = new Athlete(5, 6, 7, 'H', "Pierre", "Jean", 0);
        luxembourg.ajouterAthlete(jean);
        luxembourg.ajouterAthlete(51, 56, 47, 'H', "Pizaeazeerre", "Lcaz", 5);
        luxembourg.retirerAthlete(jean);
        luxembourg.retirerAthlete(51, 56, 47, 'H', "Pizaeazeerre", "Lcaz", 5);
        List<Athlete> test = new ArrayList<>();

        assertEquals(test, luxembourg.getListeAthletes());
    }

    @Test
    public void testGetNom() {
        assertEquals("France", france.getNom());
    }

    @Test
    public void testSetNom() {
        france.setNom("Fraaaaaaaaance");
        assertEquals("Fraaaaaaaaance", france.getNom());
    }

}