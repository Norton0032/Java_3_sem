package _3;

import javax.swing.*;
import java.awt.*;

public class SettingsFrame extends JFrame {
    public SettingsFrame(){
        super("SettingsFrame");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(350,200);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        getContentPane().setBackground(Color.WHITE);

        Font mediumFont = new Font("Verdana", Font.PLAIN, 16);
        Font largeFont = new Font("Verdana", Font.PLAIN, 20);

        JButton leftButton = new JButton("Button 1");
        GridBagConstraints leftButtonConstraints = new GridBagConstraints();
        leftButtonConstraints.gridx = 0;
        leftButtonConstraints.gridy = 0;
        leftButtonConstraints.anchor = GridBagConstraints.LINE_START;
        leftButtonConstraints.insets = new Insets(10,50,10,10);
        add(leftButton, leftButtonConstraints);

        JButton rightButton = new JButton("Button 2");
        GridBagConstraints rightButtonConstraints = new GridBagConstraints();
        rightButtonConstraints.gridx = 1;
        rightButtonConstraints.gridy = 0;
        rightButtonConstraints.anchor = GridBagConstraints.LINE_END;
        rightButtonConstraints.insets = new Insets(10,10,10,50);
        add(rightButton, rightButtonConstraints);

        JTextArea textArea = new JTextArea("");
        GridBagConstraints textAreaConstraints = new GridBagConstraints();
        textAreaConstraints.gridx = 0;
        textAreaConstraints.gridy = 1;
        textAreaConstraints.gridwidth = 2;
        textAreaConstraints.anchor = GridBagConstraints.CENTER;
        textAreaConstraints.fill = GridBagConstraints.HORIZONTAL;
        textAreaConstraints.weightx = 0.7f;
        textAreaConstraints.insets = new Insets(20, 40, 10, 40);
        add(textArea, textAreaConstraints);

        leftButton.setFont(largeFont);
        leftButton.setBackground(Color.WHITE);
        leftButton.setBorder(BorderFactory.createLineBorder(Color.gray));

        rightButton.setFont(largeFont);
        rightButton.setBackground(Color.white);
        rightButton.setBorder(BorderFactory.createLineBorder(Color.gray));

        textArea.setBackground(Color.WHITE);
        textArea.setFont(mediumFont);
        textArea.setBorder(BorderFactory.createLineBorder(Color.black));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.WHITE);

        JMenu fileSubmenu = new JMenu("????????");
        fileSubmenu.setFont(mediumFont);

        JMenuItem saveItem = new JMenuItem("??????????????????");
        saveItem.setFont(mediumFont);
        fileSubmenu.add(saveItem);
        saveItem.setBackground(Color.WHITE);

        JMenuItem exitItem = new JMenuItem("??????????");
        exitItem.setFont(mediumFont);
        exitItem.setBackground(Color.WHITE);
        fileSubmenu.add(exitItem);

        JMenu editSubmenu = new JMenu("????????????");
        editSubmenu.setFont(mediumFont);

        JMenuItem copyItem = new JMenuItem("????????????????????");
        copyItem.setFont(mediumFont);
        copyItem.setBackground(Color.WHITE);
        editSubmenu.add(copyItem);

        JMenuItem cutItem = new JMenuItem("????????????????");
        cutItem.setFont(mediumFont);
        cutItem.setBackground(Color.WHITE);
        editSubmenu.add(cutItem);

        JMenuItem pasteItem = new JMenuItem("????????????????");
        pasteItem.setFont(mediumFont);
        pasteItem.setBackground(Color.WHITE);
        editSubmenu.add(pasteItem);

        JMenu menuHelp = new JMenu("????????????");
        menuHelp.setFont(mediumFont);

        menuBar.add(fileSubmenu);
        menuBar.add(editSubmenu);
        menuBar.add(menuHelp);

        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new SettingsFrame().setVisible(true));
    }
}
