package day11_StringManipulation;

public class C01_IndexOf {
    public static void main(String[] args) {
        String str = "Java cok güzel bir programlama dili.";

        System.out.println(str.contains("a"));  //true

        System.out.println(str.indexOf("a"));   //1

        System.out.println(str.indexOf('c'));   //5

        System.out.println(str.indexOf("a "));  //3

        System.out.println(str.indexOf("güzel"));   //9

        System.out.println(str.indexOf(" "));   //4

        System.out.println(str.indexOf(" ", 10));   //14

        // ikinci space'in indexini yazdırın

        System.out.println(str.indexOf(" ", 4+1));  //8

        // ikinci i'nin index'ini yazdırın

        System.out.println(str.indexOf("i"));   //16

        System.out.println(str.indexOf("i", str.indexOf("i") + 1)); //32

        // ikinci a'nın index değerini yazdirin

        System.out.println(str.indexOf("a", str.indexOf("a")+1));   //3

        int ilkCindex = str.indexOf("c");

        if (ilkCindex == -1){
            System.out.println("Girilen metinde 'c' değeri yok.");
        } else if (str.indexOf('c',str.indexOf('c')+1) == -1){
            System.out.println("2. 'c' değeri yok.");
        } else {
            System.out.println("2. c değeri var.");
        }

    }
}
