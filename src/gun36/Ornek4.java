package gun36;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ornek4 {
    public static void main(String[] args) {
        /**
         * Bir araç otoparka 28 Nisan 2026 09:20’de giriş yapıyor.
         * Çıkış zamanı ise 28 Nisan 2026 14:50.
         * Program giriş ve çıkış zamanlarını yazdırsın
         * ve hangisinin önce olduğunu kontrol etsin.
         * */

        LocalDateTime giris = LocalDateTime.of(2026, 4, 28, 9, 20);
        LocalDateTime cikis = LocalDateTime.of(2026, 4, 28, 14, 50);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        System.out.println("Giris zamani: " + giris.format(formatter));
        System.out.println("Cikis zamani: " + cikis.format(formatter));

        if (giris.isBefore(cikis)) {
            System.out.println("Zaman bilgileri dogru siradadir");
        } else {
            System.out.println("Zaman bilgileri hatalidir");
        }
    }
}
