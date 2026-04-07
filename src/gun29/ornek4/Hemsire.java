package gun29.ornek4;

public class Hemsire extends Personal{

    private int nobetSayisi;

    public Hemsire(String ad, String soyad, int yas, String gorevYeri, int nobetSayisi) {
        super(ad, soyad, yas, gorevYeri);
        this.nobetSayisi = nobetSayisi;
    }

    public int getNobetSayisi() {
        return nobetSayisi;
    }

    public void setNobetSayisi(int nobetSayisi) {
        this.nobetSayisi = nobetSayisi;
    }

    @Override
    public void bilgiYaz() {
        super.bilgiYaz();
        System.out.println("Nöbet sayisi: " + nobetSayisi);
    }
}
