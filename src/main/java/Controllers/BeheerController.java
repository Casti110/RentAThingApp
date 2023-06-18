package Controllers;

import javafx.fxml.FXML;

import static Controllers.RentAThingApp.setScene;

public class BeheerController {

    @FXML
    public void wisselNaarHoofdmenu(){
        setScene("HoofdMenuScreen");
    }
}
