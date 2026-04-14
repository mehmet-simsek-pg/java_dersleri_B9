package gun32.abstraction.ornek2;

public abstract class Kargo {

    String takipNo;

    public Kargo(String takipNo) {
        this.takipNo = takipNo;
    }

    void takipBilgisi() {
        System.out.println("Takip numarasi: " + takipNo);
    }

    abstract void teslimSuresiGoster();
}
