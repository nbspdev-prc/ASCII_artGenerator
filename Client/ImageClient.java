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

    public static JPanel createPanel(JFrame parentFrame) {
        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel topPanel = new JPanel();
        JButton chooseImageButton = new JButton("Choose Image");
        topPanel.add(chooseImageButton);

        JTextArea outputArea = new JTextArea();
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 8));
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        Translator<BufferedImage> imageTranslator = new ImageTranslator();

        ActionListener chooseImageAction = e -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(parentFrame);

            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try {
                    BufferedImage image = ImageIO.read(selectedFile);
                    List<String> asciiArt = imageTranslator.translate(image);
                    outputArea.setText(String.join("\n", asciiArt));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(parentFrame, "Failed to load image: " + ex.getMessage());
                }
            }
        };
        chooseImageButton.addActionListener(chooseImageAction);

        return mainPanel;
    }

    public static void launch() {
        JFrame frame = new JFrame("Image to ASCII Art");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(createPanel(frame));
        frame.setVisible(true);
    }
}
