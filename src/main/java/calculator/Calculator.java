package calculator;
import java.util.Scanner;

import static java.lang.Math.round;


public class Calculator {


    public static void main(String[] args) {

        // pobieranie kwoty brutto
        System.out.println("Podaj kwotę brutto: ");
        Scanner odczytBrutto = new Scanner(System.in);
        double kwotaBrutto = odczytBrutto.nextDouble();

        // sprawdzanie miejsca zamieszkania (koszt uzyskania przychodu)
        System.out.println("Czy pracujesz w miejscu zamieszkania? 1 - tak, 2 - nie");
        Scanner odczytKoszty = new Scanner(System.in);
        Double koszty = odczytKoszty.nextDouble();


        SkladkaZus zus = new SkladkaZus();
        double zusLicz = zus.SkladkaZus(kwotaBrutto);


        SkladkaZdrowotna zdrowotne = new SkladkaZdrowotna();
        double zdrowotneLicz = zdrowotne.SkladkaZdrowotna(zus.SkladkaZus(kwotaBrutto),kwotaBrutto);


        SkladkaZdrowotnaPodatek zdrowotnePodatek = new SkladkaZdrowotnaPodatek();


        KosztPrzychodu koszt = new KosztPrzychodu();
        double kosztLicz = koszt.KosztPrzychodu(koszty);


        PodatekDochodowy podatek = new PodatekDochodowy();
        double podatekLicz = podatek.PodatekDochodowy(kwotaBrutto,zus.SkladkaZus(kwotaBrutto),koszt.KosztPrzychodu(koszty),zdrowotnePodatek.SkladkaZdrowotnaPodatek(zus.SkladkaZus(kwotaBrutto),kwotaBrutto));


        KwotaNetto netto = new KwotaNetto();
        double nettoLicz = netto.KwotaNetto(kwotaBrutto,zus.SkladkaZus(kwotaBrutto),zdrowotne.SkladkaZdrowotna(zus.SkladkaZus(kwotaBrutto),kwotaBrutto),podatek.PodatekDochodowy(kwotaBrutto,zus.SkladkaZus(kwotaBrutto),koszt.KosztPrzychodu(koszty),zdrowotnePodatek.SkladkaZdrowotnaPodatek(zus.SkladkaZus(kwotaBrutto),kwotaBrutto)));





        System.out.println("Składka na ZUS wynosi: "+ round(zusLicz)+" zł.");
        System.out.println("Składka na ubezpieczenie zdrowotne wynosi: "+ round(zdrowotneLicz)+ " zł.");
        System.out.println("Koszt uzyskania przychodu wynosi: "+ round(kosztLicz)+ " zł.");
        System.out.println("Podatek dochodowy wynosi: "+ round(podatekLicz)+ " zł.");
        System.out.println("Kwota netto wynosi: "+  round(nettoLicz)+ " zł.");





    }

}
