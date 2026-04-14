package gun32.abstraction.ornek2;

public class HizliKargo extends Kargo{

    public HizliKargo(String takipNo) {
        super(takipNo);
    }

    @Override
    void teslimSuresiGoster() {
        System.out.println("Hizli kargo 1 is gününde gelir");
    }
}
