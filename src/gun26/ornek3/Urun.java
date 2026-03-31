package gun26.ornek3;

public class Urun {
    private final String barkod;
    private String isim;

    public Urun(String barkod, String isim) {
        this.barkod = barkod;
        this.isim = isim;
    }

    public String getBarkod() {
        return barkod;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
