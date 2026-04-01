package gun27.ornek8;

import java.util.ArrayList;
import java.util.List;

public class Kargo {
    private String takipNo;
    private String aliciAdi;
    private GonderiDurumu durumu;
    private List<String> takipNotlari;

    public Kargo(String takipNo, String aliciAdi) {
        this.takipNo = takipNo;
        if (aliciAdi.trim().isEmpty()) {
            this.aliciAdi = "Bilinmiyor";
        } else {
            this.aliciAdi = aliciAdi;
        }
        this.durumu = GonderiDurumu.HAZIRLANIYOR;
        this.takipNotlari = new ArrayList<>();
    }

    public GonderiDurumu getDurumu() {
        return durumu;
    }

    public void setDurumu(GonderiDurumu durumu) {
        this.durumu = durumu;
    }

    public void notEkle(String not) {
        takipNotlari.add(not.trim());
    }

    public void gecikmeliNotlar() {
        System.out.println("Gecikmeli notlar");
        for (String not : takipNotlari) {
            if (not.toLowerCase().contains("gecikme")) {
                System.out.println("- " + not);
            }
        }
    }

    public void bilgiYazdir(){
        System.out.println("Takip no: " + takipNo);
        System.out.println("Alici adi: " + aliciAdi);
        System.out.println("Durumu: " + durumu);
        System.out.println("Notlar: " + takipNotlari);
    }
}
