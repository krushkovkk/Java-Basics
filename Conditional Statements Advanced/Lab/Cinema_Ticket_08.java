package Exercises_25_09;

import java.util.Scanner;

public class Cinema_Ticket_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayofweek = scanner.nextLine();

        if (dayofweek.equals("Monday") || dayofweek.equals("Tuesday") || dayofweek.equals("Friday")){
            System.out.println(12);
        }else if (dayofweek.equals("Wednesday") || dayofweek.equals("Thursday")){
            System.out.println(14);
        } else if (dayofweek.equals("Saturday") || dayofweek.equals("Sunday")){
            System.out.println(16);
        }
    }
}
