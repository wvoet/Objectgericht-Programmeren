public class Oef12 {

    public static void main(String[] args) {
        char letter = 'a'; // vul hier de letter a in
        // ... hier mogen eventueel berekeningen komen
        System.out.println("De ASCII-code van de letter " + letter + " is " + getAsciiValue(letter) );
        char hoofdletter = 'A';    // vul hier de letter A in
        // ... hier mogen eventueel berekeningen komen
        System.out.println("De ASCII-code van de hoofdletter " + hoofdletter + " is " + getAsciiValue(hoofdletter) );
        // ... hier mogen eventueel berekeningen komen
        System.out.println("Het verschil tussen de ASCII-codes is " + Math.abs(getAsciiValue(letter)- getAsciiValue(hoofdletter)));

        char letter2 = 'c';        // vul hier de letter c in
        // ... hier mogen eventueel berekeningen komen
        System.out.println("De ASCII-code van de letter " + letter2 + " is " + getAsciiValue(letter2) );
        // ... hier mogen eventueel berekeningen komen
        System.out.println("De positie van de letter " + letter2 + " in het alfabet is " + getAlphabetPlace(letter2)); //voer code in
        char cijfer = '1';         // vul hier het cijfer 1 in
        // ... hier mogen eventueel berekeningen komen
        System.out.println("De ASCII-code van het cijfer " + cijfer + " is " + getAsciiValue(cijfer)); //voer code in

        System.out.println("Alle ASCII-tekens :");
        for (int i = 0; i < 128; i++) {
            System.out.println(i + "..." + getAscii(i) +"***");
        }

    }
    public static int getAsciiValue(char character) {
        return (int) character;}
    public static int getAlphabetPlace(char character) {
        int number = getAsciiValue(character);
        return (int) number - 96;
    }
    public static char getAscii(int asciiValue) {
        return (char) asciiValue;
    }
}
