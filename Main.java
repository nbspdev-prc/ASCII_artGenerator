import Client.*;
import javax.swing.*;
import java.awt.*;

public class Main {
    private static boolean isTextMode = true;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Translator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLayout(new BorderLayout());

            JPanel contentPanel = new JPanel(new BorderLayout());
            JButton switchButton = new JButton("Switch to Image Mode");

            JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
            topPanel.add(switchButton);

            frame.add(topPanel, BorderLayout.NORTH);
            frame.add(contentPanel, BorderLayout.CENTER);

            // Load initial mode
            contentPanel.add(TextClient.createPanel(), BorderLayout.CENTER);

            switchButton.addActionListener(e -> {
                contentPanel.removeAll();
                if (isTextMode) {
                    contentPanel.add(ImageClient.createPanel(frame), BorderLayout.CENTER);
                    switchButton.setText("Switch to Text Mode");
                } else {
                    contentPanel.add(TextClient.createPanel(), BorderLayout.CENTER);
                    switchButton.setText("Switch to Image Mode");
                }
                isTextMode = !isTextMode;
                contentPanel.revalidate();
                contentPanel.repaint();
            });

            frame.setVisible(true);
        });
    }
}
