package gun31.ornek2;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir kargo firmasında farklı türde gönderiler bulunmaktadır.
         * Tüm gönderilerin ortak olarak şu bilgileri vardır:

         * gönderi sahibi adı
         * paket ağırlığı
         * gönderim türü

         * Ancak bazı gönderiler ek özelliklere sahiptir:

         * Standart Kargo için ek özellik yoktur.
         * Hızlı Kargo için ek olarak şehir dışı durumu bilgisi vardır.
         * Aynı Gün Teslim Kargo için ek olarak kurye ücreti bilgisi vardır.

         * Gönderim türleri şunlardır:

         * Standart
         * Hızlı
         * Aynı Gün

         * Sistemde tüm kargo türleri için ücret hesaplama işlemi yapılmalıdır.

         * Ücret kuralları:

         * Standart Kargo için ücret = ağırlık * 12
         * Hızlı Kargo için ücret = ağırlık * 18
         * Eğer şehir dışı ise toplam ücrete 30 TL eklenir.
         * Aynı Gün Teslim Kargo için ücret = ağırlık * 25 + kurye ücreti

         * Ek kural:

         * Eğer paket ağırlığı 10 kg’dan fazlaysa,
         * hangi kargo türü olursa olsun toplam ücrete 20 TL eklenir.

         * Programdan istenenler:

         * Ortak bilgileri tutan bir üst sınıf oluşturun.
         * Bu yapıdan yararlanarak:

         * StandartKargo
         * HizliKargo
         * AyniGunKargo

         * sınıflarını oluşturun.
         * Ücret hesaplama işlemini tüm kargo türleri için zorunlu hale getirin.
         * Gönderim türlerini sabit ve düzenli bir yapı ile yönetin.
         * En az 3 farklı kargo nesnesi oluşturun.

         * Her kargonun:
         * müşteri adını
         * ağırlığını
         * gönderim türünü
         * hesaplanan toplam ücretini
         * ekrana yazdırın.

         * Toplam ücreti 200 TL’den fazla olan gönderiler için:
         * "Bu gönderi özel işlem gerektirir."
         * mesajını yazdırın.
         * En pahalı gönderiyi bulun ve ekrana yazdırın.
         * */

        StandartKargo standart = new StandartKargo("Gökay", 23);
        HizliKargo hizli = new HizliKargo("Izzet", 12, true);
        AyniGunKargo ayniGun = new AyniGunKargo("Hüseyin", 50, 50);


        System.out.println("------1. Kargo--------");
        standart.bilgiGoster();
        double standartUcret = standart.ucretHesapla();
        System.out.println("Toplam ücret: " + standartUcret);
        if (standartUcret > 200) {
            System.out.println("Bu gönderi özel işlem gerektirir.");
        }

        System.out.println();

        System.out.println("--------2. Kargo--------");
        hizli.bilgiGoster();
        double hizliUcret = hizli.ucretHesapla();
        System.out.println("Toplam ücret: " + hizliUcret);
        if (hizliUcret > 200) {
            System.out.println("Bu gönderi özel işlem gerektirir.");
        }

        System.out.println();

        System.out.println("--------3. Kargo----------");
        ayniGun.bilgiGoster();
        double ayniGunUcret = ayniGun.ucretHesapla();
        System.out.println("Toplam ücret: " + ayniGunUcret);
        if (ayniGunUcret > 200) {
            System.out.println("Bu gönderi özel işlem gerektirir.");
        }

        System.out.println();

        double enYuksekUcret = standartUcret;
        String enPahaliMusteri = standart.getGonderiSahibiAdi();

        if (hizliUcret > enYuksekUcret) {
            enYuksekUcret = hizliUcret;
            enPahaliMusteri = hizli.getGonderiSahibiAdi();
        }

        if (ayniGunUcret > enYuksekUcret) {
            enYuksekUcret = ayniGunUcret;
            enPahaliMusteri = ayniGun.getGonderiSahibiAdi();
        }

        System.out.println("En yüksek kargo ücreti: " + enYuksekUcret);
        System.out.println("En pahali müsteri adi: " + enPahaliMusteri);
    }
}
