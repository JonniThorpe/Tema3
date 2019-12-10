/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 *
 * @author usuario
 */
public class VisorAnimalesController implements Initializable {
    
    private Label label;
    @FXML
    private ImageView img;
    
    
    ObservableList<Animales> data = FXCollections.observableArrayList();
    @FXML
    private ListView<String> listAnimales;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> data = 
                FXCollections.observableArrayList("Gato","Perro","Pajaro");
        
        listAnimales.setItems(data);
        
        listAnimales.getSelectionModel().selectedItemProperty().addListener(
            (ObservableValue<? extends String> ov, String old_val, 
                String new_val) -> {
                    if(new_val == "Gato"){
                        img.setImage(new Image("Resources/gato.jpg"));
                    }
                    if(new_val == "Perro"){
                        img.setImage(new Image("Resources/perro.jpg"));
                    }
                    if(new_val == "Pajaro"){
                        img.setImage(new Image("Resources/pajaro.jpg"));
                    }
        });
        
        
    }    
    
}
