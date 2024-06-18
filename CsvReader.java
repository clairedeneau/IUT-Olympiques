import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvReader{
    
    private String txt;
    private JeuxOlympiques jo;
    
    public CsvReader(String filePath, JeuxOlympiques jeux){
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
                String sport = data[4];
                this.jo.ajoutePays(pays);
                Athlete atl = new Athlete(nom, prenom, sexe, pays);
            }
        }catch(FileNotFoundException ex){
            System.out.println("le fichier n’existe pas");
        }
        
    }
}