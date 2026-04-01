package gun27.ornek6;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir akilli lambanin calisma modu tutuluyor. Modlar
         * okuma, gece ve normal olsun. Lamba olusturulurken
         * baslangic modu verilsin. Daha sonra mod
         * degisitirildiginde ekrana yeni mod yazdirilsin.
         * */

        AkilliLamba lamba = new AkilliLamba(LambaModu.NORMAL);

        lamba.modDegistir(LambaModu.GECE);

        lamba.modDegistir(LambaModu.OKUMA);
    }
}
