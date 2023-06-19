package Producten;

public class PersonenAuto extends Product {


    private  int gewicht;
    private   int motorinhoud;

    public PersonenAuto(String merk, String soort, double huurPrijs, boolean statusVerhuur, int gewicht, int motorinhoud) {
        super( merk, soort, huurPrijs, statusVerhuur);
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
