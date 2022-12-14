import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class main {
    public static void main(String[] args) {
        final int[] S = {0,0};
        JFrame frame = new JFrame("Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        JPanel p = new JPanel(new BorderLayout());
        p.setBackground(Color.PINK);
        p.setPreferredSize(new Dimension(500,500));
        JButton b = new JButton("AC Milan");
        b.setBounds(20,20,100,20);
        JButton b2 = new JButton("Real Madrid");
        b2.setBounds(150,20,120,20);
        JLabel l1 = new JLabel("Result: 0 X 0");
        l1.setBounds(100,50,300,30);
        JLabel l2 = new JLabel("Last Scorer: N/A");
        l2.setBounds(100,70,300,30);
        JLabel l3 = new JLabel("Winner: DRAW");
        l3.setBounds(100,90,300,30);
        JLabel l4 = new JLabel((""));
        b.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                S[0]++;
                l1.setText("Result: "+S[0]+" X "+S[1]);
                l2.setText("Last Scorer: AC Milan");
                if(S[0]>S[1]) l3.setText("Winner: AC Milan");
                else if(S[1]==S[0]) l3.setText("Winner: DRAW");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        b2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                S[1]++;
                l1.setText("Result: "+S[0]+" X "+S[1]);
                l2.setText("Last Scorer: Real Madrid");
                if(S[0]<S[1]) l3.setText("Winner: Real Madrid");
                else if(S[1]==S[0]) l3.setText("Winner: DRAW");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        p.add(b);
        p.add(b2);
        p.add(l1);
        p.add(l2);
        p.add(l3);
        p.add(l4);
        frame.getContentPane().add(p);
        frame.pack();
        frame.setVisible(true);
    }
}
