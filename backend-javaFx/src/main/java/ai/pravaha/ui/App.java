package ai.pravaha.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Objects;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.getIcons().add(
                new Image(Objects.requireNonNull(getClass().getResourceAsStream("/image/pravahLogo.png")))
        );
        BrowserController controller = new BrowserController();

        BorderPane root = controller.getUI();
        Scene scene = new Scene(root, 1200, 800);
        stage.setFullScreenExitHint(""); // hides "Press ESC to exit"
        stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        stage.setScene(scene);
        stage.setTitle("pravaha");
        stage.show();
//        stage.setFullScreen(true);
    }

}
