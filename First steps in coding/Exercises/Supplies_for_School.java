package Exercises_12september;

import java.util.Scanner;

public class Supplies_for_School {
    public static void main(String[] args) {
        double pencils = 5.80;
        double marks = 7.20;
        double prep = 1.20;

        Scanner scanner = new Scanner(System.in);
        int pencilsnumber = Integer.parseInt(scanner.nextLine());
        int marksnumber = Integer.parseInt(scanner.nextLine());
        int prepnumber = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double allpencils = pencilsnumber * pencils;
        double allmarks = marksnumber * marks;
        double allprep = prepnumber * prep;
        double allmaterials = allpencils + allmarks + allprep;

        double alldiscount = allmaterials - (allmaterials * discount/100);
        System.out.println(alldiscount);
    }
}
