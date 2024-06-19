import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvReader{
    
    private String txt;
    private JeuxOlympiques jo;
    private List<String> listePays;
    
    public CsvReader(String filePath, JeuxOlympiques jeux){
        listePays = new ArrayList<>();
        try{
            this.jo = jeux;
            File file = new File(filePath);
            Scanner scan = new java.util.Scanner(file);
            while(scan.hasNextLine()){
                String[] data = scan.nextLine().split(",");
                String nom = data[0];
                String prenom = data[1];
                char sexe = data[2].charAt(0);
                String pays = data[3];
                String epreuve = data[4];
                String force = data[5];
                String endurance = data[6];
                String agilite = data[7];
                String sport = data[8];
                this.jo.ajouteSport(sport);
                this.jo.ajoutePays(pays);
                Athlete atl = new Athlete(nom, prenom, sexe, this.jo.getPaysByNom(pays), epreuve, Integer.parseInt(force), Integer.parseInt(endurance), Integer.parseInt(agilite), sport);
                this.jo.getPaysByNom(pays).ajouteAthlete(atl);
                
       
            }
            scan.close();
        }catch(FileNotFoundException ex){
            System.out.println("le fichier n’existe pas");
        }
        
    }
}