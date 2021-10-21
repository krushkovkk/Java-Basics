package Lab;

import java.util.Scanner;

public class Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celcius = Double.parseDouble(scanner.nextLine());
        double faren = celcius * 1.8 +32;
        System.out.printf("%.2f",faren);
    }
}
