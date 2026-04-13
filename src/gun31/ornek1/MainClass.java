package gun31.ornek1;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir akıllı ev sisteminde farklı cihazlar bulunmaktadır.
         * Tüm cihazların marka ve model bilgisi vardır.
         * Ayrıca bazı cihazlar açılıp kapatılabilir,
         * bazıları ise internete bağlanabilir.

         * Sistemde şu cihazlar vardır:

         * Akıllı Lamba
         * Akıllı Klima
         * Güvenlik Kamerası

         * İstenilenler:

         * Ortak özellikleri uygun şekilde tasarlayın.
         * Açılma-kapanma davranışı olan cihazlar için gerekli yapıyı kurun.
         * İnternete bağlanabilen cihazlar için ayrı bir davranış tanımlayın.
         * Her sınıfta kendine özgü bir bilgi de olsun.
         * Örneğin:
         * Lamba için ışık rengi
         * Klima için sıcaklık derecesi
         * Kamera için kayıt çözünürlüğü
         * Ana sınıfta tüm nesneleri oluşturup bilgilerini ekrana yazdırın.
         * */

        AkilliLamba lamba = new AkilliLamba("Philips", "XR123", IsikRengi.BEYAZ);
        AkilliKlima klima = new AkilliKlima("Bosch", "MT56", 25);
        GuvenlikKamerasi kamera = new GuvenlikKamerasi("Android", "TK453", "1080");

        System.out.println("------Akilli Lamba---------");
        lamba.bilgi();
        lamba.ac();
        lamba.kapat();

        System.out.println();
        System.out.println("------Akilli Klima---------");
        klima.bilgi();
        klima.interneteBaglan();
        klima.ac();
        klima.kapat();

        System.out.println();
        System.out.println("-------Güvenlik Kamerasi------");
        kamera.bilgi();
        kamera.interneteBaglan();
        kamera.ac();
        kamera.kapat();

    }
}
