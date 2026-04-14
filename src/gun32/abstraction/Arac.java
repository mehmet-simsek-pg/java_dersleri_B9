package gun32.abstraction;

public abstract class Arac {

    String marka;

    public Arac(String marka) {
        this.marka = marka;
    }

    void bilgi() {
        System.out.println("Marka: " + marka);
    }

    abstract void hareketEt();
}
