package ai.pravaha.ui;

import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class BrowserController {
    private final WebView webView = new WebView();
    private final WebEngine engine = webView.getEngine();

    public BrowserController() {
        engine.getLoadWorker().stateProperty().addListener((obs, oldState, newState) -> {
            if (newState == javafx.concurrent.Worker.State.SUCCEEDED) {
                engine.executeScript("window.javaAPI = {"
                        + "loadURL: function(url) { javaBridge.loadURL(url); },"
                        + "goBack: function() { javaBridge.goBack(); },"
                        + "goForward: function() { javaBridge.goForward(); },"
                        + "reload: function() { javaBridge.reload(); }"
                        + "};");
            }
        });
        engine.executeScript("var javaBridge = { loadURL: function() {}, goBack: function() {}, goForward: function() {}, reload: function() {} };");

        JSBridge bridge = new JSBridge(engine);
        engine.getLoadWorker().stateProperty().addListener((o, old, state) -> {
            if (state == javafx.concurrent.Worker.State.SUCCEEDED) {
                engine.executeScript("javaBridge = " + bridge.getJSObject());
            }
        });

        // Load React build
        String url = getClass().getResource("/react-pravaha-ui/dist/index.html").toExternalForm();
        engine.load(url);
    }
    public BorderPane getUI() {
        BorderPane pane = new BorderPane();
        pane.setCenter(webView);
        return pane;
    }
}