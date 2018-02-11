package calculator;

import java.util.Scanner;

public class Wczytywanie {

    double wczytajBrutto;
    double wczytajKoszt;

    public double WczytajBrutto(){

        System.out.println("Podaj kwotę brutto: " );
        Scanner odczytBrutto = new Scanner(System.in);
        double kwotaBrutto = odczytBrutto.nextDouble();
        return kwotaBrutto;

    }

    public double WczytajKoszt(){

        System.out.println("Czy pracujesz w miejscu zamieszkania? 1 - tak, 2 - nie");
        Scanner odczytKoszty = new Scanner(System.in);
        double koszty = odczytKoszty.nextDouble();

        while (koszty != 1 && koszty != 2){
                  System.out.println("Podaj poprawną wartość!");
                  koszty = odczytKoszty.nextDouble();
             }

        return koszty;

    }

    public Wczytywanie() {
        this.wczytajBrutto = WczytajBrutto();
        this.wczytajKoszt = WczytajKoszt();
    }


}

