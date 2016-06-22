import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class Main extends Application{

    Stage mainwindow;
    Scene scene1, scene2;
    Label intro = new Label("First Scene");
    Button changeScene= new Button("Scene 2 Change");
    VBox vbox_layout = new VBox(20);
    Button changeScene1= new Button("Scene 1 Change");
    @Override
    public void start(Stage stage)
    StackPane stackpane_layout = new StackPane();

    {
        mainwindow = stage;

        changeScene.setOnAction(e -> mainwindow.setScene(scene2));
        vbox_layout.getChildren().addAll(intro, changeScene);
        scene1 = new Scene(vbox_layout, 200, 200);

        changeScene1.setOnAction(e -> mainwindow.setScene(scene1));
        stackpane_layout.getChildren().add(changeScene1);
        scene2 = new Scene(stackpane_layout, 800, 600);

        mainwindow.setScene(scene1);
        mainwindow.setTitle("THISSSSS");
        mainwindow.show();
    }
}
