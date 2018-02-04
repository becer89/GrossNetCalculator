package calculator;

public class SkladkaZdrowotna {

    public double SkladkaZdrowotna(double SkladkaZus, double kwotaBrutto){
        double podstawaZdrowotna = kwotaBrutto - SkladkaZus;
        double skladkaZdrowotna = podstawaZdrowotna * 0.09;
        return skladkaZdrowotna;

    }

}
