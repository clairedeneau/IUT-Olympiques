import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Jdbc {
    private JeuxOlympiques jo;
    private ConnexionMySQL connexion;
    private Statement st;
    
    public Jdbc(ConnexionMySQL co){
        this.connexion = co;
    }

    public String getRoleUser(String nomUser, String mdpUser) throws SQLException{
        this.st = this.connexion.createStatement();
        String requete = "Select role from USER where nom = '"+nomUser+"' and mdp = '"+mdpUser+"'";
        ResultSet r=st.executeQuery(requete);
        String res = r.getString(0);
        return res;
    }

    public String tableauMedailles() throws SQLException{
	    this.st=connexion.createStatement();
		String requete = "Select * from PAYS";
		ResultSet r=st.executeQuery(requete);
		String resultat="Pays, Or, Argent, Bronze \n";

		while(r.next()){
			String nom = r.getString(0);
            String or = r.getString(1);
            String argent = r.getString(2);
            String bronze = r.getString(3);
            resultat = resultat + nom + or + argent + bronze + "\n"; 
		}
		r.close();
		return resultat;
	}
    public String classementParSport(String sport) throws SQLException{
        this.st=connexion.createStatement();
		String requete = "Select Nom, Prenom, Nom_Pays, Nb_Victoires from ATHLETE where sport ='" + sport + "' order by Nb_Victoires desc";
		ResultSet r=st.executeQuery(requete);
		String resultat="Nom, Prenom, Pays, Nombre de victoires \n";

		while(r.next()){
			String nom = r.getString(0);
            String prenom = r.getString(1);
            String pays = r.getString(2);
            String victoires = r.getString(3);
            resultat = resultat + nom + prenom + pays + victoires + "\n"; 
		}
		r.close();
		return resultat;
    }

    public String recherchePays(String pays) throws SQLException{
        this.st=connexion.createStatement();
		String requete = "Select * from PAYS where Nom_Pays = '"+ pays+"'";
		ResultSet r=st.executeQuery(requete);
		String resultat="Nom, Or, Argent, Bronze \n";
        String nom = r.getString(0);
        String or = r.getString(1);
        String argent = r.getString(2);
        String bronze = r.getString(3);
        resultat = resultat + nom + or + argent + bronze + "\n"; 
		r.close();
		return resultat;
    }
    
    public String rechercheAthlete(String nomA, String prenomA) throws SQLException{
        this.st=connexion.createStatement();
		String requete = "Select * from ATHLETE natural join PARTICIPE natural join EPREUVE where Nom = '"+nomA+"' and Prenom = '"+prenomA+"'";
		ResultSet r=st.executeQuery(requete);
		String resultat="Nom, Prenom, Sexe, Force, Agilité, Endurance, Nombre de victoires, Pays\n";
        String nom = r.getString(1);
        String prenom = r.getString(2);
        String sexe = r.getString(3);
        String force = r.getString(4);
        String agilite = r.getString(5);
        String endurance = r.getString(6);
        String victoires = r.getString(7);
        String pays = r.getString(8);
        resultat = resultat + nom + prenom + sexe + force + agilite + endurance + victoires + pays +"\n"; 
		r.close();
		return resultat;
    }
    
    public void nvCompte(String nom, String mdp, String role)throws SQLException{
        st = connexion.createStatement();
     	String requete = "INSERT INTO USER VALUES('"+nom+"', '"+mdp+"', '"+role+"')";

		System.out.println(requete);
		st.executeUpdate(requete);
    }

    public List<String> listeEpreuves()throws SQLException{
        this.st=connexion.createStatement();
		String requete = "Select * from EPREUVE";
		ResultSet r=st.executeQuery(requete);
		String resultat="Id, Nom, Sexe, Id du sport \n";

		while(r.next()){
			String id = r.getString(0);
            String nom = r.getString(1);
            String sexe = r.getString(2);
            String sport = r.getString(3);
            resultat = resultat + id + nom + sexe + sport + "\n"; 
		}
		r.close();
        String[] res = resultat.split("\n");
        List<String> fin = new ArrayList<>();
        for (String str : res){
            fin.add(str);
        }
		return fin;
    }

    public List<String> listeAthletesSelonSport(int idSport)throws SQLException{
        this.st=connexion.createStatement();
		String requete = "Select Nom, Prenom from ATHLETE where Id_Sport ="+idSport;
		ResultSet r=st.executeQuery(requete);
		String resultat="Nom, Prenom \n";

		while(r.next()){
			String nom = r.getString(0);
            String prenom = r.getString(1);
            resultat = resultat + nom + prenom + "\n"; 
		}
		r.close();
        String[] res = resultat.split("\n");
        List<String> fin = new ArrayList<>();
        for (String str : res){
            fin.add(str);
        }
		return fin;
    }

    public void modifPays(String nom_init, String nom, int nbOr, int nbArg, int nbBrz)throws SQLException{
        st = connexion.createStatement();
     	String requete = "UPDATE PAYS SET Nom_Pays = '"+nom+"', Nb_medailles_or = '"+nbOr+"', Nb_medailles_argent = '"+nbArg+"', Nb_medailles_bronze = '"+nbBrz+"',WHERE Nom_Pays = '"+nom_init+"'";
		System.out.println(requete);
		st.executeUpdate(requete);
    }

    public void modifAthlete(int id, String nom, String prenom, String sexe, int force, int agilite, int endurance, int victoires, String pays)throws SQLException{
        st = connexion.createStatement();
     	String requete = "UPDATE ATHLETE SET Nom = '"+nom+"',Prenom = '"+prenom+"',Sexe = '"+sexe+"',Force = '"+force+"',Agilite = '"+agilite+"',Endurance = '"+endurance+"',Nb_Victoires_Athlète = '"+victoires+"',Nom_Pays = '"+pays+"' WHERE Id_Athlète = '"+id+"'";
		System.out.println(requete);
		st.executeUpdate(requete);
    }

    public void supprimeEpreuve(int id) throws SQLException {
        st = connexion.createStatement();
     	String requete = "DELETE FROM EPREUVE WHERE Id_Epreuve = "+id;
		System.out.println(requete);
		st.executeUpdate(requete);
    }

    public void ajouteParticipation(int idEquipe, int idEpreuve, int position, double score) throws SQLException {
        st = connexion.createStatement();
     	String requete = "INSERT INTO PARTICIPE VALUES('"+idEquipe+"','"+idEpreuve+"','"+position+"','"+score+"')";
		System.out.println(requete);
		st.executeUpdate(requete);
    }

    public void creerEpreuve(int idEpreuve, int idSport, String  nom, String sexe) throws SQLException {
        st = connexion.createStatement();
     	String requete = "INSERT INTO EPREUVE VALUES('"+idEpreuve+"','"+nom+"','"+sexe+"','"+idSport+"')";
		System.out.println(requete);
		st.executeUpdate(requete);
    }

}
