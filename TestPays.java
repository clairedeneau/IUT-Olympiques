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
    public void testGetListeEquipe() {
        List<Equipe> test = new ArrayList<>();
        assertEquals(test, france.getListeEquipe());
    }

    @Test
    public void testSetListeEquipe() {
        List<Equipe> lesAthletes = new ArrayList<>();
        Athlete jean = new Athlete(5, 6, 7, 'H', "Pierre", "Jean", 0);
        Athlete matheo = new Athlete(5, 6, 7, 'H', "AABBD", "Matheo", 0);
        Athlete arthur = new Athlete(5, 6, 7, 'H', "ezaeaezae", "Arthur", 0);
        Equipe test = new ArrayList<>();
        test.add(jean);
        test.add(matheo);
        test.add(arthur);
        lesAthletes.add(test);
        france.setListeAthletes(lesAthletes);

        assertEquals(lesAthletes, france.getListeEquipe());
    }

    @Test
    public void testAjouteEquipe() {
        Pays test = new Pays("Test");
        List<Equipe> res = new ArrayList<>();
        List<Athlete> lesAthletes = new ArrayList<>();
        res.add(new Equipe("lucas"));
        test.ajouterEquipe("lucas");

        test.ajouterEquipe("lucas", lesAthletes, 0);
        res.add(new Equipe("lucas", lesAthletes, 0));

        assertEquals(res, test.getListeEquipe());
    }

    @Test
    public void testRetirerAthlete() {
        Pays luxembourg = new Pays("Luxembourg");
        List<Equipe> atl = new ArrayList<>();
        luxembourg.ajouterEquipe("lucas");
        luxembourg.retirerEquipe("lucas");

        luxembourg.ajouterEquipe("lucas", atl, 0);
        luxembourg.retirerEquipe(new Equipe("lucas", atl, 0));

        assertEquals(atl, luxembourg.getListeEquipe());
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