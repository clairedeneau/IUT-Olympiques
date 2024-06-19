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
    
    private ConnexionMySQL connexionMySQL;
    
    private ControleurAccueil controleurAccueil;
    
    private ControleurConnexion controleurConnexion;

    private ControleurJournaliste controleurJournaliste;

    private ControleurOrganisateurAccueil controleurOrganisateurAccueil;

    private ControleurOrganisteurEpreuve controleurOrganisteurEpreuve;

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
        controleurAccueil = new ControleurAccueil(this);
        controleurConnexion = new ControleurConnexion(this);
        controleurJournaliste = new ControleurJournaliste(this);
        controleurOrganisateurAccueil = new ControleurOrganisateurAccueil(this);
        controleurOrganisteurEpreuve = new ControleurOrganisteurEpreuve(this);
    }
        
    public BorderPane loadPageAccueil() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("page_accueil.fxml"));
        loader.setControllerFactory(c -> new ControleurAccueil(this));
        loader.setController(controleurAccueil);
        BorderPane root = loader.load();
        return root;
    }
    
    public BorderPane loadPageConnexion() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("page_connexion.fxml"));
        loader.setControllerFactory(c -> new ControleurConnexion(this));
        loader.setController(controleurConnexion);
        BorderPane root = loader.load();
        return root;
    }
    
    public BorderPane loadPageOrganisateurAccueil() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("page_orgaAccueil.fxml"));
        loader.setControllerFactory(c -> new ControleurOrganisateurAccueil(this));
        loader.setController(controleurOrganisateurAccueil);
        BorderPane root = loader.load();
        return root;
    }

    public BorderPane loadPageOrganisateurEpreuve() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("page_orgaEpreuve.fxml"));
        loader.setControllerFactory(c -> new ControleurOrganisateurAccueil(this));
        loader.setController(controleurOrganisteurEpreuve);
        BorderPane root = loader.load();
        return root;
    }
    
    public BorderPane loadPageJournaliste() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("page_journaliste.fxml"));
        loader.setControllerFactory(c -> new ControleurJournaliste(this));
        loader.setController(controleurJournaliste);
        BorderPane root = loader.load();
        return root;
    }
    
    public BorderPane loadPageAdmin() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("page_admin_principale.fxml"));
        return loader.load();
    }
    
    public BorderPane loadPageAdminAthlete() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("page_admin_modifAthlete.fxml"));
        return loader.load();
    }
    
    public BorderPane loadPageAdminCompte() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("page_admin_nvCompte.fxml"));
        return loader.load();
    }
    
    public BorderPane loadPageAdminPays() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("page_admin_modifPays.fxml"));
        return loader.load();
    }
    
    public void modeConnexion() throws IOException {
        this.panelCentral.setCenter(loadPageConnexion());
    }
    
    public void modeAccueil() throws IOException {
        this.panelCentral.setCenter(loadPageAccueil());
    }
    
    public void modeOrganisateurAccueil() throws IOException {
        this.panelCentral.setCenter(loadPageOrganisateurAccueil());
    }

    public void modeOrganisateurEpreuve() throws IOException {
        this.panelCentral.setCenter(loadPageOrganisateurEpreuve());
    }
    
    public void modeJournaliste() throws IOException {
        this.panelCentral.setCenter(loadPageJournaliste());
    }
    
    public void modeAdmin() throws IOException {
        this.panelCentral.setCenter(loadPageAdmin());
    }
    
    public void modeAdminPays() throws IOException {
        this.panelCentral.setCenter(loadPageAdminPays());
    }
    
    public void modeAdminCompte() throws IOException {
        this.panelCentral.setCenter(loadPageAdminCompte());
    }
    
    public void modeAdminAthlete() throws IOException {
        this.panelCentral.setCenter(loadPageAdminAthlete());
    }
    
    
    @Override
    public void start(Stage stage) throws IOException, SQLException {

        modeAccueil();
        stage.setTitle("Jeux Olympiques 2024");
        Scene scene = new Scene(this.panelCentral, 600, 600);
        stage.setScene(scene);
        stage.show();
    
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}