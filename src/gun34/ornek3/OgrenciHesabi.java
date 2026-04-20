package gun34.ornek3;

public class OgrenciHesabi extends Hesap{

    public OgrenciHesabi(String hesapSahibi, String hesapNo, double bakiye) {
        super(hesapSahibi, hesapNo, bakiye);
    }

    @Override
    public void paraCek(double miktar) {
        if (miktar <= 0) {
            throw new IllegalArgumentException("Cekilecek miktar pozitif olmalidir.");
        }

        if (miktar > bakiye) {
            throw new RuntimeException("Yetersiz bakiye. Güncel bakiye: " + bakiye);
        }

        bakiye -= miktar;
        System.out.println(hesapNo + " ogrenci hesabindan " + miktar + " cekilmistir.");
        System.out.println("Güncel bakiye: " + bakiye);
    }

    @Override
    public String hesapTuru() {
        return "Ogrenci Hesabi";
    }
}
