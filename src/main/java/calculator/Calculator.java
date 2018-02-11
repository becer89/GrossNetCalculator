package calculator;

public class Calculator {

    public static void main(String[] args) {


        Licz policz = new Licz();


        System.out.println("Kwota brutto wynosi: "+  policz.kwotaBrutto+ " zł.");
        System.out.println("Składka na ZUS wynosi: "+ policz.skladkaZus+" zł.");
        System.out.println("Składka na ubezpieczenie zdrowotne wynosi: "+ policz.skladkaZdrowotna+ " zł.");
        System.out.println("Koszt uzyskania przychodu wynosi: "+ policz.kosztPrzychodu+ " zł.");
        System.out.println("Podatek dochodowy wynosi: "+ policz.podatekDochodowy+ " zł.");
        System.out.println("Kwota netto wynosi: "+  policz.netto + " zł.");


    }

}
