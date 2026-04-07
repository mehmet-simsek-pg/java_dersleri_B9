package gun29.ornek1;

public class Kamyonet extends Arac{

    int tasimaKapasitesi;

    public Kamyonet(String plaka, String marka, double gunlukUcret, boolean kiradaMi, int tasimaKapasitesi) {
        super(plaka, marka, gunlukUcret, kiradaMi);
        this.tasimaKapasitesi = tasimaKapasitesi;
    }

    @Override
    public void bilgiYaz() {
        super.bilgiYaz();
        System.out.println("Tasima kapasitesi: " + tasimaKapasitesi);
    }
}
