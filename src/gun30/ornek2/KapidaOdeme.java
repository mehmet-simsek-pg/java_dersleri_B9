package gun30.ornek2;

public class KapidaOdeme implements OdemeYontemi{
    @Override
    public void odemeYap(double tutar) {
        System.out.println("Kapida ödeme ile " + tutar + " TL ödendi");
    }
}
