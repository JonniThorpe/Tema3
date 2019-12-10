package APPTextoBoton;

import java.io.IOException;

import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class TextoBotonController extends AnchorPane {
    private TextField textField;
    @FXML
    private TextField textFieldNombre;
    @FXML
    private Button btnGrabarNom;
    @FXML
    private TextField textField1Apellido;
    @FXML
    private Button btnGrabarApell;
    @FXML
    private Label Text1;

    public TextoBotonController(){
        FXMLLoader fxmlLoader = new 
        FXMLLoader(getClass().getResource("TextoBoton.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public String getText() {
        return textProperty().get();
    }

    public void setText(String value) {
        textProperty().set(value);
    }

    public StringProperty textProperty() {
        return textField.textProperty();
    }


    @FXML
    private void OnActionMostrarNom(ActionEvent event) {
    }

    @FXML
    private void OnActionMostrarApel(ActionEvent event) {
    }
    
    public TextField getTextField() {
        return textField;
    }

    public void setTextField(TextField textField) {
        this.textField = textField;
    }

    public TextField getTextFieldNombre() {
        return textFieldNombre;
    }

    public void setTextFieldNombre(TextField textFieldNombre) {
        this.textFieldNombre = textFieldNombre;
    }

    public Button getBtnGrabarNom() {
        return btnGrabarNom;
    }

    public void setBtnGrabarNom(Button btnGrabarNom) {
        this.btnGrabarNom = btnGrabarNom;
    }

    public TextField getTextField1Apellido() {
        return textField1Apellido;
    }

    public void setTextField1Apellido(TextField textField1Apellido) {
        this.textField1Apellido = textField1Apellido;
    }

    public Button getBtnGrabarApell() {
        return btnGrabarApell;
    }

    public void setBtnGrabarApell(Button btnGrabarApell) {
        this.btnGrabarApell = btnGrabarApell;
    }

    public Label getText1() {
        return Text1;
    }

    public void setText1(Label Text1) {
        this.Text1 = Text1;
    }

    public TextoBotonController(TextField textField, TextField textFieldNombre, Button btnGrabarNom, TextField textField1Apellido, Button btnGrabarApell, Label Text1) {
        this.textField = textField;
        this.textFieldNombre = textFieldNombre;
        this.btnGrabarNom = btnGrabarNom;
        this.textField1Apellido = textField1Apellido;
        this.btnGrabarApell = btnGrabarApell;
        this.Text1 = Text1;
    } 

    public Object gettextFieldApellido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getTextFieldApellido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
