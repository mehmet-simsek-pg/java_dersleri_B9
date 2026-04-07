package gun29.ornek4;

public class Sekreter extends Personal{

    private int masaNo;

    public Sekreter(String ad, String soyad, int yas, String gorevYeri, int masaNo) {
        super(ad, soyad, yas, gorevYeri);
        this.masaNo = masaNo;
    }

    public int getMasaNo() {
        return masaNo;
    }

    public void setMasaNo(int masaNo) {
        this.masaNo = masaNo;
    }

    @Override
    public void bilgiYaz() {
        super.bilgiYaz();
        System.out.println("Masa no: " + masaNo);
    }
}
