package calculator;

public class SkladkaZdrowotnaPodatek {

    public double SkladkaZdrowotnaPodatek(double SkladkaZus, double kwotaBrutto){
        double podstawaZdrowotna = kwotaBrutto - SkladkaZus;
        double skladkaZdrowotnaPodatek = podstawaZdrowotna * 0.0775;
        return skladkaZdrowotnaPodatek;

    }
}
