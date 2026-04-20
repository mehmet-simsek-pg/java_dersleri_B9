package gun34.ornek3;

public class BirikimHesabi extends Hesap{

    public BirikimHesabi(String hesapSahibi, String hesapNo, double bakiye) {
        super(hesapSahibi, hesapNo, bakiye);
    }

    @Override
    public void paraCek(double miktar) {
        if (miktar <= 0) {
            throw new IllegalArgumentException("Cekilecek miktar pozitif olmalidir.");
        }

        // bakiye = 10000, miktar = 8999 max
        if (bakiye - miktar < 1000) {
            throw new RuntimeException("Birikim hesabinda bakiye 1000 TL altina düsemez.");
        }

        bakiye -= miktar;
        System.out.println(hesapNo + " bakiye hesabindan " + miktar + " cekilmistir.");
        System.out.println("Güncel bakiye: " + bakiye);
    }

    @Override
    public String hesapTuru() {
        return "Birikim Hesabi";
    }
}
