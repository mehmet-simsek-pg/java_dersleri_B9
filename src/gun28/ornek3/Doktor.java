package gun28.ornek3;

public class Doktor extends Calisan{
    String uzmanlikAlani;

    public Doktor(String ad, String soyad, double maas, String uzmanlikAlani) {
        super(ad, soyad, maas);
        this.uzmanlikAlani = uzmanlikAlani;
    }

    @Override
    public void bilgiYazdir(){
        super.bilgiYazdir();
        System.out.println("Uzmanlik alani: " + uzmanlikAlani);
    }

    @Override
    public String bilgi(){
       return super.bilgi() + " uzmanlik alani: " + uzmanlikAlani;
    }
}
