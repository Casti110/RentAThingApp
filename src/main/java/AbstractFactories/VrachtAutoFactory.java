package AbstractFactories;

import Producten.Product;
import Producten.VrachtAuto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class VrachtAutoFactory extends ProductFactory {


    @Override
    public List<Product> createProduct() {

        ObservableList<Product> vrachtAutosProducten = FXCollections.observableArrayList();
        Product a1 = new VrachtAuto( 11,"Daf NP","Vrachtauto",55,false,1200,2000);
        Product a2 = new VrachtAuto( 12,"Mercedes Sprinter","Vrachtauto",50,false,1100,1400);
        Product a3 = new VrachtAuto( 13,"Volkswagen Crafter","Vrachtauto",75,false,1500,2000);

        vrachtAutosProducten.add(a1);
        vrachtAutosProducten.add(a2);
        vrachtAutosProducten.add(a3);

        return vrachtAutosProducten;
    }
}
