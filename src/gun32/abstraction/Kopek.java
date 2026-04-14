package gun32.abstraction;

public class Kopek extends Hayvan{
    public Kopek(String ad) {
        super(ad);
    }

    @Override
    void sesCikar() {
        System.out.println(ad + " havladi");
    }
}
