package zadanie_dziedziczenie;

import java.sql.SQLOutput;

public class Pracownik extends Osoba {
    String stanowisko;
    String nazwaFirmy;

    public Pracownik (String imie, String nazwisko, String stanowisko, String nazwaFirmy) {
        super(imie, nazwisko);
        this.stanowisko = stanowisko;
        this.nazwaFirmy = nazwaFirmy;
    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem " + imie +" "+ nazwisko+" i pracuje w firmie " + nazwaFirmy + " na stanowisku " + stanowisko);
    }
}
