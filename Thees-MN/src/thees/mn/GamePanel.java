
package thees.mn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel implements KeyListener {
    private Game game;

    public GamePanel(Game game) {
        this.game = game;
        setFocusable(true);
        addKeyListener(this);
    }

   
    private Color getTileColor(int value) {
        switch(value) {
            case 1: return new Color(0xEEE4DA);
            case 2: return new Color(0xEDE0C8);
            case 3: return new Color(0xF2B179);
            case 6: return new Color(0xF59563);
            case 12: return new Color(0xF67C5F);
            case 24: return new Color(0xF65E3B);
            case 48: return new Color(0xEDCF72);
            case 96: return new Color(0xEDCC61);
            case 192: return new Color(0xEDC850);
            case 384: return new Color(0xEDC53F);
            case 768: return new Color(0xEDC22E);
            default: return new Color(0xCDC1B4);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Tile[][] grid = game.getGrid();

        // Fond
        g.setColor(new Color(0xBBADA0));
        g.fillRect(0, 0, getWidth(), getHeight());

        // Dessin des tuiles
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int val = grid[i][j].getValue();
                g.setColor(getTileColor(val));
                g.fillRoundRect(j*100+10, i*100+10, 80, 80, 15, 15);

                if(val != 0){
                    g.setColor(val <= 3 ? new Color(0x776E65) : Color.WHITE);
                    g.setFont(new Font("Arial", Font.BOLD, 24));
                    String s = String.valueOf(val);
                    FontMetrics fm = g.getFontMetrics();
                    int x = j*100 + 10 + (80 - fm.stringWidth(s)) / 2;
                    int y = i*100 + 10 + ((80 - fm.getHeight()) / 2) + fm.getAscent();
                    g.drawString(s, x, y);
                }
            }
        }

       
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Score: " + game.getScore(), 10, 430);

        
        if(game.isGameOver()){
            g.setColor(new Color(255, 0, 0, 180)); // rouge transparent
            g.fillRect(0, 0, getWidth(), getHeight());
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", Font.BOLD, 40));
            FontMetrics fm = g.getFontMetrics();
            String msg = "GAME OVER";
            int x = (getWidth() - fm.stringWidth(msg)) / 2;
            int y = getHeight() / 2;
            g.drawString(msg, x, y);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(!game.isGameOver()){
            switch(e.getKeyCode()){
                case KeyEvent.VK_UP: game.move(Direction.UP); break;
                case KeyEvent.VK_DOWN: game.move(Direction.DOWN); break;
                case KeyEvent.VK_LEFT: game.move(Direction.LEFT); break;
                case KeyEvent.VK_RIGHT: game.move(Direction.RIGHT); break;
            }
        }
        repaint();
    }

    @Override public void keyTyped(KeyEvent e) {}
    @Override public void keyReleased(KeyEvent e) {}
}
