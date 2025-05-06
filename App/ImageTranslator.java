package App;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class ImageTranslator implements Translator<BufferedImage> {
    private static final String ASCII_CHARS = "@%#*+=-:. ";

    private BufferedImage resizeImage(BufferedImage originalImage, int newWidth) {
        int newHeight = (originalImage.getHeight() * newWidth) / originalImage.getWidth();
        Image tmp = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }

    private char mapGrayToChar(int gray) {
        int index = (gray * (ASCII_CHARS.length() - 1)) / 255;
        return ASCII_CHARS.charAt(index);
    }

    @Override
    public List<String> translate(BufferedImage inputImage) {
        BufferedImage image = resizeImage(inputImage, 100);
        List<String> result = new ArrayList<>();

        for (int y = 0; y < image.getHeight(); y++) {
            StringBuilder line = new StringBuilder();
            for (int x = 0; x < image.getWidth(); x++) {
                Color pixel = new Color(image.getRGB(x, y));
                int gray = (int)(0.299 * pixel.getRed() + 0.587 * pixel.getGreen() + 0.114 * pixel.getBlue());
                line.append(mapGrayToChar(gray));
            }
            result.add(line.toString());
        }

        return result;
    }
}
