package AbstractFactories;

import Producten.Product;

import Producten.VrachtAuto;

public class VrachtAutoFactory extends ProductFactory {


    @Override
    public Product createProduct() {
        return new VrachtAuto(3,"Suzuki NPR","Vrachtwagen",100,false,20000,4500);
    }
}
