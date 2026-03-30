package gun24.main;

import gun24.ogrenci.Ogrenci;

public class MainClass {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        // isim degiskeni public oldugu icin ulasabildik
        ogrenci.isim = "Mehmet";

        // soyisim degiskeni default oldugu icin baska paket icinden erisemedik
        //ogrenci.soyisim = "";

        // no degiskeni private oldugu icin sadece kendi class i icinden erisilebilir
        //ogrenci.no = 2345;

        ogrenci.bilgiYaz();
    }
}
