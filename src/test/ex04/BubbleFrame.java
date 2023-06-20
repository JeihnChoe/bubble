package test.ex04;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

// main 쓰레드를 GUI 프로그램에서는 ui 쓰레드라고 부른다.
// main 쓰레드는 player의 좌표가 변경되면 새로 그림을 그린다.
public class BubbleFrame extends JFrame {

    private JLabel backgroundMap;
    private Player player;

    public BubbleFrame() {
        initObject();
        initSetting();
        initListener();
        setVisible(true);

    }

    private void initObject() {
        backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
        setContentPane(backgroundMap);

        player = new Player();
        add(player);

    }

    private void initSetting() {
        setSize(1000, 640);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void initListener() {

        new Thread(() -> {

        });

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());

                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    if (!player.isLeft()) {
                        player.left();
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    if (!player.isRight()) {
                        player.right();
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    if (!player.isUp()) {
                        player.up();
                    }
                }

                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    if (!player.isDown()) {
                        player.down();
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    player.setLeft(false);
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    player.setRight(false);
                }
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    player.setUp(false);
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    player.setDown(false);
                }
            }

        });
    }

    public static void main(String[] args) {
        new BubbleFrame();
    }
}
