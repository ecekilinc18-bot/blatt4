package h1;

public class H1_main {
    public static void main (String[] args) {
        int zone = 3;
        double preis= 0.0;

        switch (zone) {
            case 1 -> preis = 2.00;
            case 2 -> preis = 2.35;
            case 3, 4 -> preis = 2.85;
            case 5 -> preis = 3.55;

            default-> preis = 4.00;
        }

        System.out.println("Zone" + zone + "kostet" + preis + "Euro");



    }
}
