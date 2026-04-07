package gun28.ornek2;

public class Hayvan extends Canli{
    String ad;

    public Hayvan(boolean yasiyorMu, String ad) {
        super(yasiyorMu);
        this.ad = ad;
    }

    public void sesCikar() {
        System.out.println("Hayvan ses cikariyor.");
        System.out.println();
    }
}
