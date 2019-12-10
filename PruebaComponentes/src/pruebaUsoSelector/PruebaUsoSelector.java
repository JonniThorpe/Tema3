/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaUsoSelector;

import APPTextoBoton.TextoBotonController;
import APPUsoSelector.SelectorDeslizamiento;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Jonni
 */
public class PruebaUsoSelector extends Application {
    
    @Override
    public void start(Stage stage) {
        SelectorDeslizamiento mcontrol = new SelectorDeslizamiento();
        Pane pane = new Pane();
        StackPane root = new StackPane();
        pane.getChildren().addAll(mcontrol);
        Scene scene = new Scene(pane, 500, 500) ;
        stage.setTitle("Usando control");
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
