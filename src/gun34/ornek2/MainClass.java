package gun34.ornek2;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir kütüphane otomasyonu geliştirilecektir.

         * Sistemde:

         * kitaplar
         * üyeler
         * ödünç alma işlemleri

         * yer alacaktır.

         * Her kitabın:

         * kitap adı
         * yazar adı
         * sayfa sayısı
         * mevcut durumu

         * olacaktır.

         * Kurallar:

         * Kitap ve dergi gibi farklı yayın türleri oluşturulmalıdır.
         * Her yayın için bilgileri gösteren ortak bir yapı bulunmalıdır.
         * Bir üye bir yayını ödünç almak istediğinde:
         * yayın zaten ödünçteyse hata verilmelidir
         * üyelik aktif değilse hata verilmelidir
         * Yayın iade edildiğinde tekrar uygun hale gelmelidir.
         * Sistemde birden fazla yayın bir listede tutulmalıdır.
         * Kullanıcı hatalı bir seçim yaptığında program çökmemelidir,
         * uygun mesaj verilmelidir.
         * */

        List<Yayin> yayinlar = new ArrayList<>();

        Yayin kitap1 = new Kitap("Suc ve Ceza", "Dostoyevski", 230, true);
        Yayin kitap2 = new Kitap("Yarinin adami", "Yabanci" , 300, false);

        Yayin dergi1 = new Dergi("Dergi1", "Yazar1" , 15, false);
        Yayin dergi2 = new Dergi("Dergi2", "Yazar2", 10, false);

        yayinlar.add(kitap1);
        yayinlar.add(kitap2);
        yayinlar.add(dergi1);
        yayinlar.add(dergi2);


        Uye uye1 = new Uye("Kader", true);
        Uye uye2 = new Uye("Gökay", false);
        Uye uye3 = new Uye("Alperen", true);

        System.out.println("------YAYINLAR--------");
        for (Yayin yayin : yayinlar) {
            yayin.bilgiGoster();
        }
        System.out.println();
        try {
            // kitap 2 yi uye 2 aldi
            kitap2.oduncAl(uye1);

            // ayni kitabi diger üye almak istiyor
            kitap2.oduncAl(uye3);
        } catch (RuntimeException e) {
            System.out.println("Hata: " + e.getMessage());
        }

        System.out.println();
        try {
            dergi2.oduncAl(uye1);

            // pasif olan üye ödünc almaya calisirsa
            dergi1.oduncAl(uye2);
        } catch (RuntimeException e) {
            System.out.println("Hata: " + e.getMessage());
        }

        System.out.println();
        kitap2.iadeEt();
        System.out.println();

        System.out.println("------GÜNCEL DURUM-------");
        for (Yayin yayin : yayinlar) {
            yayin.bilgiGoster();
        }

    }
}
