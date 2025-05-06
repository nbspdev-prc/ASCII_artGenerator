package App;

import java.util.ArrayList;
import java.util.List;

public class TextTranslator implements Translator<String> {
    private static final int CHAR_HEIGHT = 6;

    @Override
    public List<String> translate(String text) {
        text = text.toUpperCase();
        List<String> result = new ArrayList<>();
        for (int line = 0; line < CHAR_HEIGHT; line++) {
            StringBuilder sb = new StringBuilder();
            for (char c : text.toCharArray()) {
                String[] asciiChar = FontTable.getAsciiArt(c);
                sb.append(asciiChar[line]);
            }
            result.add(sb.toString());
        }
        return result;
    }
}
