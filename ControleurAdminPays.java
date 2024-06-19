import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;

public class ControleurAdminPays {
    
    @FXML
    private Label userNameA;

    @FXML
    private Button boutonLogOut;

    @FXML
    private Button boutnNewAcc;

    @FXML
    private TextField tfNom;

    @FXML
    private Spinner spinnerOr;

    @FXML
    private Spinner spinnerArgent;

    @FXML
    private Spinner spinnerBronze;

    @FXML
    private Button boutonRetour;

    @FXML
    private Button boutonAnnuler;

    @FXML
    private Button boutonSave;

    private IUTO vue;

    public ControleurAdminPays(IUTO vue) {
        this.vue = vue;
    }

    @FXML
    private void init(){};

    @FXML
    private void handleAccueil(ActionEvent event) throws IOException {
        vue.modeAccueil();
    }

    @FXML
    private void handleEnregistrer(ActionEvent event) throws IOException {
        
    }

    @FXML
    private void handleRetour(ActionEvent event) throws IOException {
        vue.modeAdminPrincipale();
    }

        @SuppressWarnings("unchecked")
    @FXML  
    private void handleAnnuler(ActionEvent event) throws IOException {
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 1000, 0);
        SpinnerValueFactory<Integer> valueFactory2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 1000, 0);
        SpinnerValueFactory<Integer> valueFactory3 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 1000, 0);
        tfNom.setText("");
        spinnerOr.setValueFactory(valueFactory);
        spinnerArgent.setValueFactory(valueFactory2);
        spinnerBronze.setValueFactory(valueFactory3);
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
    public TextField getTfNom() {
        return tfNom;
    }
    public void setTfNom(TextField tfNom) {
        this.tfNom = tfNom;
    }
    public Spinner getSpinnerOr() {
        return spinnerOr;
    }
    public void setSpinnerOr(Spinner spinnerOr) {
        this.spinnerOr = spinnerOr;
    }
    public Spinner getSpinnerArgent() {
        return spinnerArgent;
    }
    public void setSpinnerArgent(Spinner spinnerArgent) {
        this.spinnerArgent = spinnerArgent;
    }
    public Spinner getSpinnerBronze() {
        return spinnerBronze;
    }
    public void setSpinnerBronze(Spinner spinnerBronze) {
        this.spinnerBronze = spinnerBronze;
    }
    public Button getBoutonRetour() {
        return boutonRetour;
    }
    public void setBoutonRetour(Button boutonRetour) {
        this.boutonRetour = boutonRetour;
    }
    public Button getBoutonAnnuler() {
        return boutonAnnuler;
    }
    public void setBoutonAnnuler(Button boutonAnnuler) {
        this.boutonAnnuler = boutonAnnuler;
    }
    public Button getBoutonSave() {
        return boutonSave;
    }
    public void setBoutonSave(Button boutonSave) {
        this.boutonSave = boutonSave;
    }
    public IUTO getVue() {
        return vue;
    }
    public void setVue(IUTO vue) {
        this.vue = vue;
    }


    

}
