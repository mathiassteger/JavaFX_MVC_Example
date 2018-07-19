package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import model.Model;

import java.util.Observable;
import java.util.Observer;

public class LabelController {
    MainController parentMainController;
    @FXML
    public Label lblMath;

    @FXML
    public void initialize() {
        Model.getInstance().getRadioInteger().subscribeToValue(event -> {
            int newValue = (int) event.getNewValue();

            if (newValue % 2 == 0) {
                lblMath.setText("Even");
            } else {
                lblMath.setText("Uneven");
            }
        });
    }

    public void setParentMainController(MainController parentMainController) {
        this.parentMainController = parentMainController;
    }
}
