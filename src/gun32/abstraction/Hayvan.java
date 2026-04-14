package gun32.abstraction;

public abstract class Hayvan {

    String ad;

    public Hayvan(String ad) {
        this.ad = ad;
    }

    void yemekYe() {
        System.out.println(ad + " yemek yiyor");
    }

    // interface lerde oldugu gibi gövdesiz metod tanimladik
    // her hayvanda sesCikar metodu farkli calisacak
    abstract void sesCikar();
}
