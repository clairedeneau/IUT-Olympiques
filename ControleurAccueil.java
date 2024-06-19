import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControleurAccueil {

    //Fx id de page_accueil
    @FXML
    private Button boutonJournaliste;

    @FXML 
    private Button boutonAdmin;

    @FXML
    private Button boutonOrga;

    private IUTO vue;

    public ControleurAccueil(IUTO vue) {
        this.vue = vue;
    }

    @FXML
    private void init(){};

    @FXML
    private void handleCliquer(ActionEvent event) throws IOException {
            vue.modeConnexion();
    }

    public Button getBoutonJournaliste() {
        return boutonJournaliste;
    }

    public void setBoutonJournaliste(Button boutonJournaliste) {
        this.boutonJournaliste = boutonJournaliste;
    }

    public Button getBoutonAdmin() {
        return boutonAdmin;
    }

    public void setBoutonAdmin(Button boutonAdmin) {
        this.boutonAdmin = boutonAdmin;
    }

    public Button getBoutonOrga() {
        return boutonOrga;
    }

    public void setBoutonOrga(Button boutonOrga) {
        this.boutonOrga = boutonOrga;
    }

    public IUTO getVue() {
        return vue;
    }

    public void setVue(IUTO vue) {
        this.vue = vue;
    }



    
}