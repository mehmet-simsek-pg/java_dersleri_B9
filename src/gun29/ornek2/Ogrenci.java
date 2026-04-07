package gun29.ornek2;

public class Ogrenci extends Kullanici{

    int aldigiDersSayisi;

    public Ogrenci(String ad, String soyad, String email, boolean uyelikDurumu, int aldigiDersSayisi) {
        super(ad, soyad, email, uyelikDurumu);
        this.aldigiDersSayisi = aldigiDersSayisi;
    }

    @Override
    public void bilgiYaz() {
        super.bilgiYaz();
        System.out.println("Aldigi ders sayisi: " +aldigiDersSayisi);
    }

}
