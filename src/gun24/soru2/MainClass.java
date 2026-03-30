package gun24.soru2;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir Hesaplama sinifi olusturun.
         * kupAl() adinda static bir metod yazin.
         * Bu metot su isi yapsin: Girilen sayinin küpünü bulsun.
         * Nesne olusturmadan bu metodu cagirip kullanin.
         * */

        int sonuc = Hesaplama.kupAl(3);
        System.out.println("Sonuc: " + sonuc);

        System.out.println("(JAVA)4 ve 5 ten büyük olan: " + Math.max(4, 5));
        System.out.println("(BIZIMKI)4 ve 5 ten büyük olan: " + Hesaplama.max(4 ,5));

        System.out.println("(JAVA)4 ve 5 ten kücük olan: " + Math.min(4, 5));
        System.out.println("(BIZIMKI)4 ve 5 ten kücük olan: " + Hesaplama.min(4 ,5));
    }
}
