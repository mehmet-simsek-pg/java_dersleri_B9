package gun25.ornek1;

public class Kitap {
    public String ad;
    /*
   public Kitap() {
        // bu java nin default olarak tanimladigi constructor
    }
    */

    // eger ki paramaetreli bir constructor yaziyorsak
    // bu class tan nesne üretirken Kitap kitap = new Kitap();
    // seklinde artik kullanamayiz(bos constructor). Eger ki
    // bos constructor da lazim ise ayriyeten tanimlamak gerekir.
    public Kitap(String ad) {
        // parametre ismi ile class field lerinin isimleri ayni oldugunda
        // karisiklik cikabiliyor. Bunun icin class field leri önüne
        // this yazip kullaniyoruz.
        this.ad = ad;
    }

    public Kitap() {

    }
}
