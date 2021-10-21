package Lab;

import java.util.Scanner;

public class Vegetable_Market {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pricevegetables = Double.parseDouble(scanner.nextLine());
        double pricefruits = Double.parseDouble(scanner.nextLine());
        int vegetableskg = Integer.parseInt(scanner.nextLine());
        int fruitskg = Integer.parseInt(scanner.nextLine());

        double totalvg = (pricevegetables * vegetableskg);
        double totalfr = (pricefruits * fruitskg) ;
        double all = (totalvg + totalfr) / 1.94 ;
        System.out.printf("%.2f", all);
    }
}
