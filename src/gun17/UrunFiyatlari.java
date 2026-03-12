package gun17;

import java.util.HashMap;

public class UrunFiyatlari {
    public static void main(String[] args) {

        HashMap<String, Integer> sepet = new HashMap<>();

        sepet.put("Elma", 10);
        sepet.put("Karpuz", 20);
        sepet.put("Cilek", 40);
        sepet.put("Kiraz", 33);

        System.out.println("Karpuz un fiyat: " + sepet.get("Karpuz"));
        System.out.println("Toplam ürün sayisi: " + sepet.size());

        if (sepet.containsKey("Kiraz")) {
            System.out.println("Kiraz listede var");
        } else {
            System.out.println("Kiraz listede yok");
        }

        System.out.println("Sepetteki ürünler: " + sepet);
        sepet.remove("Elma");

        System.out.println("Sepetteki kalan ürünler: " + sepet);

        sepet.clear();
        System.out.println("Sepetin son hali: " + sepet);

    }
}
