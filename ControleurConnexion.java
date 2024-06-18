import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * Contrôleur à activer lorsque l'on clique sur le bouton info
 */
public class ControleurConnexion implements EventHandler<ActionEvent> {

    private IUTO appli;

    /**
     * @param p vue du jeu
     */
    public ControleurConnexion(IUTO appli) {
        this.appli = appli;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        
    }
}
