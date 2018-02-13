import grp.anon.oriel.Window;
import javafx.application.Application;
import javafx.stage.Stage;

public class Trial1 extends Application {

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Window window = new Window("800X500");
        window.show();
        window.setTitle("Oriel FrameWork");
    }
}