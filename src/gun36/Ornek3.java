package gun36;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ornek3 {
    public static void main(String[] args) {
        /**
         * Bir etkinlik 27 Nisan 2026 19:30’da başlayacak.
         * Program, etkinlikten 1 saat önceki hatırlatma zamanını hesaplayıp yazdırsın.
         * */

        LocalDateTime etkinlikZamani = LocalDateTime.of(2026, 4, 27, 19, 30);

        LocalDateTime hatirlatmaZamani = etkinlikZamani.minusHours(1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        System.out.println("Etkinlik zamani: " + etkinlikZamani.format(formatter));
        System.out.println("Hatirlatma zamani: " + hatirlatmaZamani.format(formatter));
    }
}
