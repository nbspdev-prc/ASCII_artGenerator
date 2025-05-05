import App.FontTable;
import App.Translator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Setup frame
        JFrame frame = new JFrame("ASCII Art Translator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Input panel
        JPanel inputPanel = new JPanel();
        JTextField inputField = new JTextField(30);
        JButton translateButton = new JButton("Translate");
        inputPanel.add(new JLabel("Enter text:"));
        inputPanel.add(inputField);
        inputPanel.add(translateButton);

        // Output area
        JTextArea outputArea = new JTextArea();
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Translator instance
        Translator translator = new Translator();

        // Button action
        translateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = inputField.getText();
                List<String> asciiArt = translator.translatingTask(inputText);
                outputArea.setText(String.join("\n", asciiArt));
            }
        });

        // Show GUI
        frame.setVisible(true);
    }
}
