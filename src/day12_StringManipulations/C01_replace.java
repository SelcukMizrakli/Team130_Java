package day12_StringManipulations;

public class C01_replace {
    public static void main(String[] args) {
        String str = "Hava candir.";

        str.replace("H","J");

        System.out.println(str.replace("H", "J"));  //Java candir.

        System.out.println(str);    //Hava  candir.

        str = str.replace("Hava", "Java").replace(".","");  //Java candir
        System.out.println(str);

        System.out.println(str.replaceFirst("a", "A")); //JAva candir

        System.out.println(str.replace("a","A"));       //JAvA cAndir

        System.out.println(str.replace("a", ""));       //Jv cndir

        str = "Ali uzunkavaklaraltindayataruyumazoglu";     //Ali UzUnkavaklaraltindayatarUyUmazoglU

        System.out.println(str.replace("u", "U"));

    }
}
