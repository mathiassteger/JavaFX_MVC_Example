package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import model.Even;
import model.Uneven;

import java.util.Observable;
import java.util.Observer;

public class LabelController implements Observer {
    MainController parentMainController;
    @FXML
    public Label lblMath;

    public void setParentMainController(MainController parentMainController) {
        this.parentMainController = parentMainController;
    }


    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Even) {
            lblMath.setText("Even");
        } else if (arg instanceof Uneven) {
            lblMath.setText("Uneven");
        }
    }
}
