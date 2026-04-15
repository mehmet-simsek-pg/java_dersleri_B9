package gun33.ornek2;

import java.util.Scanner;

public class Notlar {
    public static void main(String[] args) {
        /**
         * Bir öğretmenin elinde öğrencilerin notlarını tutan bir dizi vardır.
         * Kullanıcıdan bir index alınsın ve o index’teki not gösterilsin.
         * Geçersiz index girilirse uygun hata mesajı verilsin.
         * */

        int[] notlar = {98, 45, 67, 87, 55};

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Hangi siradaki notu görmek istiyorsunuz? ");
            int index = scanner.nextInt();

            System.out.println("Secilen not: " + notlar[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Aradiginiz index array sinirlari disindadir");
            System.out.println("Hata: " + e.getMessage());
        } finally {
            scanner.close();
        }

    }
}
