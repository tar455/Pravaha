
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


class PravahaMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello, Pravaha!");
        Scene scene = new Scene(new StackPane(label), 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Pravaha");
        primaryStage.show();
    }
    public static void main(String[] args) {
        System.out.println("Hello, Pravaha!");
        launch(args);
    }
}
 /** 
 The  PravahaMain  class is the entry point of the application. It contains the  main  method, which is the starting point of the application. The  main  method is the first method that is called when the application is run. 
 The  main  method prints the message  Hello, Pravaha!  to the console. 
 Step 3: Compile the Java Program 
 To compile the Java program, run the following command: 
 javac bin/PravahaMain.java
 
 This command compiles the  PravahaMain.java  file and generates a  PravahaMain.class  file in the  bin  directory. 
 Step 4: Run the Java Program 
 To run the Java program, run the following command: 
 java -cp bin PravahaMain
 
 This command runs the  PravahaMain  class and prints the message  Hello, Pravaha!  to the console. 
 Conclusion 
 You now have a basic understanding of how to create a Java project using the command line. You can use this knowledge to create more complex Java projects. 
 Pravaha is a Java-based event streaming platform that allows you to build real-time data pipelines. It provides a simple and easy-to-use API for building event-driven applications. 
 To learn more about Pravaha, visit the  Pravaha website. 
 Pravaha is a Java-based event streaming platform that allows you to build real-time data pipelines. It provides a simple and easy-to-use API for building event-driven applications. 
 In this tutorial, you will learn how to install Pravaha on Ubuntu 20.04. 
 Step 1: Install Java 
 Pravaha requires Java 8 or later to run. You can install Java using the following command: 
 sudo apt update
 */