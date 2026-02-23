package gun3;

public class Examples {
    public static void main(String[] args) {

        System.out.println("------Soru 1------");
        String s = "Automation";
        System.out.println(s.substring(4, s.length() - 1));
        // s.length() -> 10 bu degeri hesaplamak zorunda degiliz
        // s.length() - 1 -> bu ifade zaten son harfi alma diyor

        System.out.println("------Soru 2--------");
        String a = "java@spring@boot";
        int i = a.indexOf("@"); // indexOf oldugu icin ilk gördügü @ isaretinin indexini aldi
        System.out.println(a.substring(0, i)); // (0,4)

        System.out.println("--------Soru 3---------");
        String y = "report.final.v2.pdf";
        System.out.println(y.substring(y.lastIndexOf('.') + 1));

        System.out.println("--------Soru 4--------");
        String x = "2026-02-13";
        System.out.println(x.replace("-", "/"));

        System.out.println("-------Soru 5-------");
        String c = "Order# TR-98A-1200!";
        System.out.println(c.replaceAll("\\D", ""));

        System.out.println("------Soru 6--------");
        String v = "https://medlehrer.com";
        System.out.println(v.startsWith("http") && v.contains("medlehrer"));
        // true && true = true
        // false && true ve ya true && false = false
        // false && false = false

        System.out.println("--------Soru 7-------");
        String n = "ADMIN";
        String b = "admin";
        System.out.println(b.equalsIgnoreCase(n));

        System.out.println("--------Soru 8---------");
        String m = "TR123456";
        System.out.println(m.length());
        System.out.println(m.substring(m.length() - 2));
        System.out.println(m.substring(6));
        // 6. index te 5 var. substring metodunda end degeri olmadigi icin
        // 5 ten baslayip string in sonuna kadar yazar

        System.out.println("------Soru 9-------");
        String r = "selenium";
        System.out.println(r.indexOf("b"));

        System.out.println("------Soru 10---------");
        int z = 7;
        int u = 5;
        String j = String.valueOf(z).concat(String.valueOf(u));
        System.out.println(j);
        /**
         * String.valueOf(z) -> "7"
         * String.valueOf(u) -> "5"
         * */

        System.out.println("--------Soru 11---------");
        String name = "Mehmet Simsek Berlin";
        int index = name.indexOf(" ");
        System.out.println(name.substring(0, index));

        System.out.println("-------Soru 12---------");
        String p = "QA SDET Java";
        System.out.println(p.substring(p.lastIndexOf(" ") + 1));

        System.out.println("--------Soru 13---------");
        String email = "user.test@gmail.de";
        System.out.println(email.substring(email.indexOf("@") + 1));
    }
}
