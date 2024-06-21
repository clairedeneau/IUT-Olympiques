import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class ControleurOrganisateurAccueil {
    
    @FXML
    private ImageView imageProfil;

    @FXML
    private Label lNomOrga;

    @FXML
    private Button bDeconnexion;

    @FXML
    private Button bLesEpreuves;

    @FXML
    private Label titreOrga;

    @FXML
    private TextField tfEpreuve;

    @FXML
    private RadioButton rbFeminin;

    @FXML
    private RadioButton rbMasculin;

    @SuppressWarnings("rawtypes")
    @FXML
    private ComboBox cbSport;

    @FXML
    private Button bCreerEpreuve;

    @SuppressWarnings("rawtypes")
    @FXML
    private ComboBox cbLesSports;

    @SuppressWarnings("rawtypes")
    @FXML
    private ComboBox cbAthletes;

    @FXML
    private Button bAjouterAthlete;

    private IUTO vue;

    public ControleurOrganisateurAccueil(IUTO vue) {
        this.vue = vue;
    }

    @FXML
    private void init(){}

    @FXML
    private void handleAccueil(ActionEvent event) throws IOException {
        vue.modeAccueil();
    }

    @FXML
    private void handleEpreuve(ActionEvent event) throws IOException {
            vue.modeOrganisateurEpreuve();
    }

    @FXML
    private void handleCreeEpreuve(ActionEvent event) throws IOException, SQLException, ClassNotFoundException {
        ConnexionMySQL test = new ConnexionMySQL();
        test.connecter("servinfo-maria", "DBdore", "dore", "dore");
        Jdbc coo = new Jdbc(test);
        
        
    }


    public ImageView getImageProfil() {
        return imageProfil;
    }

    public void setImageProfil(ImageView imageProfil) {
        this.imageProfil = imageProfil;
    }

    public Label getlNomOrga() {
        return lNomOrga;
    }

    public void setlNomOrga(Label lNomOrga) {
        this.lNomOrga = lNomOrga;
    }

    public Button getbDeconnexion() {
        return bDeconnexion;
    }

    public void setbDeconnexion(Button bDeconnexion) {
        this.bDeconnexion = bDeconnexion;
    }

    public Button getbLesEpreuves() {
        return bLesEpreuves;
    }

    public void setbLesEpreuves(Button bLesEpreuves) {
        this.bLesEpreuves = bLesEpreuves;
    }

    public Label getTitreOrga() {
        return titreOrga;
    }

    public void setTitreOrga(Label titreOrga) {
        this.titreOrga = titreOrga;
    }

    public TextField getTfEpreuve() {
        return tfEpreuve;
    }

    public void setTfEpreuve(TextField tfEpreuve) {
        this.tfEpreuve = tfEpreuve;
    }

    public RadioButton getRbFeminin() {
        return rbFeminin;
    }

    public void setRbFeminin(RadioButton rbFeminin) {
        this.rbFeminin = rbFeminin;
    }

    public RadioButton getRbMasculin() {
        return rbMasculin;
    }

    public void setRbMasculin(RadioButton rbMasculin) {
        this.rbMasculin = rbMasculin;
    }

    public ComboBox getCbSport() {
        return cbSport;
    }

    public void setCbSport(ComboBox cbSport) {
        this.cbSport = cbSport;
    }

    public Button getbCreerEpreuve() {
        return bCreerEpreuve;
    }

    public void setbCreerEpreuve(Button bCreerEpreuve) {
        this.bCreerEpreuve = bCreerEpreuve;
    }

    public ComboBox getCbLesSports() {
        return cbLesSports;
    }

    public void setCbLesSports(ComboBox cbLesSports) {
        this.cbLesSports = cbLesSports;
    }

    public ComboBox getCbAthletes() {
        return cbAthletes;
    }

    public void setCbAthletes(ComboBox cbAthletes) {
        this.cbAthletes = cbAthletes;
    }

    public Button getbAjouterAthlete() {
        return bAjouterAthlete;
    }

    public void setbAjouterAthlete(Button bAjouterAthlete) {
        this.bAjouterAthlete = bAjouterAthlete;
    }

    public IUTO getVue() {
        return vue;
    }

    public void setVue(IUTO vue) {
        this.vue = vue;
    }

    

}

