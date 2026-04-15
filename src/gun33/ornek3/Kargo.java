package gun33.ornek3;

import java.util.Scanner;

public class Kargo {
    public static void main(String[] args) {
        /**
         * Bir kargo firmasında toplam ürün sayısı,
         * koli sayısına bölünerek koli başına düşen ürün miktarı hesaplanacaktır.
         * Koli sayısı 0 girilirse hata mesajı verilsin.
         * */

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Toplam ürün sayisi: ");
            int toplam = scanner.nextInt();

            System.out.print("Koli sayisi: ");
            int koliSayisi = scanner.nextInt();

            int sonuc = toplam / koliSayisi;

            System.out.println("Her koli de ortalama " + sonuc + " ürün vardir");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Hata: Koli sayisi 0 olamaz");
        } finally {
            scanner.close();
        }


    }
}
