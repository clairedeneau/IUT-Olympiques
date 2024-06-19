import java.io.IOException;

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
    private void init(){};

    @FXML
    private void handleAccueil(ActionEvent event) throws IOException {
        vue.modeAccueil();
    }

    @FXML
    private void handleEpreuve(ActionEvent event) throws IOException {
            vue.modeOrganisateurEpreuve();
    }

}

