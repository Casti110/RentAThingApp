package Producten;

public class PersonenAuto extends Product {


    private final int gewicht;
    private final  int motorinhoud;

    public PersonenAuto(int productId, String merk, String soort, double huurPrijs, boolean statusVerhuur, int gewicht, int motorinhoud) {
        super(productId, merk, soort, huurPrijs, statusVerhuur);
        this.gewicht = gewicht;
        this.motorinhoud = motorinhoud;
    }

    public int getGewicht() {
        return gewicht;
    }

    public int getMotorinhoud() {
        return motorinhoud;
    }
}
