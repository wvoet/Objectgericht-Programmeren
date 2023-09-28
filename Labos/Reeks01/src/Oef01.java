// de vermelding 'package...' plak je NIET in dit antwoordvenster
// je kan imports toevoegen
public class Oef01 {
    public static void main(String[] args) {
        // Het getal 5 opslaan in een lokale variabele x van type double
        double x = 5.0;
        int y = 5;

        // Het dubbel van x berekenen
        double dubbel_x = 2 * x;

        // De helft van x berekenen
        double helft_x = x / 2;

        // Het kwadraat van x berekenen
        double kwadraat_x = x * x;

        // De vierkantswortel van x berekenen met behulp van de Math klasse
        double vierkantswortel_x = Math.sqrt(x);

        // Het dubbel van Y berekenen
        int dubbel_y = 2 * y;

        // De helft van y berekenen
        int helft_y = y/2;

        // Het kwadraat van y berekenen
        int kwadraat_y = y * y;

        // De vierkantswortel van x berekenen met behulp van de Math klasse
        double vierkantswortel_y = Math.sqrt(y);

        // Resultaten naar de uitvoer schrijven
        System.out.println("Het dubbel van " + x + " is " + dubbel_x );
        System.out.println("De helft van " + x + " is " + helft_x);
        System.out.println("Het kwadraat van " + x + " is " + kwadraat_x);
        System.out.println("De vierkantswortel van " + x + " is " + vierkantswortel_x);
        System.out.println("\n");
        System.out.println("Het dubbel van " + y + " is " + dubbel_y );
        System.out.println("De helft van " + y + " is " + helft_y);
        System.out.println("Het kwadraat van " + y + " is " + kwadraat_y);
        System.out.println("De vierkantswortel van " + y + " is " + vierkantswortel_y);

    }
}