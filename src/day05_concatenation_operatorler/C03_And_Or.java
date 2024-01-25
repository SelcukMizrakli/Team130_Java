package day05_concatenation_operatorler;

import java.util.Scanner;

public class C03_And_Or {
    public static void main(String[] args) {
        //kullanıcıdan not isteyin
        // 0 ile 100 arasında ise true değilse false değerini ekrana yazdırın.
        // 0 ve 100 dahil true


        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen notunuzu giriniz: ");

        int not = scanner.nextInt();
        System.out.println(not >= 0 && not <=100);

        // not 50 ile 80 (dahil) arasında değilse true yazdırın
        //arasında ise false yazdırın

        System.out.println( not<=50 || not>= 80);






    }
}
