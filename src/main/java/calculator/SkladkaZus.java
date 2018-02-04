package calculator;

public class SkladkaZus {


    public double SkladkaZus(double kwotaBrutto) {


        double skladkaEmerytalna = kwotaBrutto * 0.0976;
        double skladkaRentowa = kwotaBrutto * 0.015;
        double skladkaChorobowa = kwotaBrutto * 0.0245;
        return skladkaChorobowa+skladkaEmerytalna+skladkaRentowa;


    }


}
