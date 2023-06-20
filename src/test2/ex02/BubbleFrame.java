package test2.ex02;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {

    public JLabel backgroundMap;

    public void BubbleFrame() {
        backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));

        setSize(1000, 640);
        setLayout(null);
        setLocationRelativeTo(null);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new BubbleFrame();
    }
}