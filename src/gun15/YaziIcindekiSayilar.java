package gun15;

import java.util.ArrayList;
import java.util.Scanner;

public class YaziIcindekiSayilar {
    public static void main(String[] args) {
        /**
         * Kullanicidan bir yazi girmesini isteyin.
         * Bu yazi icerisinde kac tane sayisal deger oldugunu bulun.
         * Son olarak bu sayisal degerleri ekrana yazdirin.
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir yazi girin. Yazi icerisinde sayisal ifadelerde olabilir.");
        String text = scanner.nextLine().trim();

        int toplam = 0;
        ArrayList<Integer> sayilar = new ArrayList<>();

        // örn text -> Password123
        for (int index = 0; index < text.length(); index++) {
            char ch = text.charAt(index);

            if (ch >= '0' && ch <= '9') {
                toplam++;
                int sayi = ch - '0'; // char olarak gelen rakami int e cevirdik
                sayilar.add(sayi);
            }
        }

        System.out.println("Bu yazi icerisinde toplam " + toplam + " sayisal ifade vardir");
        System.out.println(sayilar);
    }
}
