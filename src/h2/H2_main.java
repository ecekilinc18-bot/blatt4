package h2;

public class H2_main {
    public static void main(String[] args) {

        int input = 10;
        boolean x = false;
        boolean y = false;
        boolean a, b, c;


        switch (input) {
            case 0 -> { x = false; y = false; }
            case 1 -> { x = false; y = true; }
            case 10 -> { x = true;  y = false; }
            case 11 -> { x = true;  y = true; }
            default -> {
                System.out.println("Ungültige Eingabe!"); // geçersiz giriş
                return;
            }
        }


        a = (x && y);          // ikisi de true ise
        b = (x || y);          // biri bile true ise
        c = ((!y) ^ (!x));     // özel tabloya göre (xor mantığı)



        if (x && y){
            c = false;
        }
        if (!x && !y){
            c = true;
        }
        if (x && !y){
            c = true;
        }
        if (!x && y){
            c = false;
        }


        System.out.println("input = " + input);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
