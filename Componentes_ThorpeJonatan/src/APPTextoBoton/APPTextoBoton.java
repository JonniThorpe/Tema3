/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APPTextoBoton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class APPTextoBoton extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        StackPane root = new StackPane();
        
        Scene scene = new Scene(root, 300, 250);
        
        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
