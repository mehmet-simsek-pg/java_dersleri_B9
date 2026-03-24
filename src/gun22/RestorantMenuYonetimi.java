package gun22;

import java.util.*;

public class RestorantMenuYonetimi {
    public static List<String> menuListesiOlustur(String menu) {
        List<String> menudekiYemekler = new ArrayList<>();
        String[] menudekiler = menu.split(",");

        for (String yemek : menudekiler) {
            yemek = yemek.trim().toLowerCase();

            if (!yemek.isEmpty()) {
                menudekiYemekler.add(yemek);
            }
        }

        return menudekiYemekler;
    }

    public static Set<String> benzersizYemekler(List<String> yemekler) {
        return new LinkedHashSet<>(yemekler);
    }

    public static void secimSonucu(String secim, Set<String> benzersizYemekler) {
        switch (secim) {
            case "E":
                for (String yemek : benzersizYemekler) {
                    if (yemek.contains("e")) {
                        System.out.println(yemek);
                    }
                }
                break;
            case "B":
                for (String yemek : benzersizYemekler) {
                    if (yemek.startsWith("b")) {
                        System.out.println(yemek);
                    }
                }
                break;
            case "U":
                for (String yemek : benzersizYemekler) {
                    System.out.println(yemek.toUpperCase());
                }
                break;
            case "K":
                for (String yemek : benzersizYemekler) {
                    if (yemek.length() > 6) {
                        System.out.println(yemek);
                    }
                }
                break;
            default:
                System.out.println("Gecersiz secim yaptiniz");
                break;
        }
    }

    public static void menuKontrol(String aranacak, Set<String> benzersizYemekler) {
        if (benzersizYemekler.contains(aranacak)) {
            System.out.println("Aranan yemek menude var");
        } else {
            System.out.println("Aranan yemek menude yok");
        }
    }

    public static void main(String[] args) {
        /**
         * Bir restoran uygulamasında
         * menüdeki yemekler kullanıcı tarafından şu şekilde giriliyor.
         * Örnek giriş:
         * Pizza, Lahmacun, Burger, pizza, Makarna, burger, Salata
         * Program şu işlemleri yapmalıdır:
         * Menü elemanlarını ayırıp bir listede saklasın.
         * Yinelenen yemekleri kaldırıp farklı yemekleri
         * ayrı bir yapıda tutsun.
         * Kullanıcıdan bir seçim alınsın:
         * E → Menüde “e” harfi geçen yemekleri göster
         * B → Baş harfi “B” olan yemekleri göster
         * U → Tüm yemekleri büyük harfe çevirip göster
         * K → Karakter sayısı 6’dan fazla olan yemekleri göster
         * Her işlem ayrı bir metod ile yapılsın.
         * Ayrıca bir metod, listedeki bir yemeğin
         * menüde bulunup bulunmadığını kontrol etsin.
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu girisi yapin");
        String menu = scanner.nextLine().trim();

        List<String> menudekiYemekler = menuListesiOlustur(menu);

        System.out.println("Menudeki yemekler: " + menudekiYemekler);
        Set<String> benzersizYemekler = benzersizYemekler(menudekiYemekler);

        System.out.println("Benzersiz yemekler: " + benzersizYemekler);

        System.out.print("Secim yapin: ");
        String secim = scanner.nextLine().trim().toUpperCase();

        secimSonucu(secim, benzersizYemekler);

        System.out.print("Aramak istediginiz yemegi girin: ");
        String aranacak = scanner.nextLine().trim();

        menuKontrol(aranacak, benzersizYemekler);

        scanner.close();
    }
}
