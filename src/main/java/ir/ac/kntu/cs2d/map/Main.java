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
            int c,i=1,j=1,counter=0;
            List<Rectangle> rectangleList=new ArrayList<>();
            while ((c = inputStream.read()) != -1) {
                System.out.println("1");
                rectangleList.add(new Rectangle(1, 1));
                rectangleList.get(counter).setX(i);
                rectangleList.get(counter).setY(j);
                i++;
                switch (c){
                    case 0:
                        System.out.println("2");
                        rectangleList.get(counter).setFill(Color.MINTCREAM);
                        break;
                    case 1:
                        rectangleList.get(counter).setFill(Color.WHITE);
                        break;
                    case 2:
                        rectangleList.get(counter).setFill(Color.BROWN);
                        break;
                    case 3:
                        rectangleList.get(counter).setFill(Color.ORANGE);
                        break;
                    case 4:
                        rectangleList.get(counter).setFill(Color.RED);
                        break;
                    case 5:
                        rectangleList.get(counter).setFill(Color.GRAY);
                        break;
                    default:
                        rectangleList.get(counter).setFill(Color.YELLOW);
                        break;
                }
                System.out.println("3");
                root.getChildren().add(rectangleList.get(counter));
                counter++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root, 1350, 800, Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    public static void main(String[] args) {
            launch(args);
    }
}
