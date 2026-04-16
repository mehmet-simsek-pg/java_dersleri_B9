package gun34.ornek2;

public class Kitap extends Yayin{

    public Kitap(String ad, String yazarAdi, int sayfaSayisi, boolean oduncteMi) {
        super(ad, yazarAdi, sayfaSayisi, oduncteMi);
    }

    @Override
    public String tur() {
        return "Kitap";
    }
}
