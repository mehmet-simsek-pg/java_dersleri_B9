package gun36;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ornek2 {
    public static void main(String[] args) {
        /**
         * Bir kargonun teslim edilmesi gereken zaman 26 Nisan 2026 18:00 olsun.
         * Gerçek teslim zamanı ise 26 Nisan 2026 20:15 olsun.
         * Program, kargonun geç teslim edilip edilmediğini kontrol etsin.
         * */

        LocalDateTime plananTeslimZamani = LocalDateTime.of(2026, 4, 26, 18, 0);
        LocalDateTime gercekTeslimZamani = LocalDateTime.of(2026, 4, 26, 20, 15);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        System.out.println("Planlanan teslim zamani: " + plananTeslimZamani.format(formatter));
        System.out.println("Gercek teslim zamani: " + gercekTeslimZamani.format(formatter));

        if (gercekTeslimZamani.isAfter(plananTeslimZamani)) {
            System.out.println("Kargo gec teslim edilmistir");
        } else {
            System.out.println("Kargo zamaninda teslim edilmistir");
        }

    }
}
