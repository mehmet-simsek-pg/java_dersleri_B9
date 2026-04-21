package gun35;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SifreYoneticisi {
    public static void main(String[] args) {
        /**
         * Proje5 - Task2
         * */

        Scanner scanner = new Scanner(System.in);

        // Ana veri yapimiz:
        // Dis map -> hesap adi
        // ic map -> kullanici adi, sifre bilgileri
        Map<String, Map<String, String>> sifreKayitlari = new HashMap<>();

        Map<String, String> gmailBilgisi = new HashMap<>();
        gmailBilgisi.put("kullaniciAdi", "mehmet123");
        gmailBilgisi.put("sifre", "12345");

        sifreKayitlari.put("gmail", gmailBilgisi);

        boolean flag = false;

        do {
            menu();
            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    System.out.print("Hesap adi girin: ");
                    String hesapAdi = scanner.nextLine().toLowerCase();

                    System.out.print("Kullanici adi girin: ");
                    String kullaniciAdi = scanner.nextLine().toLowerCase();

                    System.out.print("Sifre girin: ");
                    String sifre = scanner.nextLine();

                    Map<String, String> hesapBilgileri = new HashMap<>();
                    hesapBilgileri.put("kullaniciAdi", kullaniciAdi);
                    hesapBilgileri.put("sifre", sifre);

                    sifreKayitlari.put(hesapAdi, hesapBilgileri);

                    System.out.println("Sifre kaydi basariyla olusturuldu");
                    break;
                case 2:
                    System.out.print("Gösterilecek hesap adini girin: ");
                    String arananHesap = scanner.nextLine().toLowerCase();

                    if (sifreKayitlari.containsKey(arananHesap)) {
                        Map<String, String> bulunanKayit = sifreKayitlari.get(arananHesap);

                        System.out.println("Kayit bulundu");
                        System.out.println("Kullanici adi: " + bulunanKayit.get("kullaniciAdi"));
                        System.out.println("Sifre: " + bulunanKayit.get("sifre"));

                    } else {
                        System.out.println("Bu hesap adina ait kayit bulunamadi");
                    }
                    break;
                case 3:
                    System.out.println("Program kapatildi");
                    flag = true;
                    break;
                default:
                    System.out.println("Gecersiz secim yaptiniz. Program sonlandiriliyor");
            }
        } while (!flag);

    }

    public static void menu() {
        System.out.println("---MENU----");
        System.out.println("1 - Sifre Ekle");
        System.out.println("2 - Sifre Göster");
        System.out.println("3 - Cikis");
        System.out.print("Seciminizi yapin: ");
    }
}
