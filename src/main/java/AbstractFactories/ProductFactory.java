package AbstractFactories;

import Producten.*;


public abstract class ProductFactory  {





    private String merk;

    private String soort;
    private double huurPrijs;
    private boolean statusVerhuur;
    private String status;



    public static final ProductFactory PERSONEN_AUTO = new PersonenAutoFactory();
    public static final ProductFactory VRACHT_AUTO = new VrachtAutoFactory();
    public static final ProductFactory BOOR_MACHINE = new BoorMachineFactory();



    protected String getMerk(){
        return merk;
    }

    protected String getSoort(){
        return PERSONEN_AUTO.soort;
    }

    protected double getHuurPrijs(){
        return huurPrijs;
    }

    protected boolean getStatusVerhuurd(){
        return statusVerhuur;
    }



    public abstract Product createProduct();
}
