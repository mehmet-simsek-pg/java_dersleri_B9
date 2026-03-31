package gun26.ornek1;

public class MainClass {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();

        // encapsulation sayesinde
        // yas icin -11 gibi mantiksiz bir veri girisinin önüne gectik.
        ogrenci.setYas(-11);
        ogrenci.setIsim("Ahmet");

        System.out.println("Yas: " + ogrenci.getYas());
        System.out.println("Isim: " + ogrenci.getIsim());
    }
}
