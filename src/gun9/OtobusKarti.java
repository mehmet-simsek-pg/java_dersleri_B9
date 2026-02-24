package gun9;

import java.util.Scanner;

public class OtobusKarti {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan biniş geçmişi alın: "T, O, O, T, X, O" gibi (T=tam, O=ogrenci).
         * Boşlukları temizleyin.
         * Her karakteri kontrol edin (virgül ve boşlukları yok sayın).
         * ücret ekleyin: T=20, O=12, diğer=0.
         * Geçersiz bir karakter varsa sayısını tutun.
         * Toplam ücret ve geçersiz kayıt sayısını yazdırın.
         * Öğrenci binişi 5’ten fazlaysa bonus mesajı verin.
         * */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Binis gecmisi(T/O)");
        String input = scanner.nextLine().trim().toUpperCase();

        int toplamUcret = 0;
        int gecersizBinis = 0;
        int ogrenciBinisi = 0;

        // örn input -> "T, O, O, T, X, O"
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == ',' || ch == ' '){
                continue;
            }

            int ucret;
            switch (ch) {
                case 'T':
                    ucret = 20;
                    break;
                case 'O':
                    ucret = 12;
                    ogrenciBinisi++;
                    break;
                default:
                    ucret = 0;
                    gecersizBinis++;
                    break;
            }
            toplamUcret += ucret;
        }

        System.out.println("Toplam ücret: " + toplamUcret);
        System.out.println("Gecersiz binis sayisi: " + gecersizBinis);

        if (ogrenciBinisi > 5) {
            System.out.println("Ögrenci bonus binis kazandi");
        }
        scanner.close();
    }
}
