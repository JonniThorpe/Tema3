/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatextoboton;

import APPTextoBoton.TextoBotonController;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Jonni
 */
public class PruebaTextoBoton extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        Label etiqueta = new Label("Pulsa botón.. y muestra "
                + "texto en esta etiqueta");
        //Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        TextoBotonController mcontrol = new TextoBotonController();
        
        etiqueta.relocate(30, 180);

        mcontrol.getBtnGrabarNom().setOnMouseClicked(new EventHandler<Event>() {
        @Override
        public void handle(Event event) {
            String nombre = mcontrol.getTextFieldNombre().getText();
            etiqueta.setText("Se ha Grabado " + nombre);
        }
        });
        
        mcontrol.getBtnGrabarApell().setOnMouseClicked(new EventHandler<Event>() {
        @Override
        public void handle(Event event) {
            String apellido = mcontrol.getTextField1Apellido().getText();
            etiqueta.setText("Se ha Grabado " + apellido);
            
        }
        });
        
        StackPane root = new StackPane();
        pane.getChildren().addAll(mcontrol,etiqueta);
        Scene scene = new Scene(pane, 300, 200) ;
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
