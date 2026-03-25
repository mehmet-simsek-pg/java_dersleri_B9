package gun23.soru3;

public class MainClass {
    public static void main(String[] args) {
        /**
         * marka, renk ve hiz bilgileri tutan bir yapi olusturun.
         * Once mevcut hiz bilgisini yazdirin,
         * Hizi 20 artirin ve 120 yi gecerse uyari verdirin.
         * */

        Araba araba = new Araba();
        araba.marka = "BMW";
        araba.renk = "Kirmizi";
        araba.hiz = 100;

        System.out.println("Ilk durum");
        araba.bilgiYazdir();

        araba.hizlan();

    }
}
