package gun12;

import java.util.Scanner;

public class SuTakibi {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan 7 gün için (Pzt…Paz) günlük içtiği su miktarını (litre) alın.
         * En sonda:
         * Toplam su miktarını yazdırın
         * Ortalama su miktarını yazdırın
         * Hangi gün(ler) ortalamanın altında kaldıysa gün adını yazdırın
         * Ek olarak kullanıcıdan hedef litre alın ve
         * hedefe göre “az / ideal / fazla” mesajı verin.
         * */

        Scanner scanner = new Scanner(System.in);

        String[] days =
                {"Pazartesi", "Sali", "Carsamba",
                        "Persembe", "Cuma", "Cumartesi", "Pazar"};

        double[] su = new double[7];

        // Her gün icin günlük su miktarini aldik
        for (int i = 0; i < days.length; i++) {
            System.out.print(days[i] + " su miktari: ");
            su[i] = scanner.nextDouble();
        }

        double toplam = 0;
        for (int index = 0; index < su.length; index++) {
            toplam += su[index];
        }

        double ortalama = toplam / su.length;

        System.out.println("Toplam su miktari: " + toplam);
        System.out.println("Ortalama su miktari: " + ortalama);

        System.out.println("----Ortalamanin altinda kalan günler-----");
        for (int i = 0; i < su.length; i++) {
            if (su[i] < ortalama) {
                System.out.println(days[i] + " günü " + su[i] + " ortalama altinda kaldi");
            }
        }

        System.out.print("Hedef litre miktari girin: ");
        double hedef = scanner.nextDouble();

        for (int i = 0; i < days.length; i++) {
            if (su[i] < hedef) {
                System.out.println(days[i] + " günü hedefe göre az");
            } else if (su[i] == hedef) {
                System.out.println(days[i] + " günü hedefe uygun");
            } else {
                System.out.println(days[i] + " günü hedeften fazla");
            }
        }

        scanner.close();
    }
}
