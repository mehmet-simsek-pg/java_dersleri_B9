package gun32.abstraction.ornek3;

public abstract class Calisan {

    String ad;

    public Calisan(String ad) {
        this.ad = ad;
    }

    void bilgi() {
        System.out.println(ad + " ise alindi");
    }

    abstract void gorev();
}
