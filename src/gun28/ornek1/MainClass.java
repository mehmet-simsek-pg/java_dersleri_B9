package gun28.ornek1;

public class MainClass {
    public static void main(String[] args) {

        Manager manager = new Manager("Mehmet", 50000,
                32, "test adres");

        Developer developer = new Developer("Gökay", 48000,
                30, "test");

        Tester tester = new Tester("Kader", 45000,
                26, "testtt");

        manager.bilgiYazdir();
        developer.bilgiYazdir();
        tester.bilgiYazdir();
    }
}
