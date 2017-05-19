package stage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AdvancedStage extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent parent = FXMLLoader.load(getClass().getResource("/Window.fxml"));
        Scene scene;

        String osName = System.getProperty("os.name");
        if( osName != null && osName.startsWith("Windows") ) {
            scene = (new Shadow()).getShadowScene(parent);
            primaryStage.initStyle(StageStyle.TRANSPARENT);

        } else {
            scene = new Scene(parent);
            primaryStage.initStyle(StageStyle.UNDECORATED);
        }

        scene.getStylesheets().add("/css.css");
        primaryStage.setTitle("Test");
        primaryStage.setScene( scene );
        primaryStage.setMinHeight(200.0d);
        primaryStage.setMinWidth(300.0d);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
