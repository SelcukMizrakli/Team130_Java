package day33_inheritance;

public class C04_RunnerClass {

    public static void main(String[] args) {

        C03_DizelCorolla dc1 = new C03_DizelCorolla();

        System.out.println(dc1.marka);  // Toyota   T
        System.out.println(dc1.model);  // Corolla  DC
        System.out.println(dc1.motor);  //Dizel motor   DC
        System.out.println(dc1.yakit);  //Dizel     DC
        System.out.println(dc1.uretimYeri); //Sakarya   DC
        System.out.println(dc1.sanzuman);   //Sanzuman belirtilmemis    A
        System.out.println(dc1.aku);    //inci aku  DC
        System.out.println(dc1.guvenlik);   //Toyota araclar extra guvenlik saglar DC
        System.out.println(dc1.teker);  //Pirelli 15 inc teker  DC
        System.out.println(dc1.renk);   //renk belirtilmedi DC
        System.out.println(dc1.fren);   //Abs fren DC

    }
}
