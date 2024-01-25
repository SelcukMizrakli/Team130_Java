package day27_constructorCall;

public class C01_ConstructorCall {

    int sayi =20;
    String isim = "Ali";

    C01_ConstructorCall(){
        this(22);
        sayi = 18;
    }

    C01_ConstructorCall(int sayi){
        this(58,"Zapo");
        this.sayi = sayi;

    }

    C01_ConstructorCall(int sayi,String isim){

        this.sayi = 40;

        this.isim = isim;

    }

    public static void main(String[] args) {
        C01_ConstructorCall obj = new C01_ConstructorCall();
        System.out.println(obj.isim + ", " + obj.sayi + " yaşında");
    }

}
