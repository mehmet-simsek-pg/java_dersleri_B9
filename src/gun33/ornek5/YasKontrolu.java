package gun33.ornek5;

import java.util.Scanner;

public class YasKontrolu {
    public static void main(String[] args) {
        /**
         * Bir etkinlik kaydında kullanıcı yaşı negatif girilmemelidir.
         * Eğer kullanıcı negatif yaş girerse program kendi hatasını oluştursun
         * ve uygun mesaj versin.
         */

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Yasinizi girin: ");
            int yas = scanner.nextInt();

            if (yas < 0) {
                throw new IllegalArgumentException("Yas 0 dan kücük olamaz");
            }

            System.out.println("Girilen yas: " + yas);
        } catch (IllegalArgumentException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}
