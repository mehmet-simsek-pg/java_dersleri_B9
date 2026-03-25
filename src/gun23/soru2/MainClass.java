package gun23.soru2;

public class MainClass {
    public static void main(String[] args) {
        /**
         * ad, numara ve ortalama bilgilerini
         * tutan bir yapi olusturun. Bir ögrenci
         * olusturup bilgilerini yazdirin.
         * Ortalama 50 ve büyükse sinavi gecti yoksaa kaldi.
         * */

        Ogrenci ogrenci = new Ogrenci();
        ogrenci.ad = "Ali";
        ogrenci.numara = 2200;
        ogrenci.ortalama = 90;

        System.out.println("ilk dönem");
        ogrenci.bilgiYaz();
        ogrenci.sinavDurumu();

        System.out.println("ikinci dönem");
        ogrenci.ortalama = 45;
        ogrenci.bilgiYaz();
        ogrenci.sinavDurumu();
    }
}
