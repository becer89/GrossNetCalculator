package calculator;

import static java.lang.StrictMath.round;

public class Calculator {

    public static void main(String[] args) {


        Licz policz = new Licz();


        System.out.println("Kwota brutto wynosi: "+  round(policz.kwotaBrutto)+ " zł.");
        System.out.println("Składka na ZUS wynosi: "+ round(policz.skladkaZus)+" zł.");
        System.out.println("Składka na ubezpieczenie zdrowotne wynosi: "+ round(policz.skladkaZdrowotna)+ " zł.");
        System.out.println("Koszt uzyskania przychodu wynosi: "+ round(policz.kosztPrzychodu)+ " zł.");
        System.out.println("Podatek dochodowy wynosi: "+ round(policz.podatekDochodowy)+ " zł.");
        System.out.println("Kwota netto wynosi: "+  round(policz.netto) + " zł.");


    }

}
