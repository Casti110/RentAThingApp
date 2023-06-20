package Producten;

public abstract class Product {

    private final int productId;
    private final String merk;

    private final String soort;
    private final double huurPrijs;
    private final boolean statusVerhuur;


    public Product(int productId, String merk, String soort, double huurPrijs, boolean statusVerhuur) {
        this.productId = productId;
        this.merk = merk;
        this.soort = soort;
        this.huurPrijs = huurPrijs;
        this.statusVerhuur = statusVerhuur;
    }

    public int getProductId() {
        return productId;
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
        if (statusVerhuur){
            System.out.println("Niet op Voorraad");
        }else{
            System.out.println("Op voorraad");
        }
        return statusVerhuur;
    }


}
