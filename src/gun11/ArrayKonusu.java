package gun11;

public class ArrayKonusu {
    public static void main(String[] args) {
        /**
         * Ayni türden birden fazla elemana ayni degisken ismini vermemi saglar
         * int a = 5;
         * int b = 6;
         * int[] sayilar = {5, 6};
         * Array icerisindeki elemanlara index ile ulasiriz.
         * Index 0(sifir) dan baslar
         * Array uzunlugu olusturulduktan sonra degistirelemez.
         *
         * String[], double[], float[] vs..
         * */

        int [] yaslar = new int[5]; // 5 elemanlik bir int dizisi
        // bu dizi icerisinde 5 tane int yas bilgisini tutabilir.

        /**
         * Arrayin limitini verip olusturup,
         * deger atamasi yapmadigim durumlarda
         * default degerleri kendisi otomatik atar
         *
         * int -> 0
         * double -> 0.0
         * boolean -> false
         * String -> null
         *
         * yaslar arayinde daha atama yapilmadigi icin degerler su sekilde olur
         * 0, 0, 0 ,0, 0 -> 5 elemanli ve int dizisi oldugu icin 5 tane 0 atar.
         * */

        String[] cities = {"Berlin", "Jena", "Ankara", "Izmir"};
        int[] nums = {3, 45, 99, 1, 8, 78};

        System.out.println(cities.length); // 4
        System.out.println(nums.length); // 6

        System.out.println("Degisiklik yapmadan önce: " + nums[0]); // 3
        nums[0] = 34; // Yeni deger atamasi
        System.out.println("Degisiklikten sonra: " + nums[0]); // 34

        System.out.println(cities[2]); // Ankara , index 0(sifirdan) saymaya baslar
        //System.out.println(nums[6]); // Hata verir, cünkü 6. index yok
        // Array lerde sinir degeri bastan belli olur. Bu siniri asarsam hata verir
        // o hata da -> ArrayIndexOutOfBoundsException

        // index lazim oldugunda fori ile array icerisinde gezeriz
        for (int index = 0; index < nums.length; index++) {
            System.out.println(index + ". indexteki eleman " + nums[index]);
        }
        System.out.println("------------");
        // sadece eleman lazimken foreach kullaniriz
        for (int num: nums) {
            System.out.println(num);
        }
        System.out.println("--------");
        for (String city: cities) {
            System.out.print(city + " ");
        }
    }
}
