package gun32.abstraction.ornek2;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir kargo firmasında farklı kargo türleri vardır.

         * Standart kargo
         * Hızlı kargo

         * Tüm kargolarda gönderi numarası ortaktır.
         * Ayrıca her kargo türü kendi teslim süresini ekrana yazdırmalıdır.

         * Bu sistemi abstraction kullanarak oluşturunuz.
         * */

        StandartKargo standartKargo = new StandartKargo("TR1234");
        HizliKargo hizliKargo = new HizliKargo("TR5786");

        standartKargo.takipBilgisi();
        standartKargo.teslimSuresiGoster();

        System.out.println();

        hizliKargo.takipBilgisi();
        hizliKargo.teslimSuresiGoster();

    }
}
