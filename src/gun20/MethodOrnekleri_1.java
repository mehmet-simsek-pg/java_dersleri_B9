package gun20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodOrnekleri_1 {

    public static void main(String[] args) {
        // kullancidan alinan 5 sayinin
        // tek mi cift mi oldugunu bulup
        // bir listeye kaydeden bir metod yazin

        Scanner scanner = new Scanner(System.in);

        /*
        System.out.print("Sayi girin: ");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Sayi cifttir");
        } else {
            System.out.println("Sayi tektir");
        }
*/
        List<Boolean> sayilarinDurumu = new ArrayList<>();

        for (int index = 1; index <= 5; index++) {
            System.out.println(index + ". sayiyi girin: ");
            int num = scanner.nextInt();
            boolean result = ciftMi(num);
            sayilarinDurumu.add(result);
        }

        for (boolean sonuc : sayilarinDurumu) {
            if (sonuc) {
                System.out.println("Sayi cifttir");
            } else {
                System.out.println("Sayi tektir");
            }
        }
    }

    public static boolean ciftMi(int sayi) {
        if (sayi % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
