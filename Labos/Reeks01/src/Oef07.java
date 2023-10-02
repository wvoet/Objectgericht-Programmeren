public class Oef07 {
    public static void main(String[] args) {
        int dobbel1 = generateRandomInt(1,6);
        int dobbel2 = generateRandomInt(1,6);
        int max;
        int min;
        max = Math.max(dobbel1,dobbel2);
        min = Math.min(dobbel1, dobbel2);
        System.out.println("Onder- en bovengrens zijn " + min + " en " + max);
        int dobbel3 = 0;
        int count = 0;

        while (!((dobbel3 <= max) && (min <= dobbel3))) {
            dobbel3 = generateRandomInt(1,6);
            System.out.println("    (ik gooide "+ dobbel3 +")");
            count = (count + 1);
            }

        System.out.println("Er was/waren "+ count +" poging nodig om binnen de grenzen " + min + " en " + max + " te mikken.");
        }

    public static int generateRandomInt(int min, int max) {
        // Controleer of de opgegeven grenzen geldig zijn
        if (min > max) {
            throw new IllegalArgumentException("Minimaal moet kleiner zijn dan of gelijk zijn aan Maximaal");
        }

        // Genereer een willekeurig getal tussen 0 (inclusief) en 1 (exclusief)
        double randomDouble = Math.random();

        // Bereken het bereik van getallen tussen min (inclusief) en max (inclusief)
        int range = max - min + 1;

        // Genereer een willekeurig geheel getal binnen het opgegeven bereik en voeg min toe
        return (int) (randomDouble * range) + min;
    }

}
