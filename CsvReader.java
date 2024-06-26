import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.*;

public class CsvReader{
    
    private String txt;
    private JeuxOlympiques jo;
    private List<String> listePays;
    ConnexionMySQL laConnexion;
	Statement st;
    
    public CsvReader(String filePath, JeuxOlympiques jeux){
        int i = 0;
        listePays = new ArrayList<>();
        try{
            this.jo = jeux;
            File file = new File(filePath);
            Scanner scan = new java.util.Scanner(file);
            ajouterJO(i);
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
                this.ajouterAthlete(atl, i);
                this.jo.getPaysByNom(pays).ajouteAthlete(atl);
                i++;
       
            }
            scan.close();
        }catch(FileNotFoundException ex){
            System.out.println("le fichier n’existe pas");
        }catch(SQLException sqlException){
            System.out.println(sqlException);
        }
        
        
    }

    void ajouterJO(int id) throws  SQLException{
		st=laConnexion.createStatement();
        String requete = "insert into JEUXOLYMPIQUES values("+id+",'"+this.jo.getDateDeDebut()+"',"+this.jo.getDateDeFin()+")";
        System.out.println(requete);
        st.executeUpdate(requete);
	}


    void ajouterAthlete(Athlete e, int i) throws  SQLException{
		st=laConnexion.createStatement();
        String requete = "insert into ATHLETE values("+i+",'"+e.getNom()+"','"+e.getPrenom()+"','"+e.getSexe()+"','"+e.getForce()+"','"+e.getAgilite()+"','"+e.getEndurance()+"','"+0+"','"+e.getPays()+"','"+e.getSport()+"','"+0+")";
        System.out.println(requete);
        st.executeUpdate(requete);
	}

    void ajouterPays(Pays e) throws  SQLException{
		st=laConnexion.createStatement();
        String requete = "insert into PAYS values("+e.getNom()+",'"+0+"','"+0+"',"+0+")";
        System.out.println(requete);
        st.executeUpdate(requete);
	}    

    void ajouterContient(Pays pays, int id) throws  SQLException{
		st=laConnexion.createStatement();
        String requete = "insert into CONTIENT values("+id+","+pays.getNom()+")";
        System.out.println(requete);
        st.executeUpdate(requete);
	}  

    void ajouterEpreuve(Epreuve epreuve, int id, String sport) throws  SQLException{
		st=laConnexion.createStatement();
        if(sport.equals("Natation")){
            String requete = "insert into EPREUVE values("+id+",'"+epreuve.getNom()+"','"+epreuve.getSexe()+"',"+1+")";
            System.out.println(requete);
            st.executeUpdate(requete);
        }
        if(sport.equals("Escrime")){
            String requete = "insert into EPREUVE values("+id+",'"+epreuve.getNom()+"','"+epreuve.getSexe()+"',"+2+")";
            System.out.println(requete);
            st.executeUpdate(requete);
        }
        if(sport.equals("Volley-Ball")){
            String requete = "insert into EPREUVE values("+id+",'"+epreuve.getNom()+"','"+epreuve.getSexe()+"',"+3+")";
            System.out.println(requete);
            st.executeUpdate(requete);
        }
        if(sport.equals("Handball")){
            String requete = "insert into EPREUVE values("+id+",'"+epreuve.getNom()+"','"+epreuve.getSexe()+"',"+4+")";
            System.out.println(requete);
            st.executeUpdate(requete);
        }
        if(sport.equals("Athletisme")){
            String requete = "insert into EPREUVE values("+id+",'"+epreuve.getNom()+"','"+epreuve.getSexe()+"',"+5+")";
            System.out.println(requete);
            st.executeUpdate(requete);
        }
	}  

    void ajouterNatation(Sport sport, String epreuve) throws  SQLException{
        if(sport.getNom().equals("Natation") && (!(jo.getListeSport().contains(sport)))){
            if(epreuve.equals("Natation 100 brasse")){
                st=laConnexion.createStatement();
                String requete = "insert into NATATION values("+epreuve+",'"+100+"','"+3+"',"+1+")";
                System.out.println(requete);
                st.executeUpdate(requete);
            }
            if(epreuve.equals("Natation relais libre")){
                st=laConnexion.createStatement();
                String requete = "insert into NATATION values("+epreuve+",'"+10000+"','"+3+"',"+1+")";
                System.out.println(requete);
                st.executeUpdate(requete);
            }
        }
	}  

    void ajouterEscrime(Sport sport, String epreuve) throws  SQLException{
        if(sport.getNom().equals("Escrime") && (!(jo.getListeSport().contains(sport)))){
            if(epreuve.equals("Escrime fleuret")){
                st=laConnexion.createStatement();
                String requete = "insert into ESCRIME values("+epreuve+",'"+true+"','"+false+"','"+false+"',"+2+")";
                System.out.println(requete);
                st.executeUpdate(requete);
            }
            if(epreuve.equals("Escrime épée")){
                st=laConnexion.createStatement();
                String requete = "insert into ESCRIME values("+epreuve+",'"+false+"','"+true+"','"+false+"',"+2+")";
                System.out.println(requete);
                st.executeUpdate(requete);
            }
            if(epreuve.equals("Escrime sabre")){
                st=laConnexion.createStatement();
                String requete = "insert into ESCRIME values("+epreuve+",'"+false+"','"+false+"','"+true+"',"+2+")";
                System.out.println(requete);
                st.executeUpdate(requete);
            }
        }
	}  

    void ajouterVolley(Sport sport, String epreuve) throws  SQLException{
        if(sport.getNom().equals("Volley-Ball") && (!(jo.getListeSport().contains(sport)))){
            if(epreuve.equals("Volley-Ball Sable")){
                st=laConnexion.createStatement();
                String requete = "insert into VOLLEY values("+epreuve+",'"+9+"','"+18+"','"+true+"','"+false+"',"+3+")";
                System.out.println(requete);
                st.executeUpdate(requete);
            }
            if(epreuve.equals("Volley-Ball Salle")){
                st=laConnexion.createStatement();
                String requete = "insert into VOLLEY values("+epreuve+",'"+9+"','"+18+"','"+false+"','"+true+"',"+3+")";
                System.out.println(requete);
                st.executeUpdate(requete);
            }
        }
    }

    void ajouterHandball(Sport sport) throws  SQLException{
        if(sport.getNom().equals("Handball") && (!(jo.getListeSport().contains(sport)))){
                st=laConnexion.createStatement();
                String requete = "insert into HANDBALL values("+sport+",'"+20+"','"+40+"',"+3+")";
                System.out.println(requete);
                st.executeUpdate(requete);
        }
    }

    void ajouterAthletisme(Sport sport, String epreuve) throws  SQLException{
        if(sport.getNom().equals("Athletisme") && (!(jo.getListeSport().contains(sport)))){
            if(epreuve.equals("Athétisme 110 haies")){
                st=laConnexion.createStatement();
                String requete = "insert into ATHLETISME values("+epreuve+",'"+110+"','"+true+"',"+1+")";
                System.out.println(requete);
                st.executeUpdate(requete);
            }
            if(epreuve.equals("Athlétisme relais 400m")){
                st=laConnexion.createStatement();
                String requete = "insert into ATHLETISME values("+epreuve+",'"+400+"','"+false+"',"+1+")";
                System.out.println(requete);
                st.executeUpdate(requete);
            }
        }
	}  




}