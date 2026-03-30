package gun25;

import gun25.ornek1.Araba;
import gun25.ornek1.Kitap;
import gun25.ornek1.Ogrenci;

public class ConstructorKonusu {
    /**
     * Constructor, bir class tan nesne ürettigimiz anda otomatik
     * calisan yapidir.
     * Nesne olustururken baslangic degerleri verilebilir, ortak islemler
     * yapilabilir.
     *
     * Özellikleri ->
     * 1) Class ismiyle ayni olmali
     * 2) Geri dönüs tipi yoktur, ama buna ragmen void de yazilmaz
     * 3) Nesne olustururken otomatik olusur.
     * 4) Istenirse parametre eklenebilir
     *
     * class Araba {
     *
     *     Araba() {
     *         System.out.println("Araba nesnesi olusturuldu");
     *     }
     * }
     *  Araba araba = new Araba();
     * */
    public static void main(String[] args) {
        Araba araba = new Araba();

        Ogrenci ogrenci = new Ogrenci();

        // ad ve yas icin burada bir atama yapmadik
        // Gelen degerler constructor metotdan otomatik geliyor
        System.out.println("Ad: " + ogrenci.ad);
        System.out.println("Yas: " + ogrenci.yas);

        System.out.println("------------");

        Ogrenci ogrenci1 = new Ogrenci("Mehmet", 32);

        System.out.println("Isim: " + ogrenci1.ad);
        System.out.println("Yas: " + ogrenci1.yas);

        System.out.println("------------");

        Kitap kitap = new Kitap("Insanlar ve Fareler");

        Kitap kitap1 = new Kitap();
        kitap1.ad = "Calikusu";

        System.out.println(kitap.ad);
        System.out.println(kitap1.ad);
    }

}
