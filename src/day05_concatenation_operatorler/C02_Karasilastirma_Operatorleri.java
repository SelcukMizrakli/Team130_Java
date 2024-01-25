package day05_concatenation_operatorler;

public class C02_Karasilastirma_Operatorleri {
    public static void main(String[] args) {

        int a = 20;

        int b = 25;

        b = a;//b = 20

        a = 2 * a + 5;
        System.out.println(a);

        System.out.println(a == b); //false

        System.out.println(b = b + 3);

        System.out.println(b + 27 == a + 5);    //true


        System.out.println(a!=b);       //true

        System.out.println(!false);     //true

        System.out.println(4>7);        //false

        System.out.println(5 > 3 == 6 >7);      //false

        System.out.println( !(4>5));    //true



    }
}
