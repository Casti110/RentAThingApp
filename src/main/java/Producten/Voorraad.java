package Producten;

import AbstractFactories.ProductFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Observable;
import java.util.Observer;

public class Voorraad  implements Observer {

    public static  ObservableList<Product> alleProducten = FXCollections.observableArrayList();



    public Voorraad(){

        alleProducten.addAll(ProductFactory.PERSONEN_AUTO.createProduct());
        alleProducten.addAll(ProductFactory.BOOR_MACHINE.createProduct());
        alleProducten.addAll(ProductFactory.VRACHT_AUTO.createProduct());






    }



    public void addProduct(Product producten){
        alleProducten.add(producten);
    }

    public static ObservableList<Product> getAlleProducten() {
        return alleProducten;
    }



    public static void setAlleProducten(ObservableList<Product> alleProducten) {
        Voorraad.alleProducten = alleProducten;
    }

    @Override
    public void update(Observable o, Object arg) {

    }


}
