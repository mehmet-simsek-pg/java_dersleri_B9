package gun23.soru1;

public class MainClass {
    public static void main(String[] args) {
        /**
         * marka, model ve sarj yüzdesi
         * bilgilerini tutan bir yapi olusturun.
         * Bir Telefon olusturup bilgilerini yazdirin.
         * Sarj yüzdesini 10 arttirip bilgileri tekrar yazdirin.
         * */

        Telefon telefon = new Telefon();
        telefon.marka = "Apple";
        telefon.model = "17 Pro Max";
        telefon.sarjYuzdesi = 40;

        System.out.println("ilk durum bilgileri");
        telefon.bilgileriniYaz();

        telefon.sarjiArtir();

        System.out.println("Sarj edildikten sonra");
        telefon.bilgileriniYaz();
    }
}
