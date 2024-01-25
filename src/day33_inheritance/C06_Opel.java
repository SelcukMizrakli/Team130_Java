package day33_inheritance;

public class C06_Opel extends C05_Car{
    C06_Opel(){
        super();// önce extends yapilan class
        System.out.println("Opel class constructor");
    }

    String strP = "Opel class Parent";
    String marka = "Opel";

}
