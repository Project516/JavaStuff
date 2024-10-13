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

    static class drumkit {
        boolean topHat = true;
        boolean snare = true;

        void playTopHat() {
            System.out.println("ding ding da-ding");
        }
        void playSnare() {
            System.out.println("bang bang ba-bang");
        }
    }
}
