package Controllers;

import Producten.Product;
import Producten.Voorraad;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

import static Controllers.RentAThingApp.setScene;

public class OverzichtController implements Initializable {

    @FXML
    public TableView<Product> productTable;

    @FXML
    public TableColumn<Product,String> merkColumn;

    @FXML
    public TableColumn<Product,String> soortColumn;
    @FXML
    public TableColumn<Product, String> statusVerhuurdcolumn;





    public void setProductTable(ObservableList<Product> products,
                                TableView<Product> productTable,

                                TableColumn<Product, String> merkColumn,
                                TableColumn<Product, String> soortColumn,
                                TableColumn<Product, String> statusVerhuurdcolumn){

        productTable.setItems(products);


        merkColumn.setCellValueFactory(new PropertyValueFactory<>("Merk"));
        soortColumn.setCellValueFactory(new PropertyValueFactory<>("Soort"));
        statusVerhuurdcolumn.setCellValueFactory(new PropertyValueFactory<>("Status"));


    }

    public void displayData(ObservableList<Product> products){


        setProductTable(products,productTable,merkColumn,soortColumn, statusVerhuurdcolumn);


    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        displayData(Voorraad.getAlleProducten());

    }



    public void changeToMainScreen(ActionEvent event) {
        setScene("HoofdMenuScreen");
    }
}
