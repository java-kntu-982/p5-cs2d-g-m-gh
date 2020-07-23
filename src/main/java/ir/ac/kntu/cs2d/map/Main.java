package ir.ac.kntu.cs2d.map;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main extends Application {

    public void start(Stage primaryStage) {
        Pane root = new Pane();
        FileReader inputStream = null;
        try {
            inputStream = new FileReader("map.txt");
            int c,i=1;
            while ((c = inputStream.read()) != -1) {
                //TODO
                if(c==1) {
                    Rectangle rectangle = new Rectangle(1, 1);
                    rectangle.setFill(Color.RED);
                    rectangle.setX(i);
                    rectangle.setY(i);
                    i++;
                    root.getChildren().add(rectangle);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root, 800, 800, Color.WHITE);

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    public static void main(String[] args) {
            launch(args);
    }
}
