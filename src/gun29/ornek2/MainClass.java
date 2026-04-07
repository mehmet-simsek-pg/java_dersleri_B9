package gun29.ornek2;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir online eğitim platformunda tüm kullanıcıların ortak olarak
         * ad, soyad, email ve üyelik durumu bilgileri bulunuyor.

         * Sistemde farklı kullanıcı türleri var:

         * Öğrenci için aldığı ders sayısı
         * Eğitmen için verdiği ders sayısı ve uzmanlık alanı
         * Yönetici için yetki seviyesi

         * Programda birkaç kullanıcı oluşturulacak.
         * Kullanıcıların bilgileri bir yapıda saklanacak.
         * Email adresi kontrol edilerek geçerli formatta olup olmadığına
         * bakılacak. Ayrıca bazı kullanıcılar için üyelik durumu
         * değiştirilip güncel bilgiler listelenecek.
         * */

        Ogrenci ogrenci = new Ogrenci("Izzet", "Ay", "izzet@gmail.com", true, 4);
        Ogretmen ogretmen = new Ogretmen("Mehmet", "Simsek", "mehmet.gmail.com", true, 4, "IT");
        Yonetici yonetici = new Yonetici("Ebuzer", "hoca", "ebuzer@gmail.com", true, "Admin");

        ArrayList<Kullanici> kullanicilar = new ArrayList<>();
        kullanicilar.add(ogrenci);
        kullanicilar.add(ogretmen);
        kullanicilar.add(yonetici);

        for(Kullanici kullanici: kullanicilar) {
            if (kullanici.getEmail().contains("@")) {
                System.out.println("Gecerli email, kullanici maili: " + kullanici.getEmail());
            } else {
                System.out.println("Hatali email, kullanici maili: " + kullanici.getEmail());
            }
        }

        ogrenci.setUyelikDurumu(false);
        System.out.println("Güncel bilgiler");
        ogrenci.bilgiYaz();

    }
}
