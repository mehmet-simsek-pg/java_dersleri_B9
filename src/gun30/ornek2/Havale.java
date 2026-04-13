package gun30.ornek2;

public class Havale implements OdemeYontemi{
    @Override
    public void odemeYap(double tutar) {
        System.out.println("Havale ile " + tutar + " TL ödendi");
    }
}
