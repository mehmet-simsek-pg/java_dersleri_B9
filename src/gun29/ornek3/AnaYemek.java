package gun29.ornek3;

public class AnaYemek extends Urun {

    private int acilikSeviyesi;

    public AnaYemek(String ad, double fiyat, String kategori, int acilikSeviyesi) {
        super(ad, fiyat, kategori);
        this.acilikSeviyesi = acilikSeviyesi;
    }

    public int getAcilikSeviyesi() {
        return acilikSeviyesi;
    }

    public void setAcilikSeviyesi(int acilikSeviyesi) {
        this.acilikSeviyesi = acilikSeviyesi;
    }

    @Override
    public void bilgiYaz() {
        super.bilgiYaz();
        System.out.println("Acilik seviyesi: " + acilikSeviyesi);
    }
}
