package Client;

import App.Translator;
import App.ImageTranslator;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

public class ImageClient {

    public static void launch() {
        JFrame frame = new JFrame("Image to ASCII Art");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Top panel: File chooser button
        JPanel topPanel = new JPanel();
        JButton chooseImageButton = new JButton("Choose Image");
        topPanel.add(chooseImageButton);

        // Output area
        JTextArea outputArea = new JTextArea();
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 8));
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Translator instance
        Translator<BufferedImage> imageTranslator = new ImageTranslator();

        // Button action
        ActionListener chooseImageAction = e -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(frame);

            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try {
                    BufferedImage image = ImageIO.read(selectedFile);
                    List<String> asciiArt = imageTranslator.translate(image);
                    outputArea.setText(String.join("\n", asciiArt));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Failed to load image: " + ex.getMessage());
                }
            }
        };
        chooseImageButton.addActionListener(chooseImageAction);

        SwingUtilities.invokeLater(() -> frame.setVisible(true));
    }
}
