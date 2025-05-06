import Client.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] options = { "Text", "Image" };
        int choice = JOptionPane.showOptionDialog(
                null,
                "Choose translator mode",
                "Startup",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        if (choice == 0) {
            TextClient.launch();
        } else if (choice == 1) {
            ImageClient.launch();
        } else {
            System.exit(0); 
        }
    }
}
