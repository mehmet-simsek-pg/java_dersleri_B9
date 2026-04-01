package gun27.ornek7;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir spor salonunda ögrenciler farkli üyelik paketleri
         * secebiliyorlar: aylik, 3 aylik ve yillik olacak sekilde.
         * Her paketin farkli ücreti var. Üye olustururken ögrenci
         * adi ve paketi giriliyor. Toplam ücret hesaplanip
         * ekrana yazdiriliyor.
         * */

        SporSalonuUyesi uye =
                new SporSalonuUyesi
                        ("Hüseyin", UyelikPaketi.YILLIK);
        uye.bilgiYazdir();
    }

}
