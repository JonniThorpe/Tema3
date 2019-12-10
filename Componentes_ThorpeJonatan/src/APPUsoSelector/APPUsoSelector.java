/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APPUsoSelector;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

/**
 *
 * @author usuario
 */
public class APPUsoSelector extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        /*
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        */
        StackPane root = new StackPane();
        
        Scene scene = new Scene(root, 500, 500);
        
        //stage.setTitle("Hello World!");
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