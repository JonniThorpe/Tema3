/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandomiscontroles;

import MisControles.MiControl;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class UsandoMisControles extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       BorderPane bpane = new BorderPane();
       Label etiqueta = new Label();
       
       MiControl mcontrol = new MiControl();
       mcontrol.setMaxHeight(100);
       mcontrol.setMaxWidth(100);
       mcontrol.setOnAction(e ->{
           
           //int contador = 1;
           //if(contador == 1){
           etiqueta.setText("Estoy pulsado en la Región");
           
           //contador = contador + 1;
           //}
       });
       bpane.setBottom(etiqueta);
       bpane.setCenter(mcontrol);
       StackPane root = new StackPane();
       
       Scene scene = new Scene(bpane, 400, 400) ;
       primaryStage.setTitle("Usando control");
       primaryStage.setScene(scene);
       primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
