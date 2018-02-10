package calculator;


public class Licz {

     Double netto ;
     Double kosztPrzychodu;
     Double podatekDochodowy;
     Double skladkaZdrowotna;
     Double skladkaZdrowotnaPodatek;
     Double skladkaZus;
     Double kwotaBrutto;
     Double koszty;




    public Double KosztPrzychodu(double koszty){


        double kosztPrzychodu = 0;
        if (koszty == 1) {
            kosztPrzychodu = 112.25;
        } else if (koszty == 2) {
            kosztPrzychodu = 139.06;
        } else System.out.println("Podaj poprawną wartość");
        return kosztPrzychodu;



    }
    public Double KwotaNetto(double kwotaBrutto, double SkladkaZus, double SkladkaZdrowotna, double PodatekDochodowy ){

        double netto = kwotaBrutto - SkladkaZus - SkladkaZdrowotna - PodatekDochodowy;
        return netto;

    }
    public Double PodatekDochodowy(double kwotaBrutto, double SkladkaZus, double KosztPrzychpdu, double SkladkaZdrowotnaPodatek) {


        double przychod = kwotaBrutto -  SkladkaZus - KosztPrzychpdu;
        double podatekDochodowy = przychod * 0.18 - 46.33 - SkladkaZdrowotnaPodatek;
        return podatekDochodowy;



    }
    public Double SkladkaZdrowotna(double SkladkaZus, double kwotaBrutto){
        double podstawaZdrowotna = kwotaBrutto - SkladkaZus;
        double skladkaZdrowotna = podstawaZdrowotna * 0.09;
        return skladkaZdrowotna;

    }
    public Double SkladkaZdrowotnaPodatek(double SkladkaZus, double kwotaBrutto){
        double podstawaZdrowotna = kwotaBrutto - SkladkaZus;
        double skladkaZdrowotnaPodatek = podstawaZdrowotna * 0.0775;
        return skladkaZdrowotnaPodatek;

    }
    public Double SkladkaZus(double kwotaBrutto) {


        double skladkaEmerytalna = kwotaBrutto * 0.0976;
        double skladkaRentowa = kwotaBrutto * 0.015;
        double skladkaChorobowa = kwotaBrutto * 0.0245;
        double skladkaZus = skladkaChorobowa+skladkaEmerytalna+skladkaRentowa;
        return skladkaZus;


    }



    public Licz() {

        this.kwotaBrutto = kwotaBrutto;
        this.netto = KwotaNetto(kwotaBrutto,SkladkaZus(kwotaBrutto), SkladkaZus(kwotaBrutto), PodatekDochodowy(kwotaBrutto,SkladkaZus(kwotaBrutto),KosztPrzychodu(koszty),SkladkaZdrowotnaPodatek(SkladkaZus(kwotaBrutto), kwotaBrutto)));
        this.kosztPrzychodu = KosztPrzychodu(koszty);
        this.podatekDochodowy = PodatekDochodowy(kwotaBrutto, SkladkaZus(kwotaBrutto),KosztPrzychodu(koszty),SkladkaZdrowotnaPodatek(SkladkaZus(kwotaBrutto),kwotaBrutto));        this.skladkaZdrowotna = SkladkaZdrowotna(SkladkaZus(kwotaBrutto), kwotaBrutto);
        this.skladkaZdrowotnaPodatek = SkladkaZdrowotnaPodatek(SkladkaZus(kwotaBrutto), kwotaBrutto);
        this.skladkaZus = SkladkaZus(kwotaBrutto);
        this.skladkaZdrowotna = SkladkaZdrowotna(SkladkaZus(kwotaBrutto), kwotaBrutto);

    }

    public Double getNetto() {
        return netto;
    }

    public void setNetto(Double netto) {
        this.netto = netto;
    }

    public Double getKosztPrzychodu() {
        return kosztPrzychodu;
    }

    public void setKosztPrzychodu(Double kosztPrzychodu) {
        this.kosztPrzychodu = kosztPrzychodu;
    }

    public Double getPodatekDochodowy() {
        return podatekDochodowy;
    }

    public void setPodatekDochodowy(Double podatekDochodowy) {
        this.podatekDochodowy = podatekDochodowy;
    }

    public Double getSkladkaZdrowotna() {
        return skladkaZdrowotna;
    }

    public void setSkladkaZdrowotna(Double skladkaZdrowotna) {
        this.skladkaZdrowotna = skladkaZdrowotna;
    }

    public Double getSkladkaZdrowotnaPodatek() {
        return skladkaZdrowotnaPodatek;
    }

    public void setSkladkaZdrowotnaPodatek(Double skladkaZdrowotnaPodatek) {
        this.skladkaZdrowotnaPodatek = skladkaZdrowotnaPodatek;
    }

    public Double getSkladkaZus() {
        return skladkaZus;
    }

    public void setSkladkaZus(Double skladkaZus) {
        this.skladkaZus = skladkaZus;
    }

    public Double getKwotaBrutto() {
        return kwotaBrutto;
    }

    public void setKwotaBrutto(Double kwotaBrutto) {
        this.kwotaBrutto = kwotaBrutto;
    }
}
