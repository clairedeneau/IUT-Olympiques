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
        assertEquals("18/11/2024", jo2024.getDateDeDebut());
    }

    @Test
    public void testGetFin() {
        assertEquals("25/12/2024", jo2024.getDateDeFin());
    }

    @Test
    public void testGetListePays() {
        List<Pays> test = new ArrayList<>();
        assertEquals(test, jo2024.getListePays());
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
        jo2024.setListePays(test);
        assertEquals(test, jo2024.getListePays());
    }

    @Test
    public void testSetDateDebut() {
        jo2024.setDateDeDebut("1/1/2025");
        assertEquals("1/1/2025", jo2024.getDateDeDebut());
    }

    @Test
    public void testSetDateFin() {
        jo2024.setDateDeFin("26/11/2025");
        assertEquals("26/11/2025", jo2024.getDateDeFin());
    }


    @Test
    public void testAjoutePays(){
        List<Pays> test  =  new ArrayList<>();
        Pays France = new Pays("France");
        Pays USA = new Pays("USA");
        Pays Belgique = new Pays("Belgique");
        test.add(France);
        test.add(USA);
        List<Athlete> test2 = new ArrayList<>();
        test.add(Belgique);
        JeuxOlympiques jo = new JeuxOlympiques("demain","dans 2 jours");
        jo.ajoutePays(France);
        jo.ajoutePays(USA);
        
        jo.ajoutePays(Belgique);

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
        
        jo.retierPays(France);
        jo.retierPays(USA);
        assertEquals(test, jo.getListePays());       
    }
}
