package gun34.ornek3;

public class OgrenciHesabi extends Hesap{

    public OgrenciHesabi(String hesapSahibi, String hesapNo, double bakiye) {
        super(hesapSahibi, hesapNo, bakiye);
    }

    @Override
    public void paraCek(double miktar) {

    }

    @Override
    public String hesapTuru() {
        return "Ogrenci";
    }
}
