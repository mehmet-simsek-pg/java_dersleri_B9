package gun28.ornek2;

public class Kedi extends Hayvan{

    public Kedi(boolean yasiyorMu,String ad) {
        super(yasiyorMu,ad);
        /**
         * super -> parent class anlaminda kullanilir
         * super = public Hayvan(String ad) {
         *         this.ad = ad;
         *     }
         * */
    }

    @Override
    public void sesCikar(){
        System.out.println("Kedi miyavlar");
        System.out.println();
    }
}
