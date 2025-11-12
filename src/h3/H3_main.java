package h3;

public class H3_main {
    public static void main(String[] args) {
        float celsiusFloat = 14.2f;
        double celsiusDouble = 14.2;

        float fahrenheitFloat = celsiusFloat * 9f / 5f + 32f;
        double fahrenheitDouble = celsiusDouble * 9.0 / 5.0 + 32.0;

        System.out.println("Celsius (float): " + celsiusFloat);
        System.out.println("Fahrenheit (float): " + fahrenheitFloat);
        System.out.println("Celsius (double): " + celsiusDouble);
        System.out.println("Fahrenheit (double): " + fahrenheitDouble) ;
    }


}
