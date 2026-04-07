package gun29.ornek1;

public class Otomobil extends Arac{

    int bagajHacmi;

    public Otomobil(String plaka, String marka, double gunlukUcret, boolean kiradaMi, int bagajHacmi) {
        super(plaka, marka, gunlukUcret, kiradaMi);
        this.bagajHacmi = bagajHacmi;
    }

    @Override
    public void bilgiYaz() {
        super.bilgiYaz();
        System.out.println("Bagaj hacmi: " + bagajHacmi);
    }
}
