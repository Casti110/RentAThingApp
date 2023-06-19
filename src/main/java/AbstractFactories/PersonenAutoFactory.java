package AbstractFactories;


import Producten.*;


public  class PersonenAutoFactory extends ProductFactory {



    @Override
    public Product createProduct() {
        return new PersonenAuto("Seat Leon","PersonenAuto",55.0,false,1600,1600);
    }
}
