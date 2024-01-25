package day03_scanner_dataCasting;

import java.util.Scanner;

public class C04_DataCasting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayiInt = 20;
        short sayiShort = 34;
        double sayiDouble = 22;
        String str = "Java";
        char chr = 'K';
        boolean bl = true;

        //bir data türündeki veriable'a başka türden değer atanabilir mi?

        byte a = 15;

        short b = a;

        int c = b;

        long d = c;


    }
}
