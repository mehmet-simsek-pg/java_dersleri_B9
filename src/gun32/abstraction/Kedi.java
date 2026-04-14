package gun32.abstraction;

public class Kedi extends Hayvan{
    public Kedi(String ad) {
        super(ad);
    }

    @Override
    void sesCikar() {
        System.out.println( ad + " miyavladi");
    }
}
