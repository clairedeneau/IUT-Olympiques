import java.io.IOException;
import java.sql.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class IUTO extends Application {

    private BorderPane panelCentral;

    private BorderPane pageOrganisateur;
    
    private BorderPane pageAccueil;

    private BorderPane pageConnexion;

    private BorderPane pageAdmin;

    private BorderPane pageJournaliste;

    private BorderPane pageAdminAthlete;
    
    private BorderPane pageAdminPays;

    private BorderPane pageAdminCompte;


    private ConnexionMySQL connexionMySQL;

 

    @Override
    public void init() throws IOException, ClassNotFoundException {
        try {
            this.connexionMySQL = new ConnexionMySQL();
            System.out.println("Base de donnée connectée");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
            System.out.println("Driver MySQL non trouvÃ©!!!");
            System.exit(1);
        }
        this.panelCentral = new BorderPane();
        this.pageAccueil = FXMLLoader.load(getClass().getResource("page_accueil.fxml"));
        this.pageConnexion = FXMLLoader.load(getClass().getResource("page_connexion.fxml"));
        this.pageOrganisateur = FXMLLoader.load(getClass().getResource("page_organisateur.fxml"));
        this.pageJournaliste = FXMLLoader.load(getClass().getResource("page_journaliste.fxml"));
        this.pageAdmin = FXMLLoader.load(getClass().getResource("page_admin_principale.fxml"));
        this.pageAdminAthlete = FXMLLoader.load(getClass().getResource("page_admin_modifAthlete.fxml"));
        this.pageAdminCompte = FXMLLoader.load(getClass().getResource("page_admin_nvCompte.fxml"));
        this.pageAdminPays = FXMLLoader.load(getClass().getResource("page_admin_modifPays.fxml"));
    } 



    public void modeConnexion() {
        this.panelCentral = this.pageConnexion;
    }

    public void modeAccueil() {
        this.panelCentral = this.pageAccueil;
    }

    public void modeOrganisateur() {
        this.panelCentral = this.pageOrganisateur;
    }

    public void modeJournaliste() {
        this.panelCentral = this.pageJournaliste;
    }

    public void modeAdmin() {
        this.panelCentral = this.pageAdmin;
    }

    public void modeAdminPays() {
        this.panelCentral = this.pageAdminPays;
    }

    public void modeAdminCompte() {
        this.panelCentral = this.pageAdminCompte;
    }

    public void modeAdminAthlete() {
        this.panelCentral = this.pageAdminAthlete;
    }


    @Override
    public void start(Stage stage) throws IOException, SQLException {

        connexionMySQL.connecter("servinfo-maria", "DBdore", "dore", "dore");
        this.panelCentral = this.pageAccueil;
        stage.setTitle("Jeux Olympiques 2024");
        Scene scene = new Scene(this.panelCentral);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}