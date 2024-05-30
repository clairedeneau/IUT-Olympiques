import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestJeuxOlympiques {
 
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
        jo.ajoutePays(Belgique);

        assertEquals(test, jo.getListePays());
        
    }
    
}
