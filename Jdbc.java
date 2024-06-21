import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Jdbc {
    private JeuxOlympiques jo;
    private ConnexionMySQL connexion;
    private Statement st;
    
    /**
     * Constructeur de la classe Jdbc.
     * 
     * @param co Connexion à la base de données MySQL.
     */
    public Jdbc(ConnexionMySQL co){
        this.connexion = co;
    }

    /**
     * Récupère le rôle de l'utilisateur.
     * 
     * @param nomUser Nom de l'utilisateur.
     * @param mdpUser Mot de passe de l'utilisateur.
     * @return Le rôle de l'utilisateur sous forme de chaîne de caractères.
     * @throws SQLException en cas de problème d'accès à la base de données.
     */
    public String getRoleUser(String nomUser, String mdpUser) throws SQLException{
        this.st = this.connexion.createStatement();
        String requete = "Select metier from USER where nom = '"+nomUser+"' and MDP = '"+mdpUser+"'";
        ResultSet r=st.executeQuery(requete);
        String res = r.getString(0);
        return res;
    }

    /**
     * Génère un tableau des médailles.
     * 
     * @return Un tableau des médailles sous forme de chaîne de caractères.
     * @throws SQLException en cas de problème d'accès à la base de données.
     */
    public String tableauMedailles() throws SQLException{
	    this.st=connexion.createStatement();
		String requete = "Select * from PAYSJO";
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

    /**
     * Génère un classement des athlètes par sport.
     * 
     * @param idsport L'identifiant du sport.
     * @return Un classement des athlètes sous forme de chaîne de caractères.
     * @throws SQLException en cas de problème d'accès à la base de données.
     */
    public String classementParSport(int idsport) throws SQLException{
        this.st=connexion.createStatement();
		String requete = "Select Nom, Prenom, Nom_Pays, Nb_Victoires_Athlètes from ATHLETES where Id_Sport =" + idsport + " order by Nb_Victoires_Athlète desc";
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

    /**
     * Recherche les informations d'un pays.
     * 
     * @param pays Le nom du pays.
     * @return Les informations du pays sous forme de chaîne de caractères.
     * @throws SQLException en cas de problème d'accès à la base de données.
     */
    public String recherchePays(String pays) throws SQLException{
        this.st=connexion.createStatement();
		String requete = "Select * from PAYSJO where Nom_Pays = '"+ pays+"'";
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
    
    /**
     * Recherche les informations d'un athlète.
     * 
     * @param nomA Le nom de l'athlète.
     * @param prenomA Le prénom de l'athlète.
     * @return Les informations de l'athlète sous forme de chaîne de caractères.
     * @throws SQLException en cas de problème d'accès à la base de données.
     */
    public String rechercheAthlete(String nomA, String prenomA) throws SQLException{
        this.st=connexion.createStatement();
		String requete = "Select * from ATHLETES natural join APPARTENIR natural join EQUIPE natural join PARTICIPER natural join EPREUVES where Nom = '"+nomA+"' and Prenom = '"+prenomA+"'";
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
    
    /**
     * Crée un nouveau compte utilisateur.
     * 
     * @param nom Le nom de l'utilisateur.
     * @param mdp Le mot de passe de l'utilisateur.
     * @param role Le rôle de l'utilisateur.
     * @throws SQLException en cas de problème d'accès à la base de données.
     */
    public void nvCompte(String nom, String mdp, String role)throws SQLException{
        st = connexion.createStatement();
     	String requete = "INSERT INTO USER VALUES('"+nom+"', '"+mdp+"', '"+role+"')";

		System.out.println(requete);
		st.executeUpdate(requete);
    }

    /**
     * Liste toutes les épreuves.
     * 
     * @return Une liste de chaînes de caractères représentant les épreuves.
     * @throws SQLException en cas de problème d'accès à la base de données.
     */
    public List<String> listeEpreuves()throws SQLException{
        this.st=connexion.createStatement();
		String requete = "Select * from EPREUVES";
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

    /**
     * Liste les athlètes selon le sport.
     * 
     * @param idSport L'identifiant du sport.
     * @return Une liste de chaînes de caractères représentant les athlètes.
     * @throws SQLException en cas de problème d'accès à la base de données.
     */
    public List<String> listeAthletesSelonSport(int idSport)throws SQLException{
        this.st=connexion.createStatement();
		String requete = "Select Nom, Prenom from ATHLETES where Id_Sport ="+idSport;
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

    /**
     * Modifie les informations d'un pays.
     * 
     * @param nom_init Le nom initial du pays.
     * @param nom Le nouveau nom du pays.
     * @param nbOr Le nombre de médailles d'or.
     * @param nbArg Le nombre de médailles d'argent.
     * @param nbBrz Le nombre de médailles de bronze.
     * @throws SQLException en cas de problème d'accès à la base de données.
     */
    public void modifPays(String nom_init, String nom, int nbOr, int nbArg, int nbBrz)throws SQLException{
        st = connexion.createStatement();
     	String requete = "UPDATE PAYSJO SET Nom_Pays = '"+nom+"', Nb_medailles_or = '"+nbOr+"', Nb_medailles_argent = '"+nbArg+"', Nb_medailles_bronze = '"+nbBrz+"',WHERE Nom_Pays = '"+nom_init+"'";
		System.out.println(requete);
		st.executeUpdate(requete);
    }

    /**
     * Modifie les informations d'un athlète.
     * 
     * @param id L'identifiant de l'athlète.
     * @param nom Le nom de l'athlète.
     * @param prenom Le prénom de l'athlète.
     * @param sexe Le sexe de l'athlète.
     * @param force La force de l'athlète.
     * @param agilite L'agilité de l'athlète.
     * @param endurance L'endurance de l'athlète.
     * @param victoires Le nombre de victoires de l'athlète.
     * @param pays Le pays de l'athlète.
     * @throws SQLException en cas de problème d'accès à la base de données.
     */
    public void modifAthlete(int id, String nom, String prenom, String sexe, int force, int agilite, int endurance, int victoires, String pays)throws SQLException{
        st = connexion.createStatement();
     	String requete = "UPDATE ATHLETES SET Nom = '"+nom+"',Prenom = '"+prenom+"',Sexe = '"+sexe+"',Force = '"+force+"',Agilite = '"+agilite+"',Endurance = '"+endurance+"',Nb_Victoires_Athlète = '"+victoires+"',Nom_Pays = '"+pays+"' WHERE Id_Athlète = '"+id+"'";
		System.out.println(requete);
		st.executeUpdate(requete);
    }

    /**
     * Supprime une épreuve.
     * 
     * @param id L'identifiant de l'épreuve.
     * @throws SQLException en cas de problème d'accès à la base de données.
     */
    public void supprimeEpreuve(int id) throws SQLException {
        st = connexion.createStatement();
     	String requete = "DELETE FROM EPREUVES WHERE Id_Epreuve = "+id;
		System.out.println(requete);
		st.executeUpdate(requete);
    }

    /**
     * Ajoute une participation.
     * 
     * @param idEquipe L'identifiant de l'équipe.
     * @param idEpreuve L'identifiant de l'épreuve.
     * @param position La position de l'équipe.
     * @param score Le score de l'équipe.
     * @throws SQLException en cas de problème d'accès à la base de données.
     */
    public void ajouteParticipation(int idEquipe, int idEpreuve, int position, double score) throws SQLException {
        st = connexion.createStatement();
     	String requete = "INSERT INTO PARTICIPER VALUES('"+idEquipe+"','"+idEpreuve+"','"+position+"','"+score+"')";
		System.out.println(requete);
		st.executeUpdate(requete);
    }

    /**
     * Crée une nouvelle épreuve.
     * 
     * @param idEpreuve L'identifiant de l'épreuve.
     * @param idSport L'identifiant du sport.
     * @param nom Le nom de l'épreuve.
     * @param sexe Le sexe de l'épreuve.
     * @throws SQLException en cas de problème d'accès à la base de données.
     */
    public void creerEpreuve(int idEpreuve, int idSport, String  nom, String sexe) throws SQLException {
        st = connexion.createStatement();
     	String requete = "INSERT INTO EPREUVES VALUES('"+idEpreuve+"','"+nom+"','"+sexe+"','"+idSport+"')";
		System.out.println(requete);
		st.executeUpdate(requete);
    }

    /**
     * Modifie le nombre de médailles d'un pays.
     * 
     * @param pays L'objet Pays contenant les nouvelles valeurs.
     * @throws SQLException en cas de problème d'accès à la base de données.
     */
    public void modifMedailles(Pays pays)throws SQLException{
        st = connexion.createStatement();
     	String requete = "UPDATE PAYSJO SET Nb_médailles_or = "+pays.getNbMedailleOr()+", Nb_Médailles_argent = "+pays.getNbMedailleArgent()+", Nb_Médailles_bronze = "+pays.getNbMedailleBronze()+" WHERE Nom_pays = '"+pays.getNom()+"'";
		System.out.println(requete);
		st.executeUpdate(requete);
    }

    /**
     * Modifie le nombre de victoires d'un athlète.
     * 
     * @param atl L'objet Athlete contenant les nouvelles valeurs.
     * @throws SQLException en cas de problème d'accès à la base de données.
     */
    public void modifVictoires(Athlete atl)throws SQLException{
        st = connexion.createStatement();
     	String requete = "UPDATE ATHLETES SET Nb_Victoires_Athlète = "+atl.getNbVictoire()+" WHERE Nom = '"+atl.getNom()+"' AND Prenom = '"+atl.getPrenom()+"'";
		System.out.println(requete);
		st.executeUpdate(requete);
    }

    /**
     * Modifie le nombre de victoires d'une équipe.
     * 
     * @param eq L'objet Equipe contenant les nouvelles valeurs.
     * @throws SQLException en cas de problème d'accès à la base de données.
     */
    public void modifVictoires(Equipe eq)throws SQLException{
        st = connexion.createStatement();
     	String requete = "UPDATE EQUIPE SET Nb_Victoires = "+eq.getNbVictoire()+" WHERE Nom_Equipe = '"+eq.getNom()+"'";
		System.out.println(requete);
		st.executeUpdate(requete);
    }
    
    /**
     * Modifie les informations de la participation d'une équipe à une épreuve.
     * 
     * @param sc L'objet Score contenant les nouvelles valeurs.
     * @param idEquipe L'identifiant de l'équipe.
     * @param idEpreuve L'identifiant de l'épreuve.
     * @throws SQLException en cas de problème d'accès à la base de données.
     */
    public void modifParticiper(Score sc, int idEquipe, int idEpreuve)throws SQLException{
        st = connexion.createStatement();
     	String requete = "UPDATE PARTICIPER SET Position = "+sc.getPosition()+", Score = "+sc.getScore()+" WHERE Id_Equipe = '"+idEquipe+"' WHERE Id_Epreuve = '"+idEpreuve+"'";
		System.out.println(requete);
		st.executeUpdate(requete);
    }
}
