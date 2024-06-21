import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ControleurJournaliste {

    //Fx id de page_accueil
    @FXML
    private Label titrePageJ;

    @FXML 
    private Label userNameJ;

    @FXML
    private Button boutonLogOut;

    @FXML
    private TableView tableauMedailles;

    @FXML
    private ComboBox comboBoxSports;
    
    @FXML
    private ListView classementParSport;

    @FXML
    private TextField searchPays;

    @FXML
    private ListView infosPays;

    @FXML
    private TextField searchAthlete;

    @FXML
    private ListView infosAthlete;

    private IUTO vue;

    public ControleurJournaliste(IUTO vue) {
        this.vue = vue;
    }

    @FXML
    private void init() throws ClassNotFoundException, SQLException{
        ConnexionMySQL test = new ConnexionMySQL();
        test.connecter("servinfo-maria", "DBdore", "dore", "dore");
        Jdbc coo = new Jdbc(test);
    };

    @FXML
    private void handleAccueil(ActionEvent event) throws IOException {
            vue.modeAccueil();
    }

    public Label getTitrePageJ() {
        return titrePageJ;
    }

    public void setTitrePageJ(Label titrePageJ) {
        this.titrePageJ = titrePageJ;
    }

    public Label getUserNameJ() {
        return userNameJ;
    }

    public void setUserNameJ(Label userNameJ) {
        this.userNameJ = userNameJ;
    }

    public Button getBoutonLogOut() {
        return boutonLogOut;
    }

    public void setBoutonLogOut(Button boutonLogOut) {
        this.boutonLogOut = boutonLogOut;
    }

    public TableView getTableauMedailles() {
        return tableauMedailles;
    }

    public void setTableauMedailles(TableView tableauMedailles) {
        this.tableauMedailles = tableauMedailles;
    }

    public ComboBox getComboBoxSports() {
        return comboBoxSports;
    }

    public void setComboBoxSports(ComboBox comboBoxSports) {
        this.comboBoxSports = comboBoxSports;
    }

    public ListView getClassementParSport() {
        return classementParSport;
    }

    public void setClassementParSport(ListView classementParSport) {
        this.classementParSport = classementParSport;
    }

    public TextField getSearchPays() {
        return searchPays;
    }

    public void setSearchPays(TextField searchPays) {
        this.searchPays = searchPays;
    }

    public ListView getInfosPays() {
        return infosPays;
    }

    public void setInfosPays(ListView infosPays) {
        this.infosPays = infosPays;
    }

    public TextField getSearchAthlete() {
        return searchAthlete;
    }

    public void setSearchAthlete(TextField searchAthlete) {
        this.searchAthlete = searchAthlete;
    }

    public ListView getInfosAthlete() {
        return infosAthlete;
    }

    public void setInfosAthlete(ListView infosAthlete) {
        this.infosAthlete = infosAthlete;
    }

    public IUTO getVue() {
        return vue;
    }

    public void setVue(IUTO vue) {
        this.vue = vue;
    }



    
}