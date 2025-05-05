package App;
import java.util.ArrayList;

public class Translator {
    private static final int CHAR_HEIGHT = 6;

    public ArrayList<String> translatingTask(String text) {
        // Create a full list of strings as the result of the given text.
        text = text.toUpperCase();
        ArrayList<String> res = new ArrayList<>();
        for (int line = 0; line < CHAR_HEIGHT; line++) {
            StringBuilder sb = new StringBuilder();
            for (char c : text.toCharArray()) {
                String[] asciiChar = FontTable.getAsciiArt(c);
                sb.append(asciiChar[line]);
            }
            res.add(sb.toString());
        }
        return res;
    }

    public void printer(String text) {
        // Print the given text.
        ArrayList<String> asciiArt = translatingTask(text);
        for (String line : asciiArt) {
            System.out.println(line);
        }
    }
}