package gun29.ornek1;

public class Motorsiklet extends Arac{

    boolean kaskVarMi;

    public Motorsiklet(String plaka, String marka, double gunlukUcret, boolean kiradaMi, boolean kaskVarMi) {
        super(plaka, marka, gunlukUcret, kiradaMi);
        this.kaskVarMi = kaskVarMi;
    }

    @Override
    public void bilgiYaz() {
        super.bilgiYaz();
        System.out.println("Kask var mi? " + kaskVarMi);
    }
}
