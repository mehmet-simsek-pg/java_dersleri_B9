package gun24.soru3;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir SabitBilgi isminde class olusturun.
         * ulkeKodu adinda bir degisken tanimlayin ve buna bir deger atayin.
         * Atanan bu deger sonradan degistirilemesin.
         * */

        System.out.println(SabitBilgi.ulkeKodu);

        SabitBilgi sB = new SabitBilgi();
        // sB.ulkeKodu -> ulkeKodu static oldugu icin
        // Class a ait bir degiskendir. Nesne bunu kullanamaz
    }
}
