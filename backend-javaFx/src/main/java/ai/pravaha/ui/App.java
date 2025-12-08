package ai.pravaha.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BrowserController controller = new BrowserController();

        BorderPane root = controller.getUI();
        Scene scene = new Scene(root, 1200, 800);

        stage.setScene(scene);
        stage.setTitle("pravaha");
        stage.show();
    }

}
