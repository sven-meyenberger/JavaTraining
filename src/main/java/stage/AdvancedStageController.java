package stage;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Popup;
import javafx.stage.Window;

public class AdvancedStageController {

    @FXML
    private AnchorPane root;

    private double startMoveX = -1, startMoveY = -1;
    private Boolean dragging = false;
    private Rectangle moveTrackingRect;
    private Popup moveTrackingPopup;

    @FXML
    public void close(MouseEvent evt) {
        ((Label) evt.getSource()).getScene().getWindow().hide();
    }

    @FXML
    public void startMoveWindow(MouseEvent evt) {
        startMoveX = evt.getScreenX();
        startMoveY = evt.getScreenY();
    }


    @FXML
    public void moveWindow(MouseEvent evt) {
        /*double endMoveX = evt  .getScreenX();
        double endMoveY = evt.getScreenY();

        Window w = root.getScene().getWindow();

        double stageX = w.getX();
        double stageY = w.getY();

        w.setX(stageX + (endMoveX - startMoveX));
        w.setY(stageY + (endMoveY - startMoveY));*/
    }

    @FXML
    public void endMoveWindow(MouseEvent evt) {
        double endMoveX = evt.getScreenX();
        double endMoveY = evt.getScreenY();

        Window w = root.getScene().getWindow();

        double stageX = w.getX();
        double stageY = w.getY();

        w.setX(stageX + (endMoveX - startMoveX));
        w.setY(stageY + (endMoveY - startMoveY));
        resetMoveOperation();
    }

    private void resetMoveOperation() {
        startMoveX = 0;
        startMoveY = 0;
        dragging = false;
        moveTrackingRect = null;
    }

    @FXML
    public void mouseClicked(MouseEvent mouseEvent) {
        System.err.println("getX(): " + mouseEvent.getX() + "/ getSceneX(): " + mouseEvent.getSceneX() + " / getScreenX(): " + mouseEvent.getScreenX()) ;
        System.err.println("getY(): " + mouseEvent.getY() + "/ getSceneY(): " + mouseEvent.getSceneY() + " / getScreenY(): " + mouseEvent.getScreenY()) ;
    }
}