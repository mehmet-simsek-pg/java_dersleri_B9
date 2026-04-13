package gun30.ornek2;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir e-ticaret uygulamasında kullanıcı kredi kartı,
         * havale veya kapıda ödeme ile alışveriş yapabiliyor.
         * Bu bilgilere göre yapiyi kurun.
         * */

        // Class lar ayni interface i implement ederse
        // ayni veri tipine sahip olmus olurlar.

        OdemeYontemi odemeYontemi1 = new KapidaOdeme();
        OdemeYontemi odemeYontemi2 = new KrediKarti();
        OdemeYontemi odemeYontemi3 = new Havale();

        odemeYontemi1.odemeYap(250);
        odemeYontemi2.odemeYap(200);
        odemeYontemi3.odemeYap(150);

    }
}
