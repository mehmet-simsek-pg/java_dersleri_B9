package gun32.abstraction.ornek1;

public class NakitOdeme extends Odeme{

    public NakitOdeme(double tutar) {
        super(tutar);
    }

    @Override
    void odemeYap() {
        System.out.println("Nakit " + tutar + " ödendi");
    }
}
