package gun20;

import java.util.Scanner;

public class MethodKonuAnlatimi {

    public static void toplamYaz(int a, int b) {
        int toplam = a + b;
        System.out.println("Toplam: " + toplam);
    }

    public static void main(String[] args) {
        /**
         * Belirli bir isi yapan kod bloklaridir.
         * 2 sayinin toplamasini yaptirdim yazdigim kodun basinda.
         * Ayni sekilde bu toplama isleminde yazilan kodun ortasinda ve
         * sonunda yeniden ayni yaptim.
         * Tekrar eden ayni olan kodlari bir blok haline getirdigimiz
         * yapilara method denir.
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.print("ilk sayiyi girin: ");
        int a = scanner.nextInt();
        System.out.print("ikinci sayiyi girin: ");
        int b = scanner.nextInt();

        toplamYaz(a, b);
        carpmaYaz(a, b);

        // erisim beliryeci -> public
        // static -> nesne olusturmadan direkt metodu cagirmayi saglar
        // void -> geri dönüs tipi
        // toplamYaz -> metodun adi
        // int a ve int b -> methodun parametreleri

        // Methodlar main metodu disinda tanimlanir
        // (main metodun yukarisinda ya da asagisinda olmasi fark etmez.
        // önemli olan parantezleri disinda olmasi).
        // Kullanilmak istendiginde
        // main metod icerisinden ulasilir.

    }

    public static void carpmaYaz(int a, int b) {
        int sonuc = a * b;
        System.out.println("Carpma sonucu: " + sonuc);
    }
}
