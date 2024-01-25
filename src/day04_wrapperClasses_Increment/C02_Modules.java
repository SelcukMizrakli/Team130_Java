package day04_wrapperClasses_Increment;

import java.util.Scanner;

public class C02_Modules {
    public static void main(String[] args) {
        System.out.println(25%8);//1

        System.out.println(25/8);//3

        //123456879 sayısının 8 ile bölümününden kalan kaçtır?
        System.out.println(123456879%8); //7

        //564231 sayısı 113'e tam bölünür mü?
        System.out.println(564231%113);//22

        //kullanıcıdan bir sayı isteyip
        //birler basamağını yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");

        int sayi = scanner.nextInt();

        System.out.println("Girilen sayının birler basamağı: " + (sayi % 10)); //sayi = 21 --> 1

        System.out.println(375%10); //5     birler basamağını veriyor
        System.out.println(375/10); //37    birler basamağı olan 5 hariç kalan sayıları verir

        System.out.println(37%10);  //7
        System.out.println(37/10);  //3

        System.out.println(3%10);   //3
        System.out.println(3/10);   //0






    }
}
