
package thees.mn;

import javax.swing.*;

public class ThreesMN {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Threes");
        Game game = new Game();
        GamePanel panel = new GamePanel(game);

        frame.add(panel);
        frame.setSize(420, 460);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


