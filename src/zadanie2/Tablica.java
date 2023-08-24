package zadanie2;

import javax.swing.text.TabableView;

public class Tablica {

    int[] tablicaInt = new int[5];

    public Tablica(int a, int b, int c, int d, int e) {
        tablicaInt[0] = a;
        tablicaInt[1] = b;
        tablicaInt[2] = c;
        tablicaInt[3] = d;
        tablicaInt[4] = e;
    }

    public int zliczanieSumy() {
        int suma = 0;
        for (int i = 0; i < tablicaInt.length; i++) {
            suma += tablicaInt[i];
        }
        return suma;
    }

    public double zliczanieSredniej() {
        double srednia = 0;
        srednia = (double)zliczanieSumy() / tablicaInt.length;
        return srednia;
    }

    public int wyborMax() {
        int najwiekszyElement = tablicaInt[0];
        for (int i = 1; i < tablicaInt.length; i++) {
            if (najwiekszyElement < tablicaInt[i]) {
                najwiekszyElement = tablicaInt[i];
            }
        }
        return najwiekszyElement;
    }

    public int wyborMin() {
        int najmniejszyElement = tablicaInt[0];
        for (int i = 1; i < tablicaInt.length; i++) {
            if (najmniejszyElement > tablicaInt[i]) {
                najmniejszyElement = tablicaInt[i];
            }
        }
        return najmniejszyElement;
    }

}
 