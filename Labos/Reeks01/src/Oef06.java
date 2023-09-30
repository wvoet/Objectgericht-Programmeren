public class Oef06 {
    public static void main(String[] args) {
        int min = 10;
        int max = 20;
        int amount = 50;
        for (int i = 0; i < amount; i++) {
            System.out.println(generateRandomInt(min, max));
        }

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
        int randomInt = (int) (randomDouble * range) + min;

        return randomInt;
    }
}
