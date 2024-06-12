import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestAthlete {
    
    Athlete test = new Athlete(503, 6, 7, 'F', "ezaeza", "Jezaezaeean", 0);
    Athlete jean = new Athlete(5, 6, 7, 'H', "Pierre", "Jean", 0);
    Athlete matheo = new Athlete(5, 6, 7, 'H', "AABBD", "Matheo", 0);

    @Test
    public void testParticiper() {
        assertEquals(18, jean.participer());
    }

    @Test
    public void testGetForce() {
        assertEquals(5, jean.getForce());
    }

    @Test
    public void testGetAgilite() {
        assertEquals(6, jean.getAgilite());
    }

    @Test
    public void testGetEndurance() {
        assertEquals(7, jean.getEndurance());
    }

    @Test
    public void testSetForce() {
        jean.setForce(10);
        assertEquals(10, jean.getForce());
    }

    @Test
    public void testSetAgilite() {
        jean.setAgilite(11);
        assertEquals(11, jean.getAgilite());
    }

    @Test
    public void testSetEndurance() {
        jean.setEndurance(12);
        assertEquals(12, jean.getEndurance());
    }

    @Test
    public void testGetSexe() {
        assertEquals('H', jean.getSexe());
    }

    @Test
    public void testSetSexe() {
        test.setSexe('H');
        assertEquals('H', test.getSexe());
    }

    @Test
    public void getNom() {
        assertEquals("Pierre", jean.getNom());
    }

    @Test
    public void setNom() {
        jean.setNom("DD");
        assertEquals("DD", jean.getNom());
    }

    @Test
    public void getPrenom() {
        assertEquals("Jean", jean.getPrenom());
    }

    @Test
    public void setPrenom() {
        jean.setNom("Lucas");
        assertEquals("Lucas", jean.getNom());
    }

    @Test
    public void getNbVictoire() {
        assertEquals(0, jean.getNbVictoire());
    }

    @Test
    public void setNbVictoire() {
        jean.setNbVictoire(5);
        assertEquals(5, jean.getNbVictoire());
    }

    @Test
    public void testEquals() {
        Athlete jean = new Athlete(5, 6, 7, 'H', "Pierre", "Jean", 0);
        Athlete test = new Athlete(5, 6, 7, 'H', "Pierre", "Jean", 0);
        assertEquals(true, jean.equals(test));
    }
}
