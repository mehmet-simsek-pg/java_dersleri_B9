package gun34.ornek3;

public class BirikimHesabi extends Hesap{

    public BirikimHesabi(String hesapSahibi, String hesapNo, double bakiye) {
        super(hesapSahibi, hesapNo, bakiye);
    }

    @Override
    public void paraCek(double miktar) {

    }

    @Override
    public String hesapTuru() {
        return "Birikim";
    }
}
