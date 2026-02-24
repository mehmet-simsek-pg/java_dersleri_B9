package gun9;

import java.util.Scanner;

public class KafeSiparisKodu {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan bir sipariş kodu alın.
         * Baş/son boşlukları temizleyin.
         * Kod uzunluğu 8 değilse hata yazdırın.
         * Kodun ilk karakteri sipariş tipini belirlesin:
         * K → kahve, C → çay, L → limonata, diğer → geçersiz
         * Kodun içinde kaç tane rakam olduğunu sayın.
         * Rakam sayısı en az 3 değilse uyarı yazdırın.
         * Son olarak kodun ilk 3 karakterini yazdırın.
         * */

        Scanner scanner = new Scanner(System.in);
        // scan -> degisken ismi, istedigimiz ismi verebiliriz. sc, oku, bilgiAl vs..
        // scanner -> yaziyoruz kullanim mantigindan dolayi. Scanner class ini kullaniyoruz
        // ama tanimlamayi en basta yapiyoruz. Kodun devam eden kisminda
        // hangi ismi vermistim diye bakmak yerine mantikli isimlendirme yapiyoruz.

        String drink;
        String code;
        do {
            System.out.println("Siparis kodunu girin");
            code = scanner.nextLine().trim().toLowerCase();
            // case lerde k,c,l kücük harflerle yazdigim icin
            // code a toLowerCase() metodunu uyguladik

            if (code.length() != 8) {
                System.out.println("Kodun uzunlugu 8 olmali");
            }
        } while (code.length() != 8);

            char first = code.charAt(0);
            switch (first) {
                case 'k':
                    drink = "Kahve";
                    break;
                case 'c':
                    drink = "Cay";
                    break;
                case 'l':
                    drink = "Limonata";
                    break;
                default:
                    drink = "Gecersiz icecek";
                    break;
        }
        // örn code -> KAHVE-345
        int rakamSayisi = 0;

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i); // 0. index, 1.index .... charAt(code.length)
            if (ch >= '0' && ch <= '9') {
                rakamSayisi++;
            }
        }

        if (rakamSayisi < 3) {
            System.out.println("Kod en az 3 rakam icermeli");
        }

        System.out.println("Kodun ilk 3 karakteri: " + code.substring(0, 3));
        System.out.println("Icecek türü: " + drink);




















    }
}
