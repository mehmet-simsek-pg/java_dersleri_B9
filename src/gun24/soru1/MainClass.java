package gun24.soru1;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir Araba sinifi olusturun. Her araba icin ortak
         * olan degisken uretim yeri adedir.
         * Bu Araba dan 2 tane üretip ciktilara bakalim.
         * */

        Araba araba1 = new Araba();
        araba1.marka = "Mercedes";
        araba1.model = "G63";
        araba1.motorHacmi = 3.0;

        Araba araba2 = new Araba();
        araba2.marka = "BMW";
        araba2.model = "m5";
        araba2.motorHacmi = 2.4;

        System.out.println("Araba1 marka: " + araba1.marka);
        System.out.println("Araba2 marka: " + araba2.marka);

        System.out.println("üretim yeri: " + Araba.uretimYeri);

    }
}
