package gun27.ornek1;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir kavsakta trafik lambasinin kirmizi, sari ve yesil olmak
         * üzere 3 durumu vardir. Lambanin mevcut durumu tutuluyor ve ekrana
         * buna göre sürücüye verilecek mesaj yazdiriliyor.
         **/

        TrafikIsiklari lamba = new TrafikIsiklari(IsikDurumu.YESIL);
        lamba.mesajGoster();

        System.out.println("----------");
        TrafikIsiklari isik = new TrafikIsiklari("SARI");
        isik.mesajGosterString();
    }
}
