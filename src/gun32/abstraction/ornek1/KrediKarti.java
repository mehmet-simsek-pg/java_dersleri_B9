package gun32.abstraction.ornek1;

public class KrediKarti extends Odeme{

    public KrediKarti(double tutar) {
        super(tutar);
    }

    @Override
    void odemeYap() {
        System.out.println("Kredi karti ile " + tutar + " ödendi");
    }
}
