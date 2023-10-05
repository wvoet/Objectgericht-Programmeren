public class Oef02 {
    public static void main(String[] args) {
    for (int i = 0; i<129; i ++){
        System.out.println(i + "..." + getAscii(i) + "***\t" + getType(getAscii(i)));
    }
    }
    public static char getAscii(int asciiValue) {
        return (char) asciiValue;
    }
    public static String getType(char val) {
        if (Character.isLowerCase(val)) {
            return "kleine letter";
        }
        if (Character.isUpperCase(val)) {
            return "Hoofdletter";
        }
        if (Character.isDigit(val)) {
            return "Cijfer";
        }
        if (Character.isWhitespace(val)) {
            return "Blanco";
        }
        else {return "None";}

    }
}

