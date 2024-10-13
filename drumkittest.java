public class drumkittest {
    public static void main(String[] args) {
        drumkit d = new drumkit ();
        d.playSnare();
        d.snare = false;
        d.playTopHat();

        if (d.snare == true) {
            d.playSnare();
        }
    }
}
