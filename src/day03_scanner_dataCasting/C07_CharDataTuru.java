package day03_scanner_dataCasting;

import java.util.Scanner;

public class C07_CharDataTuru {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //char özel bir data türüdür.
        //'4' 'a' '%' 'K' içine tek bir karakter alır
        //char data türündeki variable'lar ve değerler matematiksel işlemlerde kullanılırsa
        //ASCII table'daki decimal karşılıkları ile işleme girerler.
            /*
        System.out.println('a'+ 'b'); // 97 + 98 = 195

        System.out.println('0' + '1'); //48 + 49 = 97

        int sayi = 'c';
        System.out.println(sayi); //99

        char chr = 101;
        System.out.println(chr); //e
            */
        // kullanıcıdan bir değer isteyin kullanıcının girdiği karakterden sonraki 3 karakteri yazdırın.
        // ornek: input = l  output = m, n, o

        System.out.print("Lütfen herhangi bir karakter giriniz: ");
        char girilenChar = scanner.next().charAt(0);
        for (int i =1; i<=3; i++){
            girilenChar = (char) (girilenChar + 1);
            System.out.println( "Girilen karakterden sonraki 3 karakter: " + girilenChar);
        }

    }
}
