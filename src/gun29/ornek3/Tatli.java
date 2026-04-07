package gun29.ornek3;

public class Tatli extends Urun {

    private boolean serbetliMi;

    public Tatli(String ad, double fiyat, String kategori, boolean serbetliMi) {
        super(ad, fiyat, kategori);
        this.serbetliMi = serbetliMi;
    }

    public boolean isSerbetliMi() {
        return serbetliMi;
    }

    public void setSerbetliMi(boolean serbetliMi) {
        this.serbetliMi = serbetliMi;
    }

    @Override
    public void bilgiYaz() {
        super.bilgiYaz();
        System.out.println("Serbetli mi? " + serbetliMi);
    }
}
