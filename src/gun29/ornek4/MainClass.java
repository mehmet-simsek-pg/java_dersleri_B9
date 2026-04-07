package gun29.ornek4;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir hastanede tüm çalışanların ortak olarak
         * ad, soyad, yaş ve görev yeri bilgileri tutuluyor.

         * Çalışanlar farklı gruplara ayrılıyor:

         * Doktor için branş bilgisi
         * Hemşire için nöbet sayısı
         * Sekreter için masa numarası

         * Sistemde birkaç personel tanımlanacak.
         * Kullanıcıdan bir personelin adı alınacak ve o kişiye ait bilgiler
         * gösterilecek. Eğer isimde boşluk fazlalığı varsa düzenlenerek
         * işlem yapılacak. Ayrıca belirli bölümlerde çalışan personeller
         * ayrı şekilde listelenecek.
         * */

        Scanner scanner = new Scanner(System.in);

        Doktor doktor = new Doktor("Alperen", "Aycicegi", 23, "Kardiyoloji", "Kalp Cerrahi");
        Hemsire hemsire = new Hemsire("Ayse", "Kaplan", 45, "Acil", 5);
        Sekreter sekreter = new Sekreter("Faruk", "Yetis", 18, "Acil", 34);

        ArrayList<Personal> personals = new ArrayList<>();

        personals.add(doktor);
        personals.add(hemsire);
        personals.add(sekreter);

        System.out.print("Personal adi: ");
        String aranan = scanner.nextLine().trim();

        boolean personalVarMi = false;

        for (Personal personal : personals) {
            if (personal.getAd().equalsIgnoreCase(aranan)) {
                personalVarMi = true;
                personal.bilgiYaz();
            }
        }

        if (!personalVarMi) {
            System.out.println("Aradiginiz personal bizde calismamaktadir");
        }

        System.out.println("-------Acilde Calisanlar----------");
        for (Personal personal : personals) {
            if (personal.getGorevYeri().equalsIgnoreCase("Acil")) {
                personal.bilgiYaz();
                System.out.println("-------------");
            }
        }
    }

}
