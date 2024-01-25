package day07_ifElseStatements;

import java.util.Scanner;

public class C02_ifElseStatements {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir harf isteyin, girilen karakter
        // kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen karakteri girildigi gibi yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir harf giriniz: ");

        char girilenharf = scanner.next().charAt(0);

        //1. yöntem

        if (Character.isLowerCase(girilenharf)){

            System.out.println(Character.toUpperCase(girilenharf));

        }else System.out.println(girilenharf);

        //2. yöntem

        if (girilenharf >= 'a' && girilenharf <= 'z'){
            System.out.println((char) (girilenharf-32));

        }else System.out.println(girilenharf);
    }
}
