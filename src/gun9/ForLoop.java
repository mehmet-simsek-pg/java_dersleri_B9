package gun9;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        /**
         * for(baslangic; kosul; artma/azaltma;) {
         *     // döngünün gövdesi
         * }
         *
         * baslangic: sayac diyebiliriz buna. ilk kisimda tanimlanir.
         * kosul: true oldugu sürece döngü tekrar edecek
         * artma/azaltma: her tekrar/tur sonunda sayac degisecek
         * */

        for(int i = 1; i<=5; i++) {
            // döngü gövdesine örnek olmasi icin i degerini yazdik
            // baska kod bloklari da olabilir burada. Döngü icin tanimladigim
            // i degeri döngü gövdesindeki kodlarin kac kez tekrar edecegini belirtir.
            System.out.println(i);
        }

        /**
         * while döngüsünde -> ne zaman bitecegi kosula bagli.
         * örn: kullanici giris ,dogrulama..
         *
         * for -> kac kere dönecegi belli. örn: sayacli islemler
         *
         * for ile yapilan islemleri while ile de yapabiliriz.
         * Ama while ile yapilan her islemi for ile yapamayiz
         * */

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int j = 0;
        while (j<5) {
            System.out.println(j);
            j++;
        }
        System.out.println("---------------");

        Scanner scanner = new Scanner(System.in);

        String pass = "";
        while (!pass.equals("1234")) {
            System.out.print("Sifre girin:");
            pass = scanner.nextLine().trim();
        }
        System.out.println("Giris basarili");

        System.out.println("-----------");
        for (int k = 10; k>=0; k--) {
            System.out.println(k);
        }

        System.out.println("-------------");
        for(int t = 2; t <= 10; t += 2) {
            System.out.println(t);
        }

        System.out.println("--------------");
        for(int i = 0, l = 10; i <= l; i++, l--){
            System.out.println("i: " + i + ", l:" + l);
        }
        System.out.println("-----------");

        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                break; // buradaki break tüm for döngüsünü durdurur
            }
            System.out.println(i);
        }

        System.out.println("------------");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // bunun sayesinde cift sayilar yazilacak.
                // if blogu icerisine her girdiginde asagi satira inmeden döngü icerisinde
                // yukari cikacak kod
            }
            System.out.println(i);
        }

    }
}
