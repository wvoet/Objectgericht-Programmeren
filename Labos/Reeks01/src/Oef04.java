public class Oef04 {
    /*
    De 0de macht van 2.0 is 1.0
    De 1de macht van 2.0 is 2.0
    De 2de macht van 2.0 is 4.0
    ...
    De 10de macht van 2.0 is 1024.0
     */
    public static void main(String[] args) {
        int power = 11;
        double number = 2.0;
        for ( int i = 0; i < power; i++) {
            if (i == 0) {
                System.out.println("De 0de macht van " + number +" is 1.0");
            }
            else {
                System.out.println("De " + i +"de macht van " + number +" is " + getPowerOfNumber(number,i));
            }

        }
    }
    public static double getPowerOfNumber(double number, int power) {
        double answer = number;
        for (int i = 1; i < power; i ++) {
            answer = answer * number;
        }
        return answer;
    }
}
