package Producten;

public abstract class Product {


    String merk;

    String soort;
    double huurPrijs;
    boolean statusVerhuur;


    public Product( String merk, String soort, double huurPrijs, boolean statusVerhuur) {

        this.merk = merk;
        this.soort = soort;
        this.huurPrijs = huurPrijs;
        this.statusVerhuur = statusVerhuur;
    }



    public String getMerk() {
        return merk;
    }

    public String getSoort() {
        return soort;
    }

    public double getHuurPrijs() {
        return huurPrijs;
    }

    public boolean isStatusVerhuur() {
        return statusVerhuur;
    }


}
