package day04_wrapperClasses_Increment;

public class C04_Increment_Decrement {
    public static void main(String[] args) {

        int a = 10;

        // a'nin değerini oluşturacağımız bir b veriable'na atayın, sonra a değerini 1 arttırın.

        int b = a;
        a++;

        System.out.println("a: "+a+ "\nb: "+b);     //a: 11 b:10

        a =10;

        //a'nin değerini 1 arttırsın sonra b ye atasın.

        a++;
        b = a;
        System.out.println("a: "+a+ "\nb: "+b);     //a: 11 b:11

        a = 10;

        //a'nin değerini yazdırın, sonra değerini 1 arttırın

        System.out.println(a);      //10
        a++;        //a = 11

        a = 10;

        //a'nin değerini 1 artırın, değerini yazdırın.

        a++;
        System.out.println(a);      //11


    }
}
