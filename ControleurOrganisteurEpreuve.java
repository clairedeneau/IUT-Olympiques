import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;

public class ControleurOrganisteurEpreuve {
    
    @FXML
    private ImageView imageProfil;

    @FXML
    private Label lNomOrga;

    @FXML
    private Button bDeconnexion;

    @FXML
    private Button bPageAvant;

    @FXML
    private Label titreOrga;

    @FXML
    private ScrollPane spEpreuves;

    @FXML
    private Button suppEpreuve;

    @FXML
    private Button lanceEpreuve;

    private IUTO vue;

    public ControleurOrganisteurEpreuve(IUTO vue) {
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
            vue.modeOrganisateurAccueil();
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

    public Button getbPageAvant() {
        return bPageAvant;
    }

    public void setbPageAvant(Button bPageAvant) {
        this.bPageAvant = bPageAvant;
    }

    public Label getTitreOrga() {
        return titreOrga;
    }

    public void setTitreOrga(Label titreOrga) {
        this.titreOrga = titreOrga;
    }

    public ScrollPane getSpEpreuves() {
        return spEpreuves;
    }

    public void setSpEpreuves(ScrollPane spEpreuves) {
        this.spEpreuves = spEpreuves;
    }

    public Button getSuppEpreuve() {
        return suppEpreuve;
    }

    public void setSuppEpreuve(Button suppEpreuve) {
        this.suppEpreuve = suppEpreuve;
    }

    public Button getLanceEpreuve() {
        return lanceEpreuve;
    }

    public void setLanceEpreuve(Button lanceEpreuve) {
        this.lanceEpreuve = lanceEpreuve;
    }

    public IUTO getVue() {
        return vue;
    }

    public void setVue(IUTO vue) {
        this.vue = vue;
    }

    
}
