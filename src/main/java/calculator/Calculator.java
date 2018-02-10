package calculator;
import java.util.Scanner;

import static java.lang.StrictMath.round;

public class Calculator {
    public static void main(String[] args) {
        // pobieranie kwoty brutto
        System.out.println("Podaj kwotę brutto: ");
        Scanner odczytBrutto = new Scanner(System.in);
        double kwotaBrutto = odczytBrutto.nextDouble();
        // sprawdzanie miejsca zamieszkania (koszt uzyskania przychodu)
        System.out.println("Czy pracujesz w miejscu zamieszkania? 1 - tak, 2 - nie");
        Double koszty;
        Scanner odczytKoszty = new Scanner(System.in);
        koszty = odczytKoszty.nextDouble();

        while (koszty != 1 && koszty != 2){
            System.out.println("Podaj poprawną wartość!");
            koszty = odczytKoszty.nextDouble();
        }

        Licz policz = new Licz();

        Double skladkaZus = policz.skladkaZus;
        Double kwotaNetto = policz.netto;
        Double skladkaZdrowotna  = policz.skladkaZdrowotna;
        Double kosztPrzychodu = policz.kosztPrzychodu;
        Double podatekDochodowy = policz.podatekDochodowy;


        System.out.println("Składka na ZUS wynosi: "+ round(skladkaZus)+" zł.");
        System.out.println("Składka na ubezpieczenie zdrowotne wynosi: "+ round(skladkaZdrowotna)+ " zł.");
        System.out.println("Koszt uzyskania przychodu wynosi: "+ round(kosztPrzychodu)+ " zł.");
        System.out.println("Podatek dochodowy wynosi: "+ round(podatekDochodowy)+ " zł.");
        System.out.println("Kwota netto wynosi: "+  round(kwotaNetto)+ " zł.");








    }

}
