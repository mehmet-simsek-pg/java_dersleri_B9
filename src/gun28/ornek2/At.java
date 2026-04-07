package gun28.ornek2;

public class At extends Hayvan{
    public At(boolean yasiyorMu, String ad) {
        super(yasiyorMu, ad);
    }

    @Override
    public void sesCikar(){
        System.out.println("At kisner");
        System.out.println();
    }
}
