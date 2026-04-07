package gun29.ornek4;

public class Doktor extends Personal{

    private String brans;

    public Doktor(String ad, String soyad, int yas, String gorevYeri, String brans) {
        super(ad, soyad, yas, gorevYeri);
        this.brans = brans;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public void bilgiYaz() {
        super.bilgiYaz();
        System.out.println("Brans: " + brans);
    }
}
