package gun36;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ornek1 {
    public static void main(String[] args) {
        /**
         * Bir hastanın randevusu 25 Nisan 2026
         * saat 14:30 olarak oluşturuluyor.
         * Program bu randevu zamanını ekrana yazdırsın.
         * */

        LocalDateTime randevu = LocalDateTime.of(2026,4,25,14,30);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        System.out.println("Randevu zamani: " + randevu.format(formatter));
    }
}
