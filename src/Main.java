import zadanie1.Programista;
import zadanie2.Tablica;
import zadanie3.Matma;
import zadanie_dziedziczenie.Osoba;
import zadanie_dziedziczenie.Pracownik;

public class Main {
    public static void main(String[] args) {

        System.out.println("Operacje na klasie Osoba:");
        Osoba osobaPierwsza = new Osoba("Magda", "Pietrucha");
        osobaPierwsza.przedstawSie();
        System.out.println();

        System.out.println("Operacje na klasie Pracownik, dziedziczącej po klasie Osoba:");
        Pracownik pracownik1 = new Pracownik("Krzysztof", "Nowak", "Jdev", "jakas1Firma");
        Pracownik pracownik2 = new Pracownik("Jan", "Kowalski", "Mdev", "jakas2Firma");
        pracownik1.przedstawSie();
        pracownik2.przedstawSie();
        System.out.println();

        System.out.println("Operacje na klasie Tablica:");
        Tablica tablica1 = new Tablica(5, 12,67,1,101);
        System.out.println("Średnia elementów w tablicy to: " + tablica1.zliczanieSredniej());
        System.out.println("Suma elementów w tablicy to: " + tablica1.zliczanieSumy());
        System.out.println("Njamniejszy element w tablicy to: " + tablica1.wyborMin());
        System.out.println("Najwiekszy element w tablicy to: " + tablica1.wyborMax());

        System.out.println("Operacje na klasie Matma:");
        System.out.println("Pole przykładowego koła to: " + Matma.liczPoleKola(10));
        System.out.println("Obwod przykladowego prostokąta to: " + Matma.liczObwodProstokata(3,15.5));
        System.out.println();

        System.out.println("Operacje na klasie Programista:");
        Programista programista = new Programista("Bartek", "Kos", "Java", 3500);
        System.out.println("Jaki jezyk programowania preferujesz? "+ programista.pobierzJezyk());

    }
}
