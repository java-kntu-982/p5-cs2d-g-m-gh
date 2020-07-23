//package ir.ac.kntu.cs2d.map;
//
//import java.io.*;
//import java.util.Timer;
//import java.util.TimerTask;
//import javafx.animation.AnimationTimer;
//import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.event.EventHandler;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.input.KeyCode;
//import javafx.scene.input.KeyEvent;
//import javafx.scene.input.MouseButton;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.*;
//import javafx.scene.shape.Rectangle;
//import javafx.scene.text.Font;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//import java.util.Timer;
//import java.util.TimerTask;
//public class Main extends Application{
//    @Override
//    public void start(Stage primaryStage) {
//        //TODO: Assume that your program starts from this method
//        Pane root = new Pane();
//        Rectangle rect=new Re
//
//
//        polygon1.setFill(Color.GREEN);
//        polygon1.setStroke(Color.BLACK);
//        root.getChildren().addAll(polygon1,polygon2,polygon3,polygon4,polygon5,polygon6,polygon7,polygon8,polygon9,polygon10,polygon11,polygon12);
//        Scene scene = new Scene(root, 800, 800, Color.WHITE);
//
//        primaryStage.setScene(scene);
//        primaryStage.setResizable(false);
//        primaryStage.show();
//
//
//    }
//
//    @Override
//    public void init() {
//        System.out.println("Initializing...");
//    }
//
//    @Override
//    public void stop() {
//        System.out.println("Closing....");
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//    public static void main(String[] args) throws IOException {
//
//        FileReader inputStream = null;
//        FileWriter outputStream = null;
//
//        try {
//            inputStream = new FileReader("file.txt");
//
//            int c;
//            while ((c = inputStream.read()) != -1) {
//                outputStream.write(c);
//            }
//        } finally {
//            if (inputStream != null) {
//                inputStream.close();
//            }
//        }
//    }
//
//}
//
//
//
//
