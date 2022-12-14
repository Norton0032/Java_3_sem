package three;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Picture");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        if (args.length == 0) {
            System.out.println("Файл не найден");
            return;
        }
        try {
            BufferedImage img = ImageIO.read(new File(args[0]));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            frame.setSize(label.getPreferredSize());
            frame.add(label);
            frame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
