package gun11;

import java.util.Scanner;

public class OtobusKarti {
    public static void main(String[] args) {
        // Kullanicidan 7 günlük harcama girmesini iste. Toplam harcamayi bulalim.
        // Limit degeri alalim, eger limit asilirsa uyari verelim

        Scanner scanner = new Scanner(System.in);

        System.out.print("Haftalik limiti girin: ");
        double limit = scanner.nextDouble();

        double[] gunluk = new double[7];
        double toplam = 0;

        for (int i = 0; i < gunluk.length; i++) {
            System.out.print((i + 1) + ". gün harcamasi: ");
            double input = scanner.nextDouble();

            if (input < 0) {
                System.out.println("Harcama negatif olamaz");
                input = 0;
            }

            gunluk[i] = input;
            toplam += input;
        }

        System.out.println("Toplam harcama: " + toplam);

        if (toplam > limit) {
            System.out.println("Limit asildi karta para yükleyin");
        }
    }
}
