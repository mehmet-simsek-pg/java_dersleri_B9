package gun36.burger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan aşağıdaki bilgiler alınacaktır:
         * müşteri adı
         * burger boyutu
         * burger türü
         * içecek seçimi
         * adet

         * Burger boyutu için üç farklı seçenek olmalıdır:
         * küçük
         * orta
         * büyük

         * Burger türü için dört farklı seçenek olmalıdır:
         * klasik
         * cheeseburger
         * tavuk burger
         * vejetaryen burger

         * İçecek seçimi için üç farklı seçenek olmalıdır:
         * kola
         * ayran
         * su

         * Burger fiyatları boyuta göre değişmelidir:
         * küçük: 120 TL
         * orta: 160 TL
         * büyük: 210 TL

         * İçecek fiyatları aşağıdaki gibi olmalıdır:
         * kola: 30 TL
         * ayran: 20 TL
         * su: 10 TL

         * Toplam ücret hesaplanırken şu kurala göre işlem yapılmalıdır:
         * burger fiyatı × adet
         * içecek fiyatı × adet
         * ikisinin toplamı genel tutarı vermelidir
         * Eğer sipariş adedi 3 veya daha fazla ise toplam tutara %10 indirim uygulanmalıdır.
         * Sipariş oluşturulduğunda siparişin verildiği tarih ve saat de kayıt altına alınmalıdır.
         * Eğer kullanıcı büyük boy burger seçerse, sipariş özetinde şu bilgi de yer almalıdır:

         * “Hazırlanması biraz daha uzun sürebilir.”

         * Program sipariş sonunda aşağıdaki bilgileri düzenli şekilde yazdırmalıdır:
         * müşteri adı
         * burger boyutu
         * burger türü
         * içecek
         * adet
         * sipariş zamanı
         * toplam ücret
         * varsa indirim bilgisi
         * büyük boy seçilmişse hazırlık notu
         * Siparişin sonunda ekrana şu mesaj yazdırılmalıdır:

         * “Siparişiniz alındı.”

         * Kullanıcı geçersiz bir seçim yaparsa program uygun bir hata mesajı göstermelidir.
         * Kullanıcı adet olarak 0 veya negatif değer girerse sipariş oluşturulmamalıdır.
         * */

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Adiniz: ");
            String ad = scanner.nextLine();

            System.out.print("Burger türü(KLASIK, CHEESE, TAVUK, VEJETERYAN): ");
            String burgerTuru = scanner.nextLine().toUpperCase();

            BurgerTuru turu = BurgerTuru.valueOf(burgerTuru);

            System.out.print("Burger boyutu(KUCUK, ORTA, BUYUK): ");
            String burgerBoyutu = scanner.nextLine().toUpperCase();

            BurgerBoyut boyut = BurgerBoyut.valueOf(burgerBoyutu);

            System.out.print("Icecek türü(KOLA, AYRAN, SU): ");
            String icecekTuru = scanner.nextLine().toUpperCase();

            Icecek icecek = Icecek.valueOf(icecekTuru);

            System.out.print("Adet: ");
            int adet = scanner.nextInt();

            if (adet <= 0) {
                throw new IllegalArgumentException("Siparis miktari 0 veya negatif olamaz.");
            }

            BurgerSiparis siparis = new BurgerSiparis(ad, boyut, turu, icecek, adet);

            siparis.siparisBilgileri();
        } catch (IllegalArgumentException ex) {
            System.out.println("Hata: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Hata: " + ex.getMessage());
        } finally {
            scanner.close();
        }
    }
}
