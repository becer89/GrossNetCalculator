package calculatorTest;

import calculator.SkladkaZus;
import org.junit.Test;

public class SkladkaZusTest {

    double kwotaBrutto = 2500;

    @Test

    public void skladkiZusTest1() {


        SkladkaZus test = new SkladkaZus();
        System.out.println(test.SkladkaZus(kwotaBrutto));
        assert test.SkladkaZus(kwotaBrutto) == 342.75;
    }

    @Test

    public void skladkiZusTest2() {


        SkladkaZus test = new SkladkaZus();
        System.out.println(test.SkladkaZus(kwotaBrutto));
        assert test.SkladkaZus(kwotaBrutto) != 342.76;
    }





}
