package gun27.ornek2;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir sinema uygulamasinda film adi, koltuk numarasi ve
         * bilet fiyati tutuluyor. Bilet olustururken bu bilgiler
         * giriliyor. Daha sonra bilet bilgileri ekrana yazdiriliyor.
         * */

        Bilet bilet = new Bilet("Harry Potter", 12, 45);
        bilet.biletYazdir();

        Bilet bilet2 = new Bilet("Interstaller", 6, 50);
        bilet2.biletYazdir();
    }
}
