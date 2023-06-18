package AbstractFactories;


import Producten.*;


public  class PersonenAutoFactory extends ProductFactory {



    @Override
    public Product createProduct() {
        return new PersonenAuto(1,"Seat Leon","PersonenAuto",30,false,1600,1600);
    }
}
