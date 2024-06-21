import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;

public class ControleurAdminAthlete {

        //Fx id de page_admin_modifAtglete
    @FXML
    private Label userNameA;

    @FXML
    private Button boutonLogOut;

    @FXML
    private Button boutnNewAcc;

    @FXML
    private TextField tfNom;

    @FXML
    private TextField tfPrenom;

    @FXML
    private RadioButton rbFemme;

    @FXML
    private RadioButton rbHomme;

    @FXML
    private Spinner spinnerForce;

    @FXML
    private Spinner spinnerAgilite;

    @FXML
    private Spinner spinnerEndur;

    @FXML
    private Spinner spinnerNbVict;

    @FXML
    private TextField tfPays;

    @FXML
    private Button boutonRetour;

    @FXML
    private Button boutonAnnuler;

    @FXML
    private Button boutonSup;

    @FXML
    private Button boutonSave;

    private IUTO vue;

    public ControleurAdminAthlete(IUTO vue) {
        this.vue = vue;
    }

    @FXML
    private void init(){};

    @FXML
    private void handleAccueil(ActionEvent event) throws IOException {
        vue.modeAccueil();
    }

    @SuppressWarnings("unchecked")
    @FXML  
    private void handleAnnuler(ActionEvent event) throws IOException {
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 20, 0);
        SpinnerValueFactory<Integer> valueFactory2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 20, 0);
        SpinnerValueFactory<Integer> valueFactory3 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 20, 0);
        SpinnerValueFactory<Integer> valueFactory4 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 20, 0);
        tfNom.setText("");
        tfPrenom.setText("");
        rbFemme.setSelected(false);
        rbHomme.setSelected(false);
        spinnerForce.setValueFactory(valueFactory);
        spinnerAgilite.setValueFactory(valueFactory2);
        spinnerEndur.setValueFactory(valueFactory3);
        spinnerNbVict.setValueFactory(valueFactory4);
        tfPays.setText("");
    }

    @FXML
    private void handleEnregistrer(ActionEvent event) throws IOException, SQLException, ClassNotFoundException {
        ConnexionMySQL test = new ConnexionMySQL();
        test.connecter("servinfo-maria", "DBdore", "dore", "dore");
        Jdbc coo = new Jdbc(test); 
        String role;
        role = "test";
        if (rbFemme.isSelected()) {
            role = "F";
        }
        else {
            role = "M";
        }
        int force =  (int) spinnerForce.getValue();
        int agilite =  (int) spinnerAgilite.getValue();
        int endurance =  (int) spinnerEndur.getValue();
        int victoire =  (int) spinnerNbVict.getValue();

        coo.modifAthlete(1,tfNom.getText(), tfPrenom.getText(), role, force, agilite, endurance, victoire, tfPays.getText());
    }

    @FXML
    private void handleRetour(ActionEvent event) throws IOException {
        vue.modeAdminPrincipale();
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

    public TextField getTfPrenom() {
        return tfPrenom;
    }

    public void setTfPrenom(TextField tfPrenom) {
        this.tfPrenom = tfPrenom;
    }

    public RadioButton getRbFemme() {
        return rbFemme;
    }

    public void setRbFemme(RadioButton rbFemme) {
        this.rbFemme = rbFemme;
    }

    public RadioButton getRbHomme() {
        return rbHomme;
    }

    public void setRbHomme(RadioButton rbHomme) {
        this.rbHomme = rbHomme;
    }

    public Spinner getSpinnerForce() {
        return spinnerForce;
    }

    public void setSpinnerForce(Spinner spinnerForce) {
        this.spinnerForce = spinnerForce;
    }

    public Spinner getSpinnerAgilite() {
        return spinnerAgilite;
    }

    public void setSpinnerAgilite(Spinner spinnerAgilite) {
        this.spinnerAgilite = spinnerAgilite;
    }

    public Spinner getSpinnerEndur() {
        return spinnerEndur;
    }

    public void setSpinnerEndur(Spinner spinnerEndur) {
        this.spinnerEndur = spinnerEndur;
    }

    public Spinner getSpinnerNbVict() {
        return spinnerNbVict;
    }

    public void setSpinnerNbVict(Spinner spinnerNbVict) {
        this.spinnerNbVict = spinnerNbVict;
    }

    public TextField getTfPays() {
        return tfPays;
    }

    public void setTfPays(TextField tfPays) {
        this.tfPays = tfPays;
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

    public Button getBoutonSup() {
        return boutonSup;
    }

    public void setBoutonSup(Button boutonSup) {
        this.boutonSup = boutonSup;
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
