import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ControleurConnexion {

    //Fx id de page_connexion
    @FXML
    private TextField tfUser;

    @FXML 
    private PasswordField pwUser;

    @FXML
    private Button buttonConnexion;

    @FXML
    private Button buttonAccueil;
    
    private IUTO vue;

    public ControleurConnexion(IUTO vue) {
        this.vue = vue;
    }

    @FXML
    private void init(){};

    @FXML
    private void handleConnexion(ActionEvent event) throws IOException {
            vue.modeOrganisateurAccueil();
    }

    @FXML
    private void handleAccueil(ActionEvent event) throws IOException {
            vue.modeAccueil();
    }

    public TextField getTfUser() {
        return tfUser;
    }

    public void setTfUser(TextField tfUser) {
        this.tfUser = tfUser;
    }

    public PasswordField getPwUser() {
        return pwUser;
    }

    public void setPwUser(PasswordField pwUser) {
        this.pwUser = pwUser;
    }

    public Button getButtonConnexion() {
        return buttonConnexion;
    }

    public void setButtonConnexion(Button buttonConnexion) {
        this.buttonConnexion = buttonConnexion;
    }

    public Button getButtonAccueil() {
        return buttonAccueil;
    }

    public void setButtonAccueil(Button buttonAccueil) {
        this.buttonAccueil = buttonAccueil;
    }

    public IUTO getVue() {
        return vue;
    }

    public void setVue(IUTO vue) {
        this.vue = vue;
    }

    
}