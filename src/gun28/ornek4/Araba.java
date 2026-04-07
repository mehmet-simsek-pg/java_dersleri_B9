package gun28.ornek4;

public class Araba extends Arac{

    int kapiSayisi;

    public Araba(String plaka, String marka, double gunlukUcret, int kapiSayisi) {
        super(plaka, marka, gunlukUcret);
        this.kapiSayisi = kapiSayisi;
    }

    @Override
    public void bilgiYaz(){
        super.bilgiYaz();
        System.out.println("Kapi sayisi: " + kapiSayisi);
    }
}
