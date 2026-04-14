package gun32.abstraction;

public class Ucak extends Arac{


    public Ucak(String marka) {
        super(marka);
    }

    @Override
    void hareketEt() {
        System.out.println(marka + " ucuyor");
    }
}
