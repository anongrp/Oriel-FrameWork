package grp.anon.oriel;

import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Window extends Stage{
    private Stage window;
    private WebView scene;
    public Window() throws Exception{
        window = new Stage();
        scene = new WebView();
        super.setScene(new Scene(scene));
    }
    public Window(String size){
        window = new Stage();
        scene = new WebView();
        WebEngine UIParser = scene.getEngine();
        UIParser.load(getClass().getResource("index.html").toExternalForm());
        size = size.toLowerCase();
        super.setScene(new Scene(scene,getWidth(size),getHeight(size)));
    }
    private int getWidth(String data){
        return Integer.parseInt(data.substring(0,data.indexOf("x")));
    }
    private int getHeight(String data){
        return Integer.parseInt(data.substring(data.indexOf("x")+1,data.length()));
    }
}
