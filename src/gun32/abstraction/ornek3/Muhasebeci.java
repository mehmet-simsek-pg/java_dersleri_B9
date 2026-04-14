package gun32.abstraction.ornek3;

public class Muhasebeci extends Calisan{

    public Muhasebeci(String ad) {
        super(ad);
    }

    @Override
    void gorev() {
        System.out.println(ad + " finansal kayitlari kontrol eder.");
    }
}
