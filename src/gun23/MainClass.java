package gun23;

public class MainClass {
    public static void main(String[] args) {
        /**
         * String isim = "Mehmet";
         * String soyisim = "Simsek";
         * int yas = 33;
         * double boy = 1.78;
         * int[] notlar = {98, 87, 67, 78};

         * List, Set, Map yapilarini gördük.
         * Ayni türden olan verileri tutuyorlardi. List ve Set
         * Map ise key value seklinde veri tutuyordu.

         * Yukaridaki 5 degiskeni bir veri tipi altinda toplayabiliyoruz.
         * Bu yapiya da java da class deniyor.
         * */

        // ogrenci1 diyerek bir nesne ürettik.
        // Class isimleri büyük harfle baslar
        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.isim = "Mehmet";
        ogrenci1.soyisim = "Simsek";
        ogrenci1.yas = 33;
        ogrenci1.boy = 1.78;
        ogrenci1.notlar = new int[]{98, 87, 67};

        Araba araba = new Araba();
        araba.marka = "Mercedes Benz";
        araba.model = "G63";
        araba.motor = 3.0;
        araba.renk = "Siyah";
        araba.hiz = 200;
        araba.manuelMi = false;

        araba.bilgileriniYazdir();

        araba.hizlan();
        araba.hizlan();

        araba.bilgileriniYazdir();

        araba.yavasla();

        araba.bilgileriniYazdir();

    }
}
