import java.util.Random;
public class Oef01 {

    public static void main(String[] args) {
        int min = 10;
        int max = 20;
        int amount = 50;
        Random r = new Random();
        for (int i = 0; i < amount; i++) {
            int num = r.nextInt((max - min)) + min;
            System.out.println(num);
        }

    }
}
