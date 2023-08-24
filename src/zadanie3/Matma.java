package zadanie3;

public class Matma {

    public static final double PI = Math.PI;

    public static double liczPoleKola (double promien) {
        double poleKola = PI * Math.pow (promien, 2);
        return  poleKola;
    }

    public static double liczObwodKola (int promien) {
        double obwodKola = 2 * PI * promien;
        return obwodKola;
    }

    public static double liczPoleProstokata (int bokA, int bokB) {
        double poleProstokata = bokA * bokB;
        return poleProstokata;
    }
}
