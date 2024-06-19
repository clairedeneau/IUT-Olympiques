import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ControleurAdminPrincipale {
    
    @FXML
    private Label userNameA;

    @FXML
    private Button boutonLogOut;
    
    @FXML
    private Button boutnNewAcc;
    
    @FXML
    private Label titreAdmin;

    @FXML
    private TableView tableauMedailles;

    @FXML
    private ComboBox comboBoxSports;

    @FXML
    private ListView classementParSport;

    @FXML
    private TextField searchPays;

    @FXML
    private Button modifPays;

    @FXML
    private ListView infosPays;

    @FXML
    private TextField searchAthlete;

    @FXML
    private Button modifAthlete;

    @FXML
    private ListView infosAthlete;

    private IUTO vue;

    public ControleurAdminPrincipale(IUTO vue) {
        this.vue = vue;
    }

    @FXML
    private void init(){};

    @FXML
    private void handleAccueil(ActionEvent event) throws IOException {
        vue.modeAccueil();
    }

    @FXML
    private void handlePays(ActionEvent event) throws IOException {
        vue.modeAdminPays();
    }

    @FXML
    private void handleCompte(ActionEvent event) throws IOException {
        vue.modeAdminCompte();
    }

    @FXML
    private void handleAthlete(ActionEvent event) throws IOException {
        vue.modeAdminAthlete();
    }

    public Label getUserNameA() {
        return userNameA;
    }

    public void setUserNameA(Label userNameA) {
        this.userNameA = userNameA;
    }

    public Button getBoutonLogOut() {
        return boutonLogOut;
    }

    public void setBoutonLogOut(Button boutonLogOut) {
        this.boutonLogOut = boutonLogOut;
    }

    public Button getBoutnNewAcc() {
        return boutnNewAcc;
    }

    public void setBoutnNewAcc(Button boutnNewAcc) {
        this.boutnNewAcc = boutnNewAcc;
    }

    public Label getTitreAdmin() {
        return titreAdmin;
    }

    public void setTitreAdmin(Label titreAdmin) {
        this.titreAdmin = titreAdmin;
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

    public Button getModifPays() {
        return modifPays;
    }

    public void setModifPays(Button modifPays) {
        this.modifPays = modifPays;
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

    public Button getModifAthlete() {
        return modifAthlete;
    }

    public void setModifAthlete(Button modifAthlete) {
        this.modifAthlete = modifAthlete;
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
