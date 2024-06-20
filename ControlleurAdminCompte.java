import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;

public class ControlleurAdminCompte {
    
    @FXML
    private Label userNameA;

    @FXML
    private Button boutonLogOut;

    @FXML
    private Button boutnNewAcc;

    @FXML
    private TextField tfUserName;

    @FXML
    private PasswordField tfMdp1;

    @FXML
    private PasswordField tfMdp2;

    @FXML
    private RadioButton rbJourn;

    @FXML
    private RadioButton rbOrga;

    @FXML
    private RadioButton rbAdmin;

    @FXML
    private Button boutonRetour;

    @FXML
    private Button boutonAnnuler;

    @FXML
    private Button boutonSave;


    private IUTO vue;

    public ControlleurAdminCompte(IUTO vue) {
        this.vue = vue;
    }

    @FXML
    private void init(){};

    @FXML
    private void handleAccueil(ActionEvent event) throws IOException {
        vue.modeAccueil();
    }

    @FXML
    private void handleRetour(ActionEvent event) throws IOException {
        vue.modeAdminPrincipale();
    }

    @FXML
    private void handleEnregistrer(ActionEvent event) throws IOException {
            
    }

    @FXML  
    private void handleAnnuler(ActionEvent event) throws IOException {
        tfUserName.setText("");
        tfMdp1.setText("");
        tfMdp2.setText("");
        rbAdmin.setSelected(false);
        rbJourn.setSelected(false);
        rbOrga.setSelected(false);
    }
}
