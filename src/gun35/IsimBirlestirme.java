package gun35;

import java.util.Scanner;

public class IsimBirlestirme {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan ad ve soyadı ayrı ayrı alınsın.
         * Bu iki bilgi StringBuilder kullanılarak tek bir metinde birleştirilsin.
         * Çıktı şu formatta olsun:

         * Ad Soyad: Mehmet Simsek
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adinizi girin: ");
        String ad = scanner.nextLine();

        System.out.print("Soyadinizi girin: ");
        String soyad = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        sb.append("Ad Soyad: ");

        sb.append(ad);

        sb.append(" ");

        sb.append(soyad);

        System.out.println(sb);

        scanner.close();
    }
}
