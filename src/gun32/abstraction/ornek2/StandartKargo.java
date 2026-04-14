package gun32.abstraction.ornek2;

public class StandartKargo extends Kargo{

    public StandartKargo(String takipNo) {
        super(takipNo);
    }

    @Override
    void teslimSuresiGoster() {
        System.out.println("Standart kargo 3-5 is gününe gelir");
    }
}
