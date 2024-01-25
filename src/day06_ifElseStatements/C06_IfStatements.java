package day06_ifElseStatements;

import java.util.Scanner;

public class C06_IfStatements {
    public static void main(String[] args) {
        /*
         Soru 4- Kullanıcıdan bir üçgenin 3 kenar uzunluğunu alın, üçgen eşkenara ise "Eşkenar üçgen" yazdırın
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Üçgenin kenar uzunluklarını giriniz");
        double a, b, c;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        if (a == b && a == c && a > 0) {
            System.out.println("Eşkenar üçgen");
        }

    }
}
