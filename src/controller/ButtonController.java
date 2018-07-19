package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.Model;

import java.util.Observable;
import java.util.Observer;

public class ButtonController {
    @FXML Button button1;
    MainController parentMainController;

    public void setParentMainController(MainController parentMainController){
        this.parentMainController = parentMainController;
    }

    @FXML
    public void onNothing(){
        Model.getInstance().increaseRadioInteger();
    }
}
