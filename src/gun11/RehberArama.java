package gun11;

import java.util.Scanner;

public class RehberArama {
    public static void main(String[] args) {
        /**
         * Kullanicidan 5 tane isim alalim, bunlari rehbere kaydedelim.
         * Daha sonra kullanici isim girip arama yapsin rehberde,
         * aradigi isim varsa "Rehberde var", yoksa "Rehberde yok" yazalim
         * */

        Scanner scanner = new Scanner(System.in);

        String[] isimler = new String[5];

        // for döngüsü ile rehberi olusturduk
        for (int index = 0; index < isimler.length; index++) {
            System.out.print((index + 1) + ". ci isim: ");
            isimler[index] = scanner.nextLine().trim();

            // bos girdi yapilirsa, rehbere bilinmiyor diye kayit yapalim
            if (isimler[index].isEmpty()) {
                isimler[index] = "Bilinmeyen kisi";
            }
        }

        System.out.print("Aramak istediginiz kisinin adini yazin: ");
        String aranan = scanner.nextLine().trim();

        boolean varMi = false;

        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].equalsIgnoreCase(aranan)) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            System.out.println("Rehberde var");
        } else {
            System.out.println("Rehberde yok");
        }
        scanner.close();
    }
}
