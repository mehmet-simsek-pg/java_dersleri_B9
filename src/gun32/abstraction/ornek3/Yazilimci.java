package gun32.abstraction.ornek3;

public class Yazilimci extends Calisan{

    public Yazilimci(String ad) {
        super(ad);
    }

    @Override
    void gorev() {
        System.out.println(ad + " kod yazar.");
    }
}
