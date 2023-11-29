// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

/***
@author Wout Voet
 */

public class Geldzaken {
    public static void main(String[] args) {
        Persoon moeder = new Persoon("Barack, Obamna");
        Persoon zoon = new Persoon("Johny, Depp");
        Persoon dochter = new Persoon("Amber, Heard");
        moeder.zetOpRekening(5000, true);
        moeder.zetOpRekening(1000, false);
        System.out.println(moeder.toStr());
        System.out.println(zoon.toStr());
        System.out.print(dochter.toStr());
        }


    }
