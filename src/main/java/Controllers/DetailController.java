package Controllers;

import Producten.PersonenAuto;
import Producten.Product;
import Producten.Voorraad;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import static Controllers.RentAThingApp.setScene;

public class DetailController {

    public Product product;
    @FXML
    public Label merkLabel;


    private VerhuurButton verhuurButton;
    private RetourButton retourButton;

    @FXML
    private void showMerkLabel(){
        merkLabel.setText(product.getMerk());
    }



    public void showOverzicht(ActionEvent event) {
            setScene("OverzichtScreen");
    }
}
