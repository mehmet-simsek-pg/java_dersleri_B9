package gun32.abstraction.ornek1;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir mağazada farklı ödeme yöntemleri kullanılmaktadır.
         * Tüm ödeme türlerinde ortak olarak tutar bilgisi vardır.
         * Ayrıca her ödeme türü için ödeme işlemi yapılmalıdır.

         * Nakit ödeme
         * Kredi kartı ile ödeme

         * Buna göre sistemi abstraction mantığı ile oluşturunuz.
         * */

        NakitOdeme nakitOdeme = new NakitOdeme(250);
        KrediKarti krediKarti = new KrediKarti(350);

        nakitOdeme.bilgi();
        nakitOdeme.odemeYap();

        System.out.println();

        krediKarti.bilgi();
        krediKarti.odemeYap();

    }
}
