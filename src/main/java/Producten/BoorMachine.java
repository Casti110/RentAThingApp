package Producten;

public class BoorMachine extends Product {


    private String type = "";

    public BoorMachine(int productId, String merk, String soort, double huurPrijs, boolean statusVerhuur, String type) {
        super( merk, soort, huurPrijs, statusVerhuur);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
