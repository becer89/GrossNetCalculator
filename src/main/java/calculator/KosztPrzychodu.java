package calculator;

public class KosztPrzychodu {



    public double KosztPrzychodu(double koszty){

        double a = 0;
        if (koszty == 1)  {
             a = 112.25;
        }
        else if (koszty == 2)  {
             a = 139.06;
        }
        else System.out.println("nie podano poprawnej wartości");
        return a;
    }

}
