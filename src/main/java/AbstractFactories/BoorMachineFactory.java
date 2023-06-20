package AbstractFactories;


import Producten.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class BoorMachineFactory extends ProductFactory {


    @Override
    public List<Product> createProduct() {
        ObservableList<Product> boorMachineProducten = FXCollections.observableArrayList();
        Product a1 = new BoorMachine(1,"Makita","Boormachneine",10,false,"HoutBoor");
        Product a2 = new BoorMachine(2,"BD","Boormachneine",10,false,"BetoonBoor");
        Product a3 = new BoorMachine(3,"Gamma","Boormachneine",10,false,"ijzerBoor");

        boorMachineProducten.add(a1);
        boorMachineProducten.add(a2);
        boorMachineProducten.add(a3);

        return  boorMachineProducten;
    }
}
