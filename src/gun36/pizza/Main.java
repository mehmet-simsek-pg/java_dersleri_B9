package gun36.pizza;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Bir pizza sipariş uygulaması yazınız.

         * Program kullanıcıya bir pizza siparişi oluşturma imkanı vermelidir.

         * İstenenler
         * Kullanıcıdan şu bilgiler alınacaktır:
         * müşteri adı
         * pizza boyutu
         * pizza türü
         * adet

         * Pizza boyutu için enum kullanılmalıdır.
         * KUCUK
         * ORTA
         * BUYUK

         * Pizza türü için enum kullanılmalıdır.
         * MARGHERITA
         * KARIŞIK
         * SUCUKLU
         * VEJETARYEN

         * Sipariş oluşturulduğunda o anki tarih ve saat bilgisi saklanmalıdır.
         * Bunun için LocalDateTime kullanılmalıdır.
         * Sipariş bilgileri ekrana düzenli şekilde yazdırılmalıdır.

         * Toplam ücret hesaplanmalıdır.
         * KUCUK: 150 TL
         * ORTA: 200 TL
         * BUYUK: 250 TL

         * Kullanıcı hatalı pizza boyutu veya hatalı pizza türü
         * girerse program hata vermek yerine uygun bir mesaj göstermelidir.
         * Kullanıcı adet olarak 0 veya negatif sayı girerse hata mesajı verilmelidir.
         * */

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Adiniz: ");
            String ad = scanner.nextLine();

            System.out.print("Pizza boyutu: ");
            String pizzaBoyutu = scanner.nextLine().toUpperCase();

            Boyut boyut = Boyut.valueOf(pizzaBoyutu);

            System.out.print("Pizza türü: ");
            String pizzaTuru = scanner.nextLine().toUpperCase();

            PizzaTuru turu = PizzaTuru.valueOf(pizzaTuru);

            System.out.print("Adet: ");
            int adet = scanner.nextInt();

            if (adet <= 0) {
                throw new IllegalArgumentException("Siparis miktari 0 veya negatif olamaz.");
            }

            PizzaSiparis siparis = new PizzaSiparis(ad, boyut, turu,adet);

            siparis.siparisBilgileri();

        } catch (IllegalArgumentException e) {
            System.out.println("Hata: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
