package gun24;

import gun24.ogrenci.Ogrenci;

public class NonAccessModifiers {
    /**
     * Non access modifiers:
     * 1. static -> bir metodu static yaparsak
     * o metodu nesne olusturmadan, class ismi ile kullanabiliriz.
     * bir degiskeni static yaparsak,
     * o class dan olusturulan tüm nesneler icin
     * bu degisken ortak olur.

     * 2. final -> degismezlik ve ya sinir koyma olarak tanimlanabilir.
     * Degeri belli olan ve sonradan degistirilmesin istedigim degiskenleri final ile tanimlarim

     * 3. abstract
     * */
    public static void main(String[] args) {
        Calisan calisan1 = new Calisan();
        Calisan calisan2 = new Calisan();

        calisan1.isim = "Mehmet";
        calisan1.soyisim = "Simsek";

        calisan2.isim = "Kader";
        calisan2.soyisim = "Topan";

        System.out.println(calisan1.soyisim);
        System.out.println(calisan2.isim);
        // sirketIsmi degiskeni static olarak tanimlandigi icin
        // her iki nesneye ait ortak bir deger oldu
        // static degisken nesneye ait degildir, class a aittir.
        // o yüzden kullanirken class ismi ile kullaniriz.
        System.out.println(Calisan.sirketIsmi);

        Calisan.sirketIsmi = "Techno Study New";
        System.out.println(Calisan.sirketIsmi);

        String cumle = "Bugün hava cok guzel";
        System.out.println("Toplam karakter sayisi: " + cumle.length());

        int a = 12;
        int b = 34;
        int max = Math.max(a,b);
        System.out.println("Max: " + max);

        // PI degiskeni final olarak tanimlandigi icin
        // degerini degistiremiyoruz.
        // Sabitler.PI = 23;

        System.out.println("Kare alani: " + GeometriHesapla.kare(5));
        System.out.println("Diktörgenin alani: "
                + GeometriHesapla.dikdortgen(4,5));

    }
}
