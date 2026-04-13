package gun30.ornek2;

public class KrediKarti implements OdemeYontemi{
    @Override
    public void odemeYap(double tutar) {
        System.out.println("Kredi karti ile " + tutar + " TL ödendi");
    }
}
