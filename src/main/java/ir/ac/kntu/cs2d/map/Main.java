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
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        FileReader inputStream = null;
        try {
            inputStream = new FileReader("map.txt");
            int c,i=5,j=5,counter=0;
            List<Rectangle> rectangleList=new ArrayList<>();
            while ((c = inputStream.read()) != -1) {
                rectangleList.add(new Rectangle(5, 5));
                rectangleList.get(counter).setX(i);
                rectangleList.get(counter).setY(j);
                i+=5;
                switch ((char)c){
                    case '0':
                        rectangleList.get(counter).setFill(Color.MINTCREAM);
                        break;
                    case '1':
                        rectangleList.get(counter).setFill(Color.WHITE);
                        break;
                    case '2':
                        rectangleList.get(counter).setFill(Color.BROWN);
                        break;
                    case '3':
                        rectangleList.get(counter).setFill(Color.ORANGE);
                        break;
                    case '4':
                        rectangleList.get(counter).setFill(Color.RED);
                        break;
                    case '5':
                        rectangleList.get(counter).setFill(Color.GRAY);
                        break;
                    default:
                        break;
                }
                root.getChildren().add(rectangleList.get(counter));
                counter++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root, 825, 525, Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
