package App;
import java.util.HashMap;
import java.util.Map;

public class FontTable {
        private static final Map<Character, String[]> asciiArtTable = new HashMap<>();
        static {
                asciiArtTable.put('A', new String[]{
                        " █████╗ ",
                        "██╔══██╗",
                        "███████║",
                        "██╔══██║",
                        "██║  ██║",
                        "╚═╝  ╚═╝"
                });

                asciiArtTable.put('B', new String[]{
                        "██████╗ ",
                        "██╔══██╗",
                        "██████╔╝",
                        "██╔══██╗",
                        "██████╔╝",
                        "╚═════╝ "
                });

                asciiArtTable.put('C', new String[]{
                        "██████╗ ",
                        "██╔════╝",
                        "██║     ",
                        "██║     ",
                        "╚██████╗",
                        " ╚═════╝"
                });
                asciiArtTable.put('D', new String[]{
                        "██████╗ ",
                        "██╔══██╗",
                        "██║  ██║",
                        "██║  ██║",
                        "██████╔╝",
                        "╚═════╝ "
                });

                asciiArtTable.put('E', new String[]{
                        "███████╗",
                        "██╔════╝",
                        "█████╗  ",
                        "██╔══╝  ",
                        "███████╗",
                        "╚══════╝"
                }); 


                asciiArtTable.put('F', new String[]{
                        "███████╗",
                        "██╔════╝",
                        "█████╗  ",
                        "██╔══╝  ",
                        "██║     ",
                        "╚═╝     "
                });

                asciiArtTable.put('G', new String[]{
                        "██████╗  ",
                        "██╔════╝ ",
                        "██║  ███╗",
                        "██║   ██║",
                        "╚██████╔╝",
                        " ╚═════╝ "
                });

                asciiArtTable.put('H', new String[]{
                        "██╗  ██╗",
                        "██║  ██║",
                        "███████║",
                        "██╔══██║",
                        "██║  ██║",
                        "╚═╝  ╚═╝"
                });

                asciiArtTable.put('I', new String[]{
                        "██╗",
                        "██║",
                        "██║",
                        "██║",
                        "██║",
                        "╚═╝"
                });

                asciiArtTable.put('J', new String[]{
                        "     ██╗",
                        "     ██║",
                        "     ██║",
                        "██   ██║",
                        "╚█████╔╝",
                        " ╚════╝ "
                });

                asciiArtTable.put('K', new String[]{
                        "██╗  ██╗",
                        "██║ ██╔╝",
                        "█████╔╝ ",
                        "██╔═██╗ ",
                        "██║  ██╗",
                        "╚═╝  ╚═╝"
                });

                asciiArtTable.put('L', new String[]{
                        "██╗     ",
                        "██║     ",
                        "██║     ",
                        "██║     ",
                        "███████╗",
                        "╚══════╝"
                });

                asciiArtTable.put('M', new String[]{
                        "███╗   ███╗",
                        "████╗ ████║",
                        "██╔████╔██║",
                        "██║╚██╔╝██║",
                        "██║ ╚═╝ ██║",
                        "╚═╝     ╚═╝"
                });

                asciiArtTable.put('N', new String[]{
                        "███╗   ██╗",
                        "████╗  ██║",
                        "██╔██╗ ██║",
                        "██║╚██╗██║",
                        "██║ ╚████║",
                        "╚═╝  ╚═══╝"
                });


                asciiArtTable.put('O', new String[]{
                        " ██████╗ ",
                        "██╔═══██╗",
                        "██║   ██║",
                        "██║   ██║",
                        "╚██████╔╝",
                        " ╚═════╝ "
                });

                asciiArtTable.put('P', new String[]{
                        "██████╗ ",
                        "██╔══██╗",
                        "██████╔╝",
                        "██╔═══╝ ",
                        "██║     ",
                        "╚═╝     "
                });

                asciiArtTable.put('Q', new String[]{
                        " ██████╗ ",
                        "██╔═══██╗",
                        "██║   ██║",
                        "██║ ▄ ██║",
                        "╚██████╔╝",
                        " ╚════█║ "
                });

                asciiArtTable.put('R', new String[]{
                        "██████╗ ",
                        "██╔══██╗",
                        "██████╔╝",
                        "██╔══██╗",
                        "██║  ██║",
                        "╚═╝  ╚═╝"
                });

                asciiArtTable.put('S', new String[]{
                        "██████╗ ",
                        "██╔════╝",
                        "╚█████╗ ",
                        " ╚═══██╗",
                        "██████╔╝",
                        "╚═════╝ "
                });

                asciiArtTable.put('T', new String[]{
                        "████████╗",
                        "╚══██╔══╝",
                        "   ██║   ",
                        "   ██║   ",
                        "   ██║   ",
                        "   ╚═╝   "
                });

                asciiArtTable.put('U', new String[]{
                        "██╗   ██╗",
                        "██║   ██║",
                        "██║   ██║",
                        "██║   ██║",
                        "╚██████╔╝",
                        " ╚═════╝ "
                });

                asciiArtTable.put('V', new String[]{
                        "██╗   ██╗",
                        "██║   ██║",
                        "██║   ██║",
                        "╚██╗ ██╔╝",
                        " ╚████╔╝ ",
                        "  ╚═══╝  "
                });

                asciiArtTable.put('W', new String[]{
                        "██╗    ██╗",
                        "██║    ██║",
                        "██║ █╗ ██║",
                        "██║███╗██║",
                        "╚███╔███╔╝",
                        " ╚══╝╚══╝ "
                });

                asciiArtTable.put('X', new String[]{
                        "██╗  ██╗",
                        "╚██╗██╔╝",
                        " ╚███╔╝ ",
                        " ██╔██╗ ",
                        "██╔╝ ██╗",
                        "╚═╝  ╚═╝"
                });

                asciiArtTable.put('Y', new String[]{
                        "██╗   ██╗",
                        "╚██╗ ██╔╝",
                        " ╚████╔╝ ",
                        "  ╚██╔╝  ",
                        "   ██║   ",
                        "   ╚═╝   "
                });

                asciiArtTable.put('Z', new String[]{
                        "███████╗",
                        "╚══███╔╝",
                        "  ███╔╝ ",
                        " ███╔╝  ",
                        "███████╗",
                        "╚══════╝"
                });

                asciiArtTable.put('.', new String[]{
                        "   ",
                        "   ",
                        "   ",
                        "   ",
                        "██╗",
                        "╚═╝"
                });

                asciiArtTable.put(' ', new String[]{
                        "    ",
                        "    ",
                        "    ",
                        "    ",
                        "    ",
                        "    "
                });

                asciiArtTable.put(',', new String[]{
                        "   ",
                        "   ",
                        "   ",
                        "   ",
                        "██╗",
                        "╚█║",
                        " ╚╝"
                });

                asciiArtTable.put('!', new String[]{
                        "██╗",
                        "██║",
                        "██║",
                        "╚═╝",
                        "██╗",
                        "╚═╝"
                });

                asciiArtTable.put('?', new String[]{
                        "██████╗ ",
                        "╚════██╗",
                        "  ▄███╔╝",
                        "  ╚═══╝ ",
                        "  ██╗   ",
                        "  ╚═╝   "
                });

                asciiArtTable.put(':', new String[]{
                        "   ",
                        "██╗",
                        "╚═╝",
                        "   ",
                        "██╗",
                        "╚═╝"
                });

                asciiArtTable.put(';', new String[]{
                        "██╗",
                        "╚═╝",
                        "   ",
                        "██╗",
                        "╚█║",
                        " ╚╝"
                });

                asciiArtTable.put('-', new String[]{
                        "         ",
                        "         ",
                        "███████╗",
                        "╚══════╝",
                        "         ",
                        "         "
                });

                asciiArtTable.put('_', new String[]{
                        "         ",
                        "         ",
                        "         ",
                        "         ",
                        "███████╗",
                        "╚══════╝"
                });

                asciiArtTable.put('0', new String[]{
                        " █████╗  ",
                        "██╔═══██╗",
                        "██║   ██║",
                        "██║   ██║",
                        "╚██████╔╝",
                        " ╚═════╝ "
                });

                asciiArtTable.put('1', new String[]{
                        " ██╗",
                        "███║",
                        "╚██║",
                        " ██║",
                        " ██║",
                        " ╚═╝"
                });

                asciiArtTable.put('2', new String[]{
                        " ██████╗",
                        "╚════██╗",
                        " █████╔╝",
                        "██╔═══╝ ",
                        "███████╗",
                        "╚══════╝"
                });

                asciiArtTable.put('3', new String[]{
                        " ██████╗",
                        "╚════██╗",
                        " █████╔╝",
                        " ╚═══██╗",
                        " █████╔╝",
                        " ╚═════╝"
                });

                asciiArtTable.put('4', new String[]{
                        "██╗  ██╗",
                        "██║  ██║",
                        "███████║",
                        "╚════██║",
                        "     ██║",
                        "     ╚═╝"
                });

                asciiArtTable.put('5', new String[]{
                        "███████╗",
                        "██╔════╝",
                        "██████╗ ",
                        "╚═══██╗ ",
                        "██████╔╝",
                        "╚═════╝ "
                });

                asciiArtTable.put('6', new String[]{
                        " ██████╗ ",
                        "██╔════╝ ",
                        "██████╗  ",
                        "██╔═══██╗",
                        "╚██████╔╝",
                        " ╚═════╝ "
                });

                asciiArtTable.put('7', new String[]{
                        "███████╗",
                        "╚════██║",
                        "    ██╔╝",
                        "   ██╔╝ ",
                        "   ██║  ",
                        "   ╚═╝  "
                });

                asciiArtTable.put('8', new String[]{
                        " ██████╗ ",
                        "██╔═══██╗",
                        "╚██████╔╝",
                        "██╔═══██╗",
                        "╚██████╔╝",
                        " ╚═════╝ "
                });

                asciiArtTable.put('9', new String[]{
                        " █████╗ ",
                        "██╔══██╗",
                        "███████║",
                        "╚═══██║ ",
                        "████╔═╝ ",
                        "╚════╝  "
                });
        }


        public static String[] getAsciiArt(char letter) {
                // Returns the ASCII art representation of the given character.
                // If the character is not found, throw an exception.
                if (!asciiArtTable.containsKey(letter)) {
                        throw new IllegalArgumentException("ASCII art not found for character: '" + letter + "'");
                }
                return asciiArtTable.get(letter);
        }
}