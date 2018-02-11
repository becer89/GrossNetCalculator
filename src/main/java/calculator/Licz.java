package calculator;


public class Licz {

     double netto;
     double kosztPrzychodu;
     double podatekDochodowy;
     double skladkaZdrowotna;
     double skladkaZdrowotnaPodatek;
     double skladkaZus;

     Wczytywanie wczytaj = new Wczytywanie();
     double kwotaBrutto = wczytaj.wczytajBrutto  ;
     double koszty = wczytaj.wczytajKoszt;


    public double KosztPrzychodu(Double koszty){


        if (koszty == 1) {
            double kosztPrzychodu = 112.25;
            return kosztPrzychodu;
        } else if (koszty == 2) {
            double kosztPrzychodu = 139.06;
            return kosztPrzychodu;
        }else
            System.out.println("Podaj poprawną wartość!");
        return kosztPrzychodu;

    }

    public Double KwotaNetto(Double kwotaBrutto, Double SkladkaZus, Double SkladkaZdrowotna, Double PodatekDochodowy ){

        double netto = kwotaBrutto - (SkladkaZus + SkladkaZdrowotna + PodatekDochodowy);
        return netto;

    }
    public Double PodatekDochodowy(Double kwotaBrutto, Double SkladkaZus, Double KosztPrzychodu, Double SkladkaZdrowotnaPodatek) {


        double przychod = kwotaBrutto -  SkladkaZus - KosztPrzychodu;
        double podatekDochodowy = przychod * 0.18 - 46.33 - SkladkaZdrowotnaPodatek;
        return podatekDochodowy;



    }
    public Double SkladkaZdrowotna(Double SkladkaZus, Double kwotaBrutto){
        double podstawaZdrowotna = kwotaBrutto - SkladkaZus;
        double skladkaZdrowotna = podstawaZdrowotna * 0.09;
        return skladkaZdrowotna;

    }
    public Double SkladkaZdrowotnaPodatek(Double SkladkaZus, Double kwotaBrutto){
        double podstawaZdrowotna = kwotaBrutto - SkladkaZus;
        double skladkaZdrowotnaPodatek = podstawaZdrowotna * 0.0775;
        return skladkaZdrowotnaPodatek;

    }
    public Double SkladkaZus(Double kwotaBrutto) {


        Double skladkaEmerytalna = kwotaBrutto * 0.0976;
        Double skladkaRentowa = kwotaBrutto * 0.015;
        Double skladkaChorobowa = kwotaBrutto * 0.0245;
        Double skladkaZus = skladkaChorobowa+skladkaEmerytalna+skladkaRentowa;
        return skladkaZus;


    }


    public Licz() {

        this.netto = KwotaNetto(kwotaBrutto,SkladkaZus(kwotaBrutto),SkladkaZdrowotna(SkladkaZus(kwotaBrutto),kwotaBrutto),PodatekDochodowy(kwotaBrutto,SkladkaZus(kwotaBrutto),KosztPrzychodu(koszty),SkladkaZdrowotnaPodatek(SkladkaZus(kwotaBrutto),kwotaBrutto)));
        this.kosztPrzychodu = KosztPrzychodu(koszty);
        this.podatekDochodowy = PodatekDochodowy(kwotaBrutto, SkladkaZus(kwotaBrutto),KosztPrzychodu(koszty),SkladkaZdrowotnaPodatek(SkladkaZus(kwotaBrutto),kwotaBrutto));
        this.skladkaZdrowotna = SkladkaZdrowotna(SkladkaZus(kwotaBrutto), kwotaBrutto);
        this.skladkaZdrowotnaPodatek = SkladkaZdrowotnaPodatek(SkladkaZus(kwotaBrutto), kwotaBrutto);
        this.skladkaZus = SkladkaZus(kwotaBrutto);

    }


}
