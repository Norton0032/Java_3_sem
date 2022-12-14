package four;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        if (args.length == 0) {
            System.out.println("Список аргументов командной строки пуст");
            return;
        }
        try {
            File directory = new File(args[0]);
            BufferedImage img = ImageIO.read(directory.listFiles()[0]);
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            frame.setSize(label.getPreferredSize());
            frame.add(label);
            frame.setVisible(true);
            while (true) {
                for (File file : directory.listFiles()) {
                    icon.setImage(ImageIO.read(file));
                    label.repaint();
                    Thread.sleep(50);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
