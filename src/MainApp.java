import controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Model;


public class MainApp extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("view/MainView.fxml"));
        Scene scene = new Scene(loader.load());
        primaryStage.setScene(scene);
        MainController mainController = (MainController) loader.getController();
        mainController.setModel(new Model());
        primaryStage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
