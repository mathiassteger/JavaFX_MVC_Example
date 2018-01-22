package controller;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import model.Model;


public class MainController {
    private Model model;
    @FXML
    public Parent embButton;
    @FXML
    public ButtonController embButtonController;
    @FXML
    public Parent embLabel;
    @FXML
    public LabelController embLabelController;

    /*
        You can name the above parent whatever you want, it has to be the same as the name in the MainView include fx:id though,
        and the ButtonController below it MUST have the name of the view (<buttonTest>) as prefix and <Controller> as Postfix.
        Otherwise, you will get NullPointerExceptions in the initialize function, since the controller is null.
     */

    public void setModel(Model model){
        this.model = model;
        model.addObserver(embButtonController);
        model.addObserver(embLabelController);
    }

    @FXML
    public void initialize(){
        embButtonController.setParentMainController(this);
        embLabelController.setParentMainController(this);
    }

    public Model model(){
        return this.model;
    }
}
