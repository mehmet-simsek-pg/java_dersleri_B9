package gun32.abstraction.ornek1;

public abstract class Odeme {

    double tutar;

    public Odeme(double tutar) {
        this.tutar = tutar;
    }

    void bilgi() {
        System.out.println("Ödenecek tutar: " + tutar + " TL");
    }

    abstract void odemeYap();
}
