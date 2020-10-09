package FlugVerhalten;

public class KeinFliegen implements FlugVerhalten {
    @Override
    public void fliegen() {
        System.out.println("Ich kann nicht fliegen, bin am Boden, mein Traum geplatzt, Ich. Bin. Verloren. ");
    }
}
