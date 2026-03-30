package gun25.ornek1;

public class Ogrenci {

    public String ad;
    public int yas;

    // paramaetresiz constructor
    public Ogrenci() {
        ad = "Bilinmiyor";
        yas = 0;
    }

    public Ogrenci(String isim, int age) {
        ad = isim;
        yas = age;
    }
}
