package ai.pravaha.ui;

import javafx.scene.web.WebEngine;

public class JSBridge {
    private final WebEngine engine;

    public JSBridge(WebEngine engine) {
        this.engine = engine;
    }

    public void loadURL(String url) {
        engine.load(url);
    }

    public void goBack() {
        engine.executeScript("history.back()");
    }

    public void goForward() {
        engine.executeScript("history.forward()");
    }

    public void reload() {
        engine.reload();
    }

    public String getJSObject() {
        return "({"
                + "loadURL: function(url) { javafx.loadURL(url); },"
                + "goBack: function() { javafx.goBack(); },"
                + "goForward: function() { javafx.goForward(); },"
                + "reload: function() { javafx.reload(); }"
                + "})";
    }
}
