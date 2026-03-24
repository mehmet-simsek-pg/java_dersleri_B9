package gun22;

import java.util.*;

public class KelimeAnalizAraci {

    public static List<String> kelimelereAyir(String veri) {
        List<String> kelimeler = new ArrayList<>();

        String[] parcalar = veri.split(" ");
        for (String parca : parcalar) {
            parca = parca
                    .trim()
                    .replace(".", "")
                    .replace(",", "")
                    .replace("!", "")
                    .toLowerCase();

            if (!parca.isEmpty()) {
                kelimeler.add(parca);
            }
        }
        return kelimeler;
    }

    public static Set<String> benzersiz(List<String> kelimeler) {
        return new LinkedHashSet<>(kelimeler);
    }

    public static void secimAnalizi(int secim, List<String> kelimeler, Set<String> benzersiz, Scanner girdi) {
        switch (secim) {
            case 1:
                System.out.println("Kelimeler: " + kelimeler);
                break;
            case 2:
                System.out.println("Benzersiz kelimeler: " + benzersiz);
                break;
            case 3:
                System.out.print("Aranacak kelimeliyi girin: ");
                String aranacak = girdi.nextLine().trim();
                System.out.println("Tekrar sayisi: " + kelimeSayisiBul(aranacak, kelimeler));
                break;
            case 4:
                System.out.println("Uzunlugu 4'ten büyük olan kelimeler");
                uzunKelimeler(kelimeler);
                break;
            default:
                System.out.println("Gecersiz secim yaptiniz");
                break;
        }
    }

    public static int kelimeSayisiBul(String aranacak, List<String> kelimeler) {

        int sayac = 0;
        for (String kelime : kelimeler) {
            if (kelime.equalsIgnoreCase(aranacak)) {
                sayac++;
            }
        }
        return sayac;
    }

    public static void uzunKelimeler(List<String> kelimeler) {
        for (String kelime : kelimeler) {
            if (kelime.length() > 4) {
                System.out.println(kelime);
            }
        }
    }

    public static void main(String[] args) {
        /**
         * Kullanıcı bir cümle giriyor.
         * Örnek giriş:
         * Java öğrenmek eğlencelidir ama Java pratik yapmadan öğrenilmez
         * Programdan istenenler:
         * Cümleyi kelimelere ayırsın.
         * Tüm kelimeleri bir listede saklasın.
         * Aynı kelimeleri tekrarsız şekilde başka bir yapıda saklasın.
         * Her kelimeyi düzenleyip noktalama veya gereksiz boşlukları
         * mümkün olduğunca temizlesin.
         * Kullanıcıdan analiz tipi alınsın:
         * 1 → Tüm kelimeleri yazdır
         * 2 → Tekrarsız kelimeleri yazdır
         * 3 → Belirli bir kelimenin kaç kez geçtiğini göster
         * 4 → Uzunluğu 4’ten büyük olan kelimeleri yazdır
         * Bu işlemlerin her biri metodlarla çözülsün.
         * Özellikle bir metod, verilen kelimenin listede kaç kez
         * geçtiğini hesaplasın.
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle girin");
        String cumle = scanner.nextLine().trim();

        List<String> kelimeler = kelimelereAyir(cumle);

        Set<String> benzersiz = benzersiz(kelimeler);

        int secim;

        while (true) {
            System.out.print("1-4 arasi bir secim yapin: ");
            // girilen degerin tam sayi olup olmadigina bakiyor
            if (scanner.hasNextInt()){
                secim = scanner.nextInt();
                scanner.nextLine(); // buffer temizleme
                if (secim >=1 && secim <= 4) {
                    secimAnalizi(secim, kelimeler, benzersiz, scanner);
                    break;
                } else {
                    System.out.println("Lütfen 1-4 arasi bir sayi girin");
                }
            } else {
                System.out.println("Hatali giris yaptiniz");

                // hatali girilen degeri silip yenisini almak icin kullandik.
                scanner.next();
            }
        }

        scanner.close();
    }
}
