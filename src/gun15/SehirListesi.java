package gun15;

import java.util.ArrayList;
import java.util.Scanner;

public class SehirListesi {
    public static void main(String[] args) {
        /**
         * Kullanicidan kac tane sehir ismi girecegini alin.
         * Sonrasinda kullanicidan silmek istedigi sehir ismini alin.
         * Eger bu isim liste icerisinde varsa listenden silin ve silindi yazdirin
         * yoksa sehir bulunamadi yazdirin.
         * */

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> sehirler = new ArrayList<>();
        System.out.println("Kac sehir ismi gireceksiniz?");
        int miktar = scanner.nextInt();
        scanner.nextLine();

        // 1. Cözüm
        for (int index = 0; index < miktar; index++) {
            while (true) {
                System.out.print((index + 1) + ". isim: ");
                String isim = scanner.nextLine().trim();

                if (isim.isEmpty()) {
                    System.out.println("Sehir ismi bos olamaz.");
                } else {
                    sehirler.add(isim);
                    break;
                }
            }
        }
        // Izzet in cözümü
//        for (int index = 0; index < miktar; index++) {
//
//                System.out.print((index + 1) + ". isim: ");
//                String isim = scanner.nextLine().trim();
//
//                if (isim.isEmpty()) {
//                    System.out.println("Sehir ismi bos olamaz.");
//                    index--;
//                } else {
//                    sehirler.add(isim);
//                    break;
//                }
//        }

        System.out.print("Silmek istediginiz sehir ismi: ");
        String silinecek = scanner.nextLine().trim();

        int index = -1;
        for (int i = 0; i < sehirler.size(); i++) {

            if (silinecek.equalsIgnoreCase(sehirler.get(i))) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Aranan sehir bulunamadi");
        } else {
            sehirler.remove(index);
            System.out.println("Sehir silindi");
            System.out.println("Listedeki geri kalan sehirler");
            System.out.println(sehirler);
            System.out.println("Listedeki sehirlerin miktari: " + sehirler.size());
        }
    }
}
