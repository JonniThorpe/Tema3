package APPUsoSelector;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ObjectPropertyBase;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 * * * @author
 */
public class SelectorDeslizamiento extends AnchorPane {

    @FXML
    private Button previousButton;
    @FXML
    private Label label;
    @FXML
    private Button nextButton;
    @FXML
    private Button previousButton1;
    @FXML
    private Label label1;
    @FXML
    private Button nextButton1;
    @FXML
    private Label selector;
    @FXML
    private Label text1;
    ArrayList<String> items;
    int selectedIndex;
    int selectedIndex1;
    private boolean repetitive;
    private boolean repetitive1;

    public SelectorDeslizamiento() {

        FXMLLoader fxmlLoader = new 
        FXMLLoader(getClass().getResource("selectordeslizamiento.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

        items = new ArrayList<>();
        selectedIndex = 0;
        previousButton.setOnAction((ActionEvent event) -> {
            setPrevious();
            fireEvent(event);
        });
        nextButton.setOnAction((ActionEvent event) -> {
            setNext();
            fireEvent(event);
        });
             
        previousButton1.setOnAction((ActionEvent event) -> {
            setPrevious1();
            fireEvent(event);
        });
        nextButton1.setOnAction((ActionEvent event) -> {
            setNext1();
            fireEvent(event);
        });
        
        
        selector.setOnMouseClicked((event) -> { 
            System.out.println("Evento lanzado!!");
            text1.setVisible(true);
            //Hacer algo cuando se capture el evento });
        });
        
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
        selectFirst();
    }

    public void setPrevious() {
        updateItem(selectedIndex - 1);
    }
    
    public void setPrevious1() {
        updateItem1(selectedIndex1 - 1);
    }

    public void setNext() {
        updateItem(selectedIndex + 1);
    }
    
    public void setNext1() {
        updateItem1(selectedIndex1 + 1);
    }

    public void selectFirst() {
        updateItem(0);
    }

    private void selectLast() {
        updateItem(items.size() - 1);
    }

    private void updateItem() {
        if (items.isEmpty()) {
            label.setText("Vacio");
        } else {
            if (selectedIndex < 0) {
                if (repetitive) {
                    selectedIndex = items.size() - 1;
                } else {
                    selectedIndex = 0;
                }
            }
            if (selectedIndex >= items.size()) {
                if (repetitive) {
                    selectedIndex = 0;
                } else {
                    selectedIndex = items.size() - 1;
                }
            }
            label.setText(items.get(selectedIndex));
        }
    }
    
    private void updateItem1() {
        if (items.isEmpty()) {
            label1.setText("Vacio");
        } else {
            if (selectedIndex1 < 0) {
                if (repetitive1) {
                    selectedIndex1 = items.size() - 1;
                } else {
                    selectedIndex1 = 0;
                }
            }
            if (selectedIndex1 >= items.size()) {
                if (repetitive1) {
                    selectedIndex1 = 0;
                } else {
                    selectedIndex1 = items.size() - 1;
                }
            }
            label1.setText(items.get(selectedIndex1));
        }
    }

    private void updateItem(int selectedIndex) {
        this.selectedIndex = selectedIndex;
        updateItem();
    }
    private void updateItem1(int selectedIndex) {
        this.selectedIndex1 = selectedIndex;
        updateItem1();
    }

    public void setRepetitive(boolean cyclesThrough) {
        this.repetitive = cyclesThrough;
    }
    
    public void setRepetitive1(boolean cyclesThrough) {
        this.repetitive1 = cyclesThrough;
    }

    public final ObjectProperty<EventHandler<ActionEvent>> onActionProperty() {
        return onAction;
    }

    public final void setOnAction(EventHandler<ActionEvent> value) {
        onActionProperty().set(value);
    }

    public final EventHandler<ActionEvent> getOnAction() {
        return onActionProperty().get();
    }
    private ObjectProperty<EventHandler<ActionEvent>> onAction = new ObjectPropertyBase<EventHandler<ActionEvent>>() {
        @Override
        protected void invalidated() {
            setEventHandler(ActionEvent.ACTION, get());
        }

        @Override
        public Object getBean() {
            return SelectorDeslizamiento.this;
        }

        @Override
        public String getName() {
            return "onAction";
        }
    };
    
    }
