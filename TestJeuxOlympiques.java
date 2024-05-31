import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestJeuxOlympiques {
 
    List<Pays> vide = new ArrayList<>();
    JeuxOlympiques jo2024 = new JeuxOlympiques("18/11/2024", "25/12/2024", vide);

    @Test
    public void testGetDebut() {
        assertEquals("18/11/2024", jo.getDateDeDebut());
    }

    @Test
    public void testGetFin() {
        assertEquals("25/12/2024", jo.getDateDeFin());
    }

    @Test
    public void testGetListePays() {
        List<Pays> test = new ArrayList<>();
        assertEquals(test, jo.getListePays());
    }

    @Test
    public void testSetListePays() {
        List<Pays> test  =  new ArrayList<>();
        Pays France = new Pays("France");
        Pays USA = new Pays("USA");
        Pays Belgique = new Pays("Belgique");
        test.add(France);
        test.add(USA);
        test.add(Belgique);
        jo.setListePays(test);
        assertEquals(test, jo.getListePays());
    }

    @Test
    public void testSetDateDebut() {
        jo.setDateDeDebut("1/1/2025");
        assertEquals("1/1/2025", jo.getDateDeDebut());
    }

    @Test
    public void testSetDateFin() {
        jo.setDateDeFin("26/11/2025");
        assertEquals("26/11/2025", jo.getDateDeFin());
    }


    @Test
    public void testAjoutePays(){
        List<Pays> test  =  new ArrayList<>();
        Pays France = new Pays("France");
        Pays USA = new Pays("USA");
        Pays Belgique = new Pays("Belgique");
        test.add(France);
        test.add(USA);
        test.add(Belgique);
        JeuxOlympiques jo = new JeuxOlympiques("demain","dans 2 jours");
        jo.ajoutePays(France);
        jo.ajoutePays(USA);
        List<Athlete> test2 = new ArrayList<>();
        jo.ajoutePays(0, 0, 0, "Belgique", test2);

        assertEquals(test, jo.getListePays());
        
    }
    
    @Test
    public void testRetirerPays(){
        List<Pays> test  =  new ArrayList<>();
        Pays France = new Pays("France");
        Pays USA = new Pays("USA");  
        JeuxOlympiques jo = new JeuxOlympiques("demain","dans 2 jours");
        jo.ajoutePays(France);
        jo.ajoutePays(USA);
        List<Athlete> test2 = new ArrayList<>();
        jo.ajoutePays(0, 0, 0, "Belgique", test2);
        
        jo.retierPays(France);
        jo.retierPays(USA);
        jo.retierPays(0, 0, 0, "Belgique", test2);
        assertEquals(test, jo.getListePays());       
    }
}
