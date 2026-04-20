package gun34.ornek3;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir banka uygulaması geliştirilecektir.

         * Sistemde farklı hesap türleri vardır:

         * vadesiz hesap
         * öğrenci hesabı
         * birikim hesabı

         * Her hesapta:

         * hesap sahibi adı
         * hesap numarası
         * bakiye

         * bulunacaktır.

         * Kurallar:

         * Para yatırma ve para çekme işlemleri yapılmalıdır.
         * Hesap türlerine göre işlem kuralları değişebilir.
         * örneğin öğrenci hesabında işlem ücreti alınmayabilir
         * birikim hesabında belirli limit altına düşülemeyebilir
         * Bir hesaptan başka bir hesaba para transferi yapılmalıdır.

         * Aşağıdaki durumlarda hata yönetimi yapılmalıdır:
         * negatif para yatırma
         * bakiyeden fazla para çekme
         * geçersiz hesap numarasına transfer
         * Tüm hesaplar bir listede tutulmalı ve hesap özeti ekrana yazdırılmalıdır.
         * */


        List<Hesap> hesaplar = new ArrayList<>();

        Hesap hesap1 = new BirikimHesabi("Mehmet", "TR1001", 5000);
        Hesap hesap2 = new OgrenciHesabi("Alperen", "TR1002", 1500);
        Hesap hesap3 = new VadesizHesap("Gamze", "TR1003", 3000);

        hesaplar.add(hesap1);
        hesaplar.add(hesap2);
        hesaplar.add(hesap3);

        System.out.println("----HESAP ÖZETLERI-----");
        for (Hesap hesap : hesaplar) {
            hesap.hesapOzeti();
        }

        System.out.println("----ISLEMLER-----");
        try {
            hesap1.paraYatir(1000);

            hesap2.paraCek(200);

            hesap3.paraCek(5000);

            hesap1.transferYap(hesap2, 500);

        } catch (IllegalArgumentException e) {
            System.out.println("Hata: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Hata: " + e.getMessage());
        }

        System.out.println("------GUNCEL HESAP BILGILERI");

        for (Hesap hesap : hesaplar) {
            hesap.hesapOzeti();
        }
    }
}
