package gun27.ornek3;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir evde kullanilan akilli termostatin sicaklik
         * degeri tutuluyor. Sicaklik disaridan dogrudan
         * degistirilmemeli. Sicaklik sadece belirli sinirlar
         * icinde artirilip azaltilabilmeli.
         * */

        Termostat termostat = new Termostat(27);

        termostat.sicaklikArtir();
        System.out.println(termostat.getSicaklik());

        termostat.sicaklikAzalt();
        System.out.println(termostat.getSicaklik());
    }
}
