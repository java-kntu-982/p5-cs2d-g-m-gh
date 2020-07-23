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
            int c,i=0,j=0,counter=0;
            List<Rectangle> rectangleList=new ArrayList<>();
            while ((c = inputStream.read()) != -1) {
                if ((char) c == '0' || (char) c == '1' || (char) c == '2' || (char) c == '3' || (char) c == '4' || (char) c == '5' || (char) c == '6'|| (char) c == '7') {
                    rectangleList.add(new Rectangle(5, 5));
                    rectangleList.get(counter).setX(i);
                    rectangleList.get(counter).setY(j);
                    i = i+ 5 ;
                    switch ((char) c) {
                        case '0':
                            rectangleList.get(counter).setFill(Color.PEACHPUFF);
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
                        case '6':
                            rectangleList.get(counter).setFill(Color.PINK);
                            break;
                        case '7':
                            rectangleList.get(counter).setFill(Color.SKYBLUE);
                            break;
                    }
                    root.getChildren().add(rectangleList.get(counter));
                    counter++;
                    if (counter % 165 == 0) {
                        j = j + 5;
                        i = 0;
                    }
                }
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
