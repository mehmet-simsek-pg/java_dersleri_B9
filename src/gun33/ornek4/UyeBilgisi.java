package gun33.ornek4;

public class UyeBilgisi {
    public static void main(String[] args) {
        /**
         * Bir üyelik sisteminde bazı kullanıcıların adı sisteme eksik
         * girilmiş olabilir.
         * Bir kullanıcı adı üzerinde uzunluk hesaplanmak isteniyor.
         * Eğer isim null ise hata mesajı verilsin.
         * */

        String kullaniciAdi = null;

        try {
            System.out.println("Kullanici adi uzunlugu: " + kullaniciAdi.length());
        } catch (NullPointerException e) {
            System.out.println("Hata: Kullanici adi null olamaz");
        }

    }
}
