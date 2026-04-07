package gun28.ornek1;

public class Manager extends Calisan {

    public Manager(String fullName, double maas, int yas, String address) {
        // super -> üst(parent) class demek
        // parent class in consructorinda parametre varsa
        // child class da ayni parametreler olmak zorunda.
        super(fullName, maas, yas, address, Role.MANAGER);
    }
}
