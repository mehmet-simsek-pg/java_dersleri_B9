package gun34.ornek2;

public abstract class Yayin {

    String ad;
    String yazarAdi;
    int sayfaSayisi;
    boolean oduncteMi;

    public Yayin(String ad, String yazarAdi, int sayfaSayisi, boolean oduncteMi) {
        this.ad = ad;
        this.yazarAdi = yazarAdi;
        this.sayfaSayisi = sayfaSayisi;
        this.oduncteMi = oduncteMi;
    }

    public void bilgiGoster() {
        System.out.println("Ad: " + ad + ", yazar adi: " + yazarAdi + ", sayfa sayisi: "
                + sayfaSayisi + ", ödüncte mi? " + (oduncteMi ? "Evet" : "Hayir"));

    }

    public abstract String tur();

    public void oduncAl(Uye uye) {

        if (!uye.aktifMi) {
            throw new RuntimeException("Üye aktif degildir");
        }

        if (oduncteMi) {
            throw new RuntimeException(ad + " zaten ödünc verilmistir.");
        }

        oduncteMi = true;
        System.out.println(uye.ad + ", " + ad + " yayini ödünc aldi");

    }

    public void iadeEt() {
        oduncteMi = false;
        System.out.println(ad + " iade edildi");
    }
}
