package gun33;

import java.util.Scanner;

public class TryCatchKullanimi {
    public static void main(String[] args) {

        /**
         * ArithmeticException, NullPointerException vb.
         * hatayi yakalayan nesnelerdir.
         * e bir degisken ismidir.

         e.getMessage();
         e.printStackTrace();
         e.toString();
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. sayi: ");
        int sayi1 = scanner.nextInt();

        System.out.print("2. sayi: ");
        int sayi2 = scanner.nextInt();

        try {
            // hata olusabilecek kod blogu yazilir
            int sonuc = sayi1 / sayi2;
            System.out.println("Sonuc: " + sonuc);
        } catch (ArithmeticException e) {
            // e burada degisken ismi, istedigimiz degeri yazabiliriz
            // genelde e, ex ya da exception diye tanimlanir
            // try blogunda hata olusursa catch blogu calisir
            System.out.println("Sayi 0 a bölünemez");
            System.out.println("Hata mesaji: " + e.getMessage());
            System.out.println("Hata tipi: " + e.toString());
            // catch icerisinde Exception kullanmakta sorun yok ama Exception parent
            // class oldugu icin spesifik olanlari kullanmak daha mantikli. Bunu bulmanin
            // yolu da toString metodunu kullanmak
        } finally {
            // bu bölüm her iki durumda da calisir, hata olsa da olmasa da
            System.out.println("Bu blok her iki durumda da calisir.");
            scanner.close();
        }

        System.out.println("-----------");

        try {
            String text = null;
            System.out.println("Text in uzunlugu: " + text.length());
        } catch (ArithmeticException e) {
            System.out.println("Matematiksel bir hata olustu");
        } catch (NullPointerException e) {
            System.out.println("Null bir deger üzerinden islem yapilamaz");
        }

        /**
         * Java da Exception lar kalitim yoluyla düzenlenmistir
         * En üstte Throwable vardir
         * Onun altinda Exception vardir
         * Onun da altinda özel exception classlari(türleri) vardir
         * */

    }
}
