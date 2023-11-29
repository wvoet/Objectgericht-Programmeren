public class Main {
    public static void main(String[] args) {
        char[][] matrix = {
                {'j', 'b', 'c', 'd', 'e'},
                {'f', 'a', 'h', 'i', 'j'},
                {'k', 'l', 'v', 'n', 'o'},
                {'p', 'q', 'r', 'a', 't'},
                {'u', 'v', 'w', 'x', 'y'}
        };

        String word = "java";
        findWord(matrix, word);
    }

    public static void findWord(char[][] matrix, String word) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Zoek het woord vanaf elk punt in alle 8 richtingen
                for (int direction = 0; direction < 8; direction++) {
                    int endRow = i, endCol = j;
                    int k;
                    for (k = 0; k < word.length(); k++) {
                        if (endRow < 0 || endRow >= rows || endCol < 0 || endCol >= cols ||
                                matrix[endRow][endCol] != word.charAt(k)) {
                            break;
                        }

                        // Beweeg in de huidige richting
                        switch (direction) {
                            case 0: // naar rechts
                                endCol++;
                                break;
                            case 1: // naar rechts onder
                                endRow++;
                                endCol++;
                                break;
                            case 2: // naar beneden
                                endRow++;
                                break;
                            case 3: // naar links onder
                                endRow++;
                                endCol--;
                                break;
                            case 4: // naar links
                                endCol--;
                                break;
                            case 5: // naar links boven
                                endRow--;
                                endCol--;
                                break;
                            case 6: // naar boven
                                endRow--;
                                break;
                            case 7: // naar rechts boven
                                endRow--;
                                endCol++;
                                break;
                        }
                    }

                    // Als het hele woord is gevonden, print dan de start- en eindposities
                    if (k == word.length()) {
                        System.out.println("Woord gevonden van (" + i + "," + j + ") naar (" + (endRow - 1) + "," + (endCol - 1) + ")");
                    }
                }
            }
        }
    }
}