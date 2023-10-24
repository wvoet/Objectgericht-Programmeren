public class Oef05 {
    /*
    De 0de macht van 2.0 is 1.0
    De 1de macht van 2.0 is 2.0
    De 2de macht van 2.0 is 4.0
    ...
    De 10de macht van 2.0 is 1024.0
     */
    public static void main(String[] args) {
        /*
        power en number kunnen aangepast worden:
        number is het getal waar de macht op wordt uitgevoerd
        power is de macht waartoe het getal verheven wordt
         */
        int power = 9999;
        double number = 7.0;
        if (power > 20) {power = 21; System.out.println("Maximale macht van dit programma is 20. De ingegeven macht wordt veranderd naar 20");}
        //Power op 21 zodat 20 ook inbegrepen wordt
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
        for (int i = 1; i < (power); i ++) {
            answer = answer * number;
        }
        return answer;
    }
}
