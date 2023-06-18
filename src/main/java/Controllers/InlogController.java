package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

import static Controllers.RentAThingApp.fxmlLoader;
import static Controllers.RentAThingApp.setScene;



public class InlogController {
    @FXML
    public TextField usernameField;
    @FXML
    public PasswordField passwordField;

    @FXML
    public Button loginButton;

    @FXML
    public void onLoginButtonClick() {

        setScene("HoofdMenuScreen");
    }


}