package calculatorTest;

import calculator.SkladkaZdrowotna;
import calculator.SkladkaZus;
import org.junit.Test;

public class SkladkaZdrowotnaTest {

    double kwotaBrutto = 2500;

    @Test

    public void ZdrowotnaTest1(){

        SkladkaZdrowotna test1 = new SkladkaZdrowotna();
        SkladkaZus test2 = new SkladkaZus();

        System.out.println(test1.SkladkaZdrowotna(test2.SkladkaZus(kwotaBrutto), kwotaBrutto));
        assert test1.SkladkaZdrowotna(test2.SkladkaZus(kwotaBrutto), kwotaBrutto) == 194.1525;
    }

}
