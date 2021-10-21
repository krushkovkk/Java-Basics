package Lab;

import java.util.Scanner;

public class FishLand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double skumriq = Double.parseDouble(scanner.nextLine());
        double caca = Double.parseDouble(scanner.nextLine());
        double kgpalamut = Double.parseDouble(scanner.nextLine());
        double kgsafrid = Double.parseDouble(scanner.nextLine());
        int kgmidi = Integer.parseInt(scanner.nextLine());

        double palamut = skumriq + skumriq * 0.6;
        double safrid = caca + caca * 0.8;

        double allpalamut = kgpalamut * palamut;
        double allsafrid = kgsafrid * safrid;
        double allmidi = kgmidi * 7.5;

        double all = allpalamut + allsafrid + allmidi;
        System.out.printf("%.2f", all);
    }
}
