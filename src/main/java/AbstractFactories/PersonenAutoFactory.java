package AbstractFactories;


import Producten.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;


public  class PersonenAutoFactory extends ProductFactory {


    @Override
    public List<Product> createProduct() {

        ObservableList<Product> autoProducten = FXCollections.observableArrayList();
        Product a1 = new PersonenAuto( 101,"Seat Leon","PersonenAuto",55,false,1200,2000);
        Product a2 = new PersonenAuto( 102,"Seat Ibiza","PersonenAuto",50,false,1100,1400);
        Product a3 = new PersonenAuto( 103,"Seat Tarraco","PersonenAuto",75,false,1500,2000);

        autoProducten.add(a1);
        autoProducten.add(a2);
        autoProducten.add(a3);

        return  autoProducten;
    }
}