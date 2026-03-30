package gun25;

import gun25.ornek1.Calisan;

public class MainClass {
    public static void main(String[] args) {
        // bos constructor ile nesne tanimlama
        Calisan calisan1 = new Calisan();
        calisan1.isim = "Hüseyin";
        calisan1.maas = 50000.0;
        calisan1.department = "Yazilim";
        calisan1.isActive = true;

        // parametreli constructor kullanimlari

        Calisan calisan2 = new Calisan("Kader", "Yazilim");
        Calisan calisan3 = new Calisan("Izzet", 55000);
        Calisan calisan4 = new Calisan("Alperen", true);
        Calisan calisan5 =
                new Calisan("Gülsah","Yazilim",
                        53000,true);

        System.out.println("calisan 1: " + calisan1);
        System.out.println("calisan 2: " + calisan2);
        System.out.println("calisan 3: " + calisan3);
        System.out.println("calisan 4: " + calisan4);
        System.out.println("calisan 5: " + calisan5);

    }
}
