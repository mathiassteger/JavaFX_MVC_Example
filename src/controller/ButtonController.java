package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.util.Observable;
import java.util.Observer;

public class ButtonController implements Observer{
    @FXML Button button1;
    MainController parentMainController;

    public void setParentMainController(MainController parentMainController){
        this.parentMainController = parentMainController;
    }

    @FXML
    public void onNothing(){
        parentMainController.model().increase();
    }


    @Override
    public void update(Observable o, Object arg) {

    }
}
