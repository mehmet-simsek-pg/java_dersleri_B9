package gun33.ornek1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        /**
         * Bir ATM uygulamasında kullanıcıdan çekmek istediği para miktarı alınacaktır.
         * Kullanıcı sayı yerine metin girerse hata mesajı verilsin.
         * Eğer sayı doğru girilirse ekrana çekilmek istenen tutar yazdırılsın.
         * */

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Cekmek istediginiz tutari girin: ");
            int tutar = scanner.nextInt();
            if (tutar < 0) {
                // hata mesaji firlattik
                throw new IllegalArgumentException("Negatif tutar cekilir mi akilli");
            }

            System.out.println("Cekmek istediginiz tutar " + tutar + " TL dir");
        } catch (InputMismatchException exception) {
            // hatayi yakaladik
            System.out.println("Hatali giris yaptiniz, lütfen sayi girin");
        }

    }
}
