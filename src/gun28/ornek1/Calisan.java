package gun28.ornek1;

public class Calisan {
     String fullName;
     double maas;
     int yas;
     String address;
     Role role;

    public Calisan(String fullName, double maas, int yas, String address, Role role) {
        this.fullName = fullName;
        this.maas = maas;
        this.yas = yas;
        this.address = address;
        this.role = role;
    }

    public void bilgiYazdir() {
        System.out.println("isim: " + fullName);
        System.out.println("maas: " + maas);
        System.out.println("yas: " + yas);
        System.out.println("Adres: " + address);
        System.out.println("role: " + role);
        System.out.println();
    }
}
