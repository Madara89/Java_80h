package lv.madara.StringFormat;

public class StringFormatTest {
    public static void main(String[] args) {

        System.out.println("Print to terminal "+"String"); //ar println stringus savieno ar +

        System.out.printf("Hello %s","Madara"); //ar printf formatē stringus

        System.out.println();

        System.out.printf("Mad%s","ara"); // Java %s vietā ievieto nākamo stringu

        System.out.println();

        int codeOf = 2030; // nosakot mainīgo, var veidot sekojošu kodu:
        System.out.printf("LV %d", codeOf); // Java %d vietā ievieto mainīgo int

        System.out.println();

        double oilPrice = -25.86574;
        System.out.printf("%.3f", oilPrice); //%.3f norāda, lai printē oilPrice ar 3 cipariem aiz komata


    }
}
