package gun27.ornek5;

public class Uye {
    private String adi;
    private int kitapSayisi;

    public Uye(String adi) {
        this.adi = adi;
        this.kitapSayisi = 0;
    }

    public void kitapAl(){
        if (kitapSayisi < 3) {
            kitapSayisi++;
            System.out.println("Kitap alindi");
        } else {
            System.out.println("3 ten fazla kitap alinamaz");
        }
    }

    public void kitapIadeEt(){
        if (kitapSayisi > 0) {
            kitapSayisi--;
            System.out.println("Kitap iade edildi");
        }
    }

    public void bilgileriGoster(){
        System.out.println("Üye adi: " + adi);
        System.out.println("Ödünc kitap sayisi: " + kitapSayisi);
    }
}
