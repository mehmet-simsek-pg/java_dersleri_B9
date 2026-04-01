package gun27.ornek8;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir kargo firmasi, gönderileri takip etmek icin bir
         * sistem kurmak istiyor. Her kargonun takip numarasi
         * alici adi, gönderi durumu ve teslimat notlari vardir.
         * Gönderi durumu sadece belirli seceneklerden olusmaktadir.
         * Alici adi bos girilemez. Teslimat notlari bir listede
         * tutulacak. Sistemde, teslimat notlarinin icinde "gecikme"
         * kelimesi gecen notlari ayrica ekrana yazdirin. Takip numarasi
         * ve alici adi ile nesne olustururken ilk bilgiler verilmelidir.
         * */

        Kargo kargo = new Kargo("TR12345", "Alperen");

        kargo.notEkle("Kargo subeden cikti");
        kargo.notEkle("Teslimatta gecikme olabilir");
        kargo.notEkle("Adreste dogrulamasi yapildi");

        kargo.setDurumu(GonderiDurumu.YOLDA);

        kargo.bilgiYazdir();
        System.out.println();

        kargo.gecikmeliNotlar();
    }
}
