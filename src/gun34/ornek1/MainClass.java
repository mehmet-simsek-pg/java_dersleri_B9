package gun34.ornek1;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir e-ticaret sistemi tasarlanacaktır.

         * Sistemde ürünler vardır. Her ürünün:

         * adı
         * fiyatı
         * stok adedi

         * bilgisi bulunur.

         * Bazı ürünler standart ürün, bazıları ise indirimli ürün olabilir.
         * İndirimli ürünlerde ek olarak indirim oranı tutulmalıdır.

         * Kurallar:

         * Tüm ürünler için bilgileri yazdıran bir yapı kurulmalıdır.
         * İndirimli ürünlerde satış fiyatı indirim uygulanarak hesaplanmalıdır.
         * Bir müşteri ürün satın almak istediğinde:
         * stok yoksa hata verilmelidir
         * negatif adet girilirse hata verilmelidir
         * geçerli alım yapılırsa stok düşmelidir
         * Kullanıcıdan alınan sipariş bilgileri bir koleksiyon içinde tutulmalıdır.
         * Sipariş sonunda tüm ürünler ve kalan stoklar ekrana yazdırılmalıdır.
         * */

        List<Urun> urunler = new ArrayList<>();

        Urun standart1 = new Urun("Bilgisayar", 1500, 10);
        Urun standart2 = new Urun("Klavye", 50, 5);

        IndirimliUrun indirimliUrun1 = new IndirimliUrun("Masa", 250, 4, 15);
        IndirimliUrun indirimliUrun2 = new IndirimliUrun("PS5", 800, 6, 20);

        urunler.add(standart1);
        urunler.add(standart2);
        urunler.add(indirimliUrun1);
        urunler.add(indirimliUrun2);

        System.out.println("-------ÜRÜN BILGILERI--------");
        for (Urun urun : urunler) {
            urun.bilgiYaz();
            System.out.println();
        }
        try {
            standart1.satinAl(5);
            standart1.satinAl(3);

            indirimliUrun1.satinAl(3);
            indirimliUrun1.satinAl(3);
        } catch (IllegalArgumentException e) {
            System.out.println("Hata: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Hata: " + e.getMessage());
        }

        System.out.println();
        System.out.println("-----GÜNCEL STOK DURUMU------");
        for (Urun urun : urunler) {
            urun.bilgiYaz();
            System.out.println();
        }
    }
}
