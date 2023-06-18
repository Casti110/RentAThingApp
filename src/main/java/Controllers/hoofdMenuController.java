package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

import static Controllers.RentAThingApp.setScene;

public class hoofdMenuController {

    @FXML
    private Button overzicht;
    @FXML
    private Button beheer;
    @FXML
    private Button uitloggen;

    @FXML
    public void overzichtClicked() {
        setScene("OverzichtScreen");
    }

    @FXML
    public void beheerClicked() {
        setScene("BeheerScreen");
    }

    @FXML
    public void uitlogClicked() {
        setScene("LoginScreen");
    }



}
