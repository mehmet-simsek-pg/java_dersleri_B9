package gun34.ornek2;

public class Dergi extends Yayin{

    public Dergi(String ad, String yazarAdi, int sayfaSayisi, boolean oduncteMi) {
        super(ad, yazarAdi, sayfaSayisi, oduncteMi);
    }

    @Override
    public String tur() {
        return "Dergi";
    }
}
