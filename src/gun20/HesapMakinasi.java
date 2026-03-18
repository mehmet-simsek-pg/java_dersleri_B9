package gun20;

import java.util.Scanner;

public class HesapMakinasi {
    public static void islemlerMenusu() {
        System.out.println("-------Islemler------");
        System.out.println("Toplama icin +");
        System.out.println("Cikarma icin -");
        System.out.println("Carpma icin *");
        System.out.println("Bölme icin /");
    }

    public static void sonuc(String islem, int sayi1, int sayi2) {
        switch (islem) {
            case "+":
                System.out.println("Toplam: " + (sayi1 + sayi2));
                break;
            case "-":
                System.out.println("Cikarma: " + (sayi1 - sayi2));
                break;
            case "*":
                System.out.println("Carpma: " + (sayi1 * sayi2));
                break;
            case "/":
                System.out.println("Bölme: " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("Gecersiz islem");
        }
    }

    public static void main(String[] args) {
        /**
         * Kullanicidan 5 defa 2 ser adet sayi ve islem alin.
         * Kullanicinin sectigi isleme göre
         * cevaplari sirasiyla ekrana yazdirin.
         * */

        Scanner scanner = new Scanner(System.in);

        for (int index = 1; index <= 5; index++) {
            System.out.print("1. sayi: ");
            int sayi1 = scanner.nextInt();
            System.out.print("2. sayi: ");
            int sayi2 = scanner.nextInt();

            scanner.nextLine();

            islemlerMenusu();
            System.out.println("Islem secin: ");
            String islem = scanner.nextLine().trim();

            sonuc(islem, sayi1, sayi2);
        }
    }
}
