package gun15;

import java.util.ArrayList;
import java.util.Scanner;

public class NotListesi {
    public static void main(String[] args) {
        /**
         * Kullanicidan notlar alin.
         * -1 girilince giris bitsin.
         * Sonunda:
         * Notlari yazdirin.
         * Ortalamayi hesaplayin.
         * En yüksek ve en düsük notlari yazdirin.
         * Kurallar:
         * Notlar 0-100 arasi olmali, degilse listeye eklenmesin.
         * */

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> notlar = new ArrayList<>();

        System.out.println("Not girin. Notlar 0-100 arasinda olmali. Bitirmek icin -1 yazin");

        while (true) {
            System.out.print("Not: ");
            int not = scanner.nextInt();

            if (not == -1) {
                break;
            }

            if (not < 0 || not > 100) {
                System.out.println("Gecersiz not girisi yapildi. 0-100 arasinda notlar girin");
                continue;
            }
            notlar.add(not);
        }

        int toplam = 0;
        int max = notlar.get(0);
        int min = notlar.get(0);

        for (int index = 0; index < notlar.size(); index++) {

            toplam += notlar.get(index);

            if (notlar.get(index) > max) {
                max = notlar.get(index);
            }

            if (notlar.get(index) < min) {
                min = notlar.get(index);
            }
        }

        double ortalama = (double) toplam / notlar.size();

        System.out.println("-----Notlar------");
        for (int i = 0; i < notlar.size(); i++) {
            System.out.println((i + 1) + ". not " + notlar.get(i));
        }

        System.out.println("Ortalama: " + ortalama);
        System.out.println("En büyük: " + max);
        System.out.println("En kücük: " + min);
    }
}
