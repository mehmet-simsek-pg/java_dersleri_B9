package gun11;

public class ArrayExamples {
    public static void main(String[] args) {

        System.out.println("--------Soru 1--------");
        int[] notlar = {95, 56, 45, 100};

        // ögrencinin aldigi notlarin toplami ve ortalamasini bulalim

        int toplam = 0;
        for (int not : notlar) {
            toplam += not;
        }

        System.out.println("Toplam not: " + toplam);
        System.out.println("Not ortalamasi: " + (toplam / notlar.length));

        System.out.println("-------Soru 2-------");
        int[] nums = {3, 5, 56, 23, 44, 99, 54};

        // nums array i icersindeki en büyük sayiyi bulalim
        int max = nums[0];
        /**
         * max degerini baslangicta bilmiyoruz.
         * Baslangic degeri icin array in ilk elemanin aldim.
         * Bu sayede array icerisinde gezip sirayla diger elamanlari bu deger kiyasliyorum.
         * Yeni deger daha büyük ise max degeri olarak onu atiyorum
         * */

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Max deger: " + max);

        System.out.println("--------Soru 3--------");
        int tekSayiMiktari = 0;

        for (int index = 0; index < nums.length; index++) {
            // bir sayinin modu 0 esitse bu sayi cifttir
            // 1 e esitse sayi tektir
            if (nums[index] % 2 == 1) {
                tekSayiMiktari++;
            }
        }
        // array i olustururken kac elemanli oldugunu belirttik
        int[] tekSayilar = new int[tekSayiMiktari];
        int sayac = 0;

        for (int i = 0; i < nums.length; i++) {
            // yeni olusturulan arraya nums arrayi icerisindeki tek sayilari ekledik
            if (nums[i] % 2 == 1) {
                tekSayilar[sayac] = nums[i];
                sayac++;
            }
        }

        // teksayilar array indeki elemanlari ekrana yazdirdik
        for (int tek : tekSayilar) {
            System.out.println(tek);
        }

        System.out.println("Toplam tek sayi miktari: " + tekSayiMiktari);

        System.out.println("--------Soru 4--------");

        String[] cities = {"Ankara", "Adana", "Istanbul", "Berlin", "Izmir"};
        // cities arrayi icerisindeki sehirlerden kac tanesi A harfi ile basliyor

        int miktar = 0;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].startsWith("A")) {
                miktar++;
            }
        }
        System.out.println("A ile baslayan sehir sayisi: " + miktar);
    }
}
