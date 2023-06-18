package Producten;

public class VrachtAuto extends Product {

    private final int laadvermogen;
    private final int motorinhoud;

    public VrachtAuto(int productId, String merk, String soort, double huurPrijs, boolean statusVerhuur, int laadvermogen, int motorinhoud) {
        super(productId, merk, soort, huurPrijs, statusVerhuur);
        this.laadvermogen = laadvermogen;
        this.motorinhoud = motorinhoud;
    }

    public int getLaadvermogen() {
        return laadvermogen;
    }

    public int getMotorinhoud() {
        return motorinhoud;
    }

    /*@Override
    public double berekenHuurPrijs() {

        return 0.10 * laadvermogen;
    }

    @Override
    public double berekenVerzekeringPrijs() {

        return 0.01 * motorinhoud;
    }*/


}
