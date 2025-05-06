package Client;

import App.TextTranslator;
import App.Translator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

public class TextClient {
    public static void launch() {
        JFrame frame = new JFrame("ASCII Art Translator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        JTextField inputField = new JTextField(30);
        JButton translateButton = new JButton("Translate");
        inputPanel.add(new JLabel("Enter text:"));
        inputPanel.add(inputField);
        inputPanel.add(translateButton);

        JTextArea outputArea = new JTextArea();
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        Translator<String> translator = new TextTranslator();

        ActionListener action = e -> {
            String inputText = inputField.getText();
            List<String> asciiArt = translator.translate(inputText);
            outputArea.setText(String.join("\n", asciiArt));
        };

        translateButton.addActionListener(action);
        inputField.addActionListener(action);

        SwingUtilities.invokeLater(() -> frame.setVisible(true));
    }
}
