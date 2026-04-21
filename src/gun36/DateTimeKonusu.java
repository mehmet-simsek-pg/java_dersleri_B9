package gun36;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeKonusu {
    public static void main(String[] args) {
        /**
         * LocalDateTime -> tarih ve saat bilgilerini tutabiliyoruz.
         * 21.04.2026 ve 18:14 bilgisini tutar.
         * Yil, ay, gün, saat, dakika, saniye, nanosaniye
         * Zaman dilimlerini tutmaz. Yani Berlin ve ya Istanbul saati bilgisini tutmaz

         Nerelerde kullanilir?
         - Randevu uygulamasi
         - Siparis uygulamalari
         - Sinav baslangic zamani
         - Rezervasyon uygulamasi
         - Etkinlik uygulamalari
         * */

        // su an ki tarih ve saat bilgilerini verir
        // her calistirildiginda sonuc degisir
        LocalDateTime simdi = LocalDateTime.now();
        System.out.println("Simdinin tarih ve saati: " + simdi);
        System.out.println("Yil: " + simdi.getYear());
        System.out.println("Ay: " + simdi.getMonthValue());
        System.out.println("Gün: " + simdi.getDayOfMonth());
        System.out.println("Saat: " + simdi.getHour());
        System.out.println("Dakika: " + simdi.getMinute());

        // Istenilen bir tarih saat atamasi
        LocalDateTime tarihSaat = LocalDateTime.of(2026, 4, 21, 21, 0);
        System.out.println("Belirlenen tarih saat: " + tarihSaat);

        // Bu class sadece tarih bilgisini tutar
        LocalDate date = LocalDate.now();
        System.out.println("Tarih: " + date);

        // Bu class sadece saat bilgisini tutar
        LocalTime time = LocalTime.now();
        System.out.println("Saat: " + time);

        // Gün ekleme
        LocalDateTime yeniTarih = simdi.plusDays(2);
        System.out.println("Yeni tarih: " + yeniTarih);

        // Saat ekleme (Saat eklendiginde gece 12 yi gecerse tarih de otomatik artar)
        LocalDateTime yeniSaat = simdi.plusHours(6);
        System.out.println("Yeni saat: " + yeniSaat);

        // Dakika cikarma
        LocalDateTime yeniDakika = simdi.minusMinutes(30);
        System.out.println("Yeni dakika: " + yeniDakika);

        /**
         * Kullanilan methodlar

         * plusDays()
         * plusMonths()
         * plusYears()
         * plusHours()
         * plusMinutes()

         * minusDays()
         * minusHours()
         * minusMinutes()
         * */

        LocalDateTime t1 = LocalDateTime.of(2026, 4, 21, 18,23);
        LocalDateTime t2 = LocalDateTime.of(2026, 6, 23, 11,11);

        System.out.println("t1 t2 den önce mi? " + t1.isBefore(t2));
        System.out.println("t1 t2 den sonra mi? " + t1.isAfter(t2));
        System.out.println("t1 ve t2 esit mi? " + t1.equals(t2));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String sonuc = simdi.format(formatter);
        System.out.println("Formatli simdi: " + sonuc);

        /**
         * Kullanilabilecek format yapilari

         * dd/MM/yyyy HH:mm
         * dd.MM.yyyy
         * HH:mm:ss
         * yyyy-MM-dd HH:mm
         * */

        String data = "20.04.2020 12:00:00";
        LocalDateTime localDateTime = LocalDateTime.parse(data, formatter);
        System.out.println("String verisini localdatetime a dönüstürme: " + localDateTime);
    }
}
