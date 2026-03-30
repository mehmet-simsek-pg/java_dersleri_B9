package gun25.ornek1;

public class Calisan {
    public String isim;
    public String department;
    public double maas;
    public boolean isActive;

    public Calisan() {

    }

    public Calisan(String isim, String department) {
        this.isim = isim;
        this.department = department;
    }

    public Calisan(String isim, double maas) {
        this.isim = isim;
        this.maas = maas;
    }

    public Calisan(String department, boolean isActive) {
        this.department = department;
        this.isActive = isActive;
    }

    public Calisan(String isim, String department, double maas, boolean isActive) {
        this.isim = isim;
        this.department = department;
        this.maas = maas;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", department='" + department + '\'' +
                ", maas=" + maas +
                ", isActive=" + isActive +
                '}';
    }

}
