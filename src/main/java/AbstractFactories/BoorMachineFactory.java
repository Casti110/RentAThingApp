package AbstractFactories;


import Producten.*;

public class BoorMachineFactory extends ProductFactory {


    @Override
    public Product createProduct() {
        return new BoorMachine(2,"Makita","Boormachine",10,false,"cordless");
    }
}
