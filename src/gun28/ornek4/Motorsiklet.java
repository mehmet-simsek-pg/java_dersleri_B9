package gun28.ornek4;

public class Motorsiklet extends Arac{

    boolean kaskDahilMi;

    public Motorsiklet(String plaka, String marka, double gunlukUcret, boolean kaskDahilMi) {
        super(plaka, marka, gunlukUcret);
        this.kaskDahilMi = kaskDahilMi;
    }

    @Override
    public void bilgiYaz(){
        super.bilgiYaz();
        System.out.println("Kask dahil mi: " + kaskDahilMi);
    }
}
