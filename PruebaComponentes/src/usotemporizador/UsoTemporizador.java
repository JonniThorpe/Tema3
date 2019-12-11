package usotemporizador;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import temporizador.Temporizador;

public class UsoTemporizador extends Application
{
    public static void main(String[] args) 
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception 
    {
        Temporizador temp = new Temporizador();
        temp.setAlignment(Pos.CENTER);
        
        VBox root = new VBox(); 
        root.setPrefSize(200, 100);
        root.setAlignment(Pos.CENTER);
        
        VBox v = new VBox();
        v.getChildren().add(temp);
        
        root.getChildren().add(v);
        Scene scene = new Scene(root); 
        stage.setScene(scene);
        stage.show();
        
    } 
}
