package gun26.ornek3;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir urun sinifi olusturun. Urun sinifinda barkod
         * ve isim alanlari olacak. Barkod olusturulduktan sonra
         * degistirilemesin isim ise degisebilir.
         * */

        Urun urun = new Urun("TR12345", "Laptop");

        // Barkod degiskeni final olarak tanimlandigi icin
        // ilk deger atamasindan sonra degeri degisitirilemez
        System.out.println("Barkod: " + urun.getBarkod());
        urun.setIsim("Bilgisayar");
        System.out.println("Adi: "+ urun.getIsim());;
    }
}
