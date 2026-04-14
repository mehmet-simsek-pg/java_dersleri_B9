package gun32.abstraction;

public class Araba extends Arac{

    public Araba(String marka) {
        super(marka);
    }

    @Override
    void hareketEt() {
        System.out.println(marka + " otobanda gidiyor");
    }
}
