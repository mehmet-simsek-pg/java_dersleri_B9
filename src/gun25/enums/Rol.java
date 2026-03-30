package gun25.enums;

public enum Rol {
    OGRENCI, OGRETMEN, MUDUR;

    // enum icerisinde method tanimlayabiliriz
    // buradaki this kavrami -> enum in field leridir.
    public void yetkiYazdir() {
        switch (this) {
            case MUDUR -> System.out.println("Tüm sistemi kontrol edr");
            case OGRETMEN -> System.out.println("Ders ekler ve not verir");
            case OGRENCI -> System.out.println("Sadece ders iceriklerini görebilir");
        }
    }
}
