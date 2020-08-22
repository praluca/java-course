package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    private CheckBox ourCheckBox;

    public void initialize() {
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }
    @FXML
    public void onButtonClicked(ActionEvent e) {
        if(e.getSource().equals(helloButton)) {
            System.out.println("Hello, " + nameField.getText());
        } else if(e.getSource().equals(byeButton)) {
            System.out.println("Bye, " + nameField.getText());
        }
        if(ourCheckBox.isSelected()) {
            nameField.clear();
            helloButton.setDisable(true);
            byeButton.setDisable(true);
        }
//        try {
//            Thread.sleep(10000);
//        }catch (InterruptedException event) {
//
//        }
    }
    @FXML
    public void handleKeyRealesed() {
        String text = nameField.getText();
        boolean disabledButtons = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disabledButtons);
        byeButton.setDisable(disabledButtons);
    }

    public void handleChange() {
        System.out.println("The checkbox is " + (ourCheckBox.isSelected()? "checked":"unchecked"));
    }
}
