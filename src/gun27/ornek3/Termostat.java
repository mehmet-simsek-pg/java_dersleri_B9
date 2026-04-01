package gun27.ornek3;

public class Termostat {
    private double sicaklik;

    public Termostat(double sicaklik) {
        if (sicaklik >= 30 || sicaklik < 0) {
            this.sicaklik = 30;
        } else {
            this.sicaklik = sicaklik;
        }
    }

    public void sicaklikArtir(){
        if (sicaklik < 30) {
            sicaklik++;
        }
    }

    public void sicaklikAzalt(){
        if (sicaklik >= 30) {
            sicaklik -= 4;
        }
    }

    public double getSicaklik() {
        return sicaklik;
    }
}
