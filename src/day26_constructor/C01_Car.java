package day26_constructor;

public class C01_Car {
    String marka = "Marka belirtilmemis";
    String model = "Model belirtilmemis";
    String renk = "Renk belirtilmemis";
    int yil = 1900;

    public void motor(){
        System.out.println("Tum arabalarin motoru olur");
    }
    public void guvenlik(){
        System.out.println("Tum arabalarin guvenlik donanimlari olmalidir");
    }

    int fiyat;
    public String toString() {
        return "Araba Ozellikleri {" +
                "marka : '" + marka + '\'' +
                ", model : '" + model + '\'' +
                ", renk : '" + renk + '\'' +
                ", yil : " + yil +
                ", fiyat : " + fiyat +
                '}';
    }
}
