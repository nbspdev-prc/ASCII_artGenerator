package App;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class ImageTranslator implements Translator<BufferedImage> {
    private static final String ASCII_CHARS_DETAILED = "@$B%8WM#*oahkbdpqwmZO0QLCJUYXzcvunxrjft/|()1{}[]?-_+~<>i!lI;:,\"^`'. ";
    private static final String ASCII_CHARS= "@%#*+=-:. ";

    private BufferedImage resizeImage(BufferedImage originalImage, double scalePercent) {
        if (scalePercent >= 100.0) return originalImage;
        if (scalePercent <= 0.0) return new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);

        int newWidth = (int) (originalImage.getWidth() * scalePercent / 100.0);
        
        // Compensate for character aspect ratio (characters are taller than they are wide)
        double aspectCorrection = 0.5; // adjust based on your font if needed
        int newHeight = (int) (originalImage.getHeight() * scalePercent / 100.0 * aspectCorrection);

        Image temp = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(temp, 0, 0, null);
        g2d.dispose();
        return resized;
    }


    private char mapGrayToChar(int gray) {
        int index = (gray * (ASCII_CHARS.length() - 1)) / 255;
        return ASCII_CHARS.charAt(index);
    }

    @Override
    public List<String> translate(BufferedImage inputImage) {
        BufferedImage image = resizeImage(inputImage, 15);
        List<String> result = new ArrayList<>();

        for (int y = 0; y < image.getHeight(); y++) {
            StringBuilder line = new StringBuilder();
            for (int x = 0; x < image.getWidth(); x++) {
                Color pixel = new Color(image.getRGB(x, y));
                // int gray = Math.min(255, Math.max(0, (int)Math.round(
                //                     0.299 * pixel.getRed() +
                //                     0.587 * pixel.getGreen() +
                //                     0.114 * pixel.getBlue()
                //                 )));
                // int index = (gray * (ASCII_CHARS.length() - 1)) / 255;
                int index = (int)(0.299 * pixel.getRed() + 0.587 * pixel.getGreen() + 0.114 * pixel.getBlue());
                line.append(mapGrayToChar(index));
            }
            result.add(line.toString());
        }

        return result;
    }
}
