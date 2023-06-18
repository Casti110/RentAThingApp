package AbstractFactories;

import Producten.*;


public abstract class ProductFactory  {







    public static final ProductFactory PERSONEN_AUTO = new PersonenAutoFactory();
    public static final ProductFactory VRACHT_AUTO = new VrachtAutoFactory();
    public static final ProductFactory BOOR_MACHINE = new BoorMachineFactory();



    public abstract Product createProduct();
}
